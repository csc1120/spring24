package wk2;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;

public class HelloWorld extends Application {
    @Override
    public void start(Stage stage) {
        VBox pane = new VBox();
        Label label = new Label("Hello World!");
        label.setFont(new Font(40));
        pane.getChildren().add(label);
        pane.getChildren().add(new Label("Hello Universe"));
        pane.getChildren().addAll(new Button("Cut"), new Button("Copy"), new Button("Paste"));
        Scene scene = new Scene(pane);
        stage.setTitle("Welcome to JavaFX!");
        stage.setScene(scene);
        stage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}