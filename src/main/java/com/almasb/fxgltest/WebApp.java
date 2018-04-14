package com.almasb.fxgltest;

import com.almasb.fxgl.app.GameApplication;
import com.jpro.webapi.JProApplication;
import javafx.stage.Stage;

public class WebApp extends JProApplication {

    @Override
    public void start(Stage stage) {
        System.setProperty("fxgl.isBrowser", "true");

        GameApplication app = new SampleGameApp();
        app.start(stage);
    }

    public static void main(String[] args) {
        launch(args);
    }
}