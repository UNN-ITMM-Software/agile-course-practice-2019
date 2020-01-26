package ru.unn.agile.distancebetweenvector.view;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import ru.unn.agile.distancebetweenvector.viewmodel.ViewModel;

public class CalculateMetrics {
    @FXML
    private ViewModel viewModel;
    @FXML
    private TextField coordX;
    @FXML
    private TextField coordY;
    @FXML
    private TextField coordZ;
    @FXML
    private Button btnCalc;
    @FXML
    void initialize() {
        coordX.textProperty().bindBidirectional(viewModel.coordXProperty());
        coordY.textProperty().bindBidirectional(viewModel.coordYProperty());
        coordZ.textProperty().bindBidirectional(viewModel.coordZProperty());
        btnCalc.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(final ActionEvent event) {
                viewModel.calculate();
            }
        });
    }
}
