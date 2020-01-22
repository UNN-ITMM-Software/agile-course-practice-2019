package ru.unn.agile.redblacktree.infrastructure;

import ru.unn.agile.redblacktree.viewmodel.ILogger;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class TxtLogger implements ILogger {
    private final String fileName;
    private BufferedWriter writer = null;

    public TxtLogger(final String filename) {
        this.fileName = filename;

        try {
            writer = new BufferedWriter(new FileWriter(filename));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Override
    public void addLog(String message) {
        final String formattedLog = timeNow() + " " + message;
        try {
            writer.write(formattedLog);
            writer.newLine();
            writer.flush();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<String> getLogMessages() {
        BufferedReader reader;
        ArrayList<String> logMessages = new ArrayList<>();

        try {
            reader = new BufferedReader(new FileReader(fileName));

            String line;
            while ((line = reader.readLine()) != null) {
                logMessages.add(line);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return logMessages;
    }

    private static String timeNow() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat dataFormat = new SimpleDateFormat();
        return dataFormat.format(cal.getTime());
    }

}
