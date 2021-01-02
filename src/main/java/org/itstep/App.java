package org.itstep;

import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        AnchorPane rootPane = FXMLLoader.load(new URL(pathToCard("blackjack.fxml")));
        Scene scene = new Scene(rootPane);
        stage.setScene(scene);
        stage.setTitle("Black Jack");
        stage.getIcons().add(new Image("icon.png"));
        stage.setResizable(false);
        stage.show();
    }

    private String pathToCard(String cardFilename) {
        if (cardFilename == null)
            return null;
        String[] parts = cardFilename.split("/");
        return App.class.getClassLoader().getResource(parts[0]) + (parts.length == 2 ? parts[1] : "");
    }

    public static void main(String[] args) throws URISyntaxException {
        launch();
    }

}