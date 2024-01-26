package wk2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class Teenager extends Application {
    private Label response;
    public static final int HEIGHT = 200;
    public static final int WIDTH = 300;
    @Override
    public void start(Stage stage) {
        response = new Label();
        TextField input = new TextField();
        Button clear = new Button("Clear");
        Pane pane = new FlowPane();
        pane.getChildren().addAll(new Label("Please enter your age: "),
        input, response, clear);
        input.setOnAction(actionEvent -> handleInputField(actionEvent));
        clear.setOnAction(this::clearPressed);
        stage.setScene(new Scene(pane, WIDTH, HEIGHT));
        stage.show();
    }

    private void handleInputField(ActionEvent actionEvent) {
        String text = ((TextField) actionEvent.getSource()).getText();
        int age = Integer.parseInt(text);
        String not = "";
        if (age < 13 || age > 19) {
            not = "not ";
        }
        response.setText("You are " + not + "a teenager.");
    }

    private void clearPressed(ActionEvent actionEvent) {
        response.setText("");
    }
}