package me.ryan_s;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {
    private static Stage primaryStage;
    @Override
    public void start(Stage primaryStage) throws Exception{
        Main.primaryStage =primaryStage;
        Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("sample.fxml"));
        primaryStage.setTitle("Hello World");
        primaryStage.setScene(new Scene(root, 600, 500));
        primaryStage.show();
        primaryStage.setOnCloseRequest(v->System.exit(0));

    }


    public static Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
