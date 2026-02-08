package com.example.uebungsprojekt;

import com.example.uebungsprojekt.AutoArea.Autohändler;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Autohändler autohändler = new Autohändler();
        autohändler.printModelle();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/uebungsprojekt/hello-view.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.setTitle("Meine erste JavaFX App");
        stage.show();
    }

    public static void main(String[] args) {
        launch();

    }
}