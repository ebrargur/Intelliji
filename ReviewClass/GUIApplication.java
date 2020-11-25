package com.company.ReviewClass;
import javafx.stage.Stage;

import javax.application.Application;

public class GUIApplication extends Application  {
    public static void main(String[] args) {
launch();
    }
    public void start(Stage primaryStage) throws Exception
    {

        primaryStage.setTitle("My first graphic app");
        primaryStage.show();
    }
}
