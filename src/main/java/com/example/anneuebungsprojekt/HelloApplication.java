package com.example.anneuebungsprojekt;

import com.example.anneuebungsprojekt.AutoArea.Autohändler;
import javafx.application.Application;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Autohändler autohändler = new Autohändler();
        autohändler.printModelle();
    }

    public static void main(String[] args) {
        launch();
    }
}