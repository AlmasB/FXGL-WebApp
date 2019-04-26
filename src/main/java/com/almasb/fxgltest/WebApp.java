package com.almasb.fxgltest;

import com.almasb.fxgl.app.GameApplication;
import com.jpro.webapi.JProApplication;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

public class WebApp extends JProApplication {

    @Override
    public void start(Stage stage) {
        System.setProperty("fxgl.isBrowser", "true");

        stage.setScene(new Scene(new Pane(), 800, 600));
        stage.show();

        //GameApplication app = new SampleGameApp();
        //GameApplication.customLaunch(app, stage);
    }

    public static void main(String[] args) {
        System.out.println("Helloooooooooooooooooooooooooooooooooooooo");
        launch(args);
    }
}
