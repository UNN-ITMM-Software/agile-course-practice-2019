package ru.unn.agile.complexnumbercalculator.view;

import ru.unn.agile.complexnumbercalculator.viewmodel.ViewModel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class CalculatorComplexNumbers {
    private JPanel mainPanel;
    private JPanel chooseOperationPanel;
    private JPanel enterDataPanel;
    private JPanel calculationPanel;
    private JLabel chooseLabel;
    private JComboBox operationsComboBox;
    private JLabel enterDataLabel;
    private JButton calculateButton;
    private JTextField firstReTextField;
    private JTextField firstImTextField;
    private JTextField secondReTextField;
    private JTextField secondImTextField;
    private JTextField degeeTextField;
    private JLabel fisrtReLabel;
    private JLabel fisrtImLabel;
    private JLabel secondReLabel;
    private JLabel secondImLabel;
    private JLabel degreeLabel;
    private JPanel errorPanel;
    private JLabel errorLabel;
    private JPanel calculatePanel;
    private JLabel resultTextLabel;
    private JLabel resultLabel;

    private ViewModel viewModel;

    public static void main(final String[] args) {
        JFrame frame = new JFrame("CalculatorComplexNumbers");
        frame.setContentPane(new CalculatorComplexNumbers(new ViewModel()).mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
        frame.setResizable(false);
    }

    private CalculatorComplexNumbers(final ViewModel viewModel){
        this.viewModel = viewModel;
        backBind();
        loadOperations();
        hideUnneedElements();
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bind();
                CalculatorComplexNumbers.this.viewModel.calculate();
                backBind();
            }
        });

        operationsComboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bind();
            }
        });

        KeyAdapter keyListener = new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                bind();
                CalculatorComplexNumbers.this.viewModel.processFields(e.getKeyCode());
                CalculatorComplexNumbers.this.viewModel.processInput();
                backBind();
            }
        };
        firstReTextField.addKeyListener(keyListener);
        firstImTextField.addKeyListener(keyListener);
        secondReTextField.addKeyListener(keyListener);
        secondImTextField.addKeyListener(keyListener);
    }

    private void loadOperations(){
        ViewModel.Operations[] operations = ViewModel.Operations.values();
        operationsComboBox.setModel(new JComboBox<>(operations).getModel());
    }

    private void hideUnneedElements(){
        if (!viewModel.isDegreeVisible())
        {
            degeeTextField.setVisible(false);
            degreeLabel.setVisible(false);
        }
        else{
            degeeTextField.setVisible(true);
            degreeLabel.setVisible(true);
        }
    }

    private void backBind(){
        calculateButton.setEnabled(viewModel.isCalculateButtonEnabled());
        resultLabel.setText(viewModel.getResult());
        errorLabel.setText(viewModel.getError());
    }

    private void bind(){
        viewModel.setFirstRe(firstReTextField.getText());
        viewModel.setFirstIm(firstImTextField.getText());
        viewModel.setSecondRe(secondReTextField.getText());
        viewModel.setSecondIm(secondImTextField.getText());

        viewModel.setOperations((ViewModel.Operations)operationsComboBox.getSelectedItem());
        CalculatorComplexNumbers.this.viewModel.processFields(0);
        hideUnneedElements();
    }

}