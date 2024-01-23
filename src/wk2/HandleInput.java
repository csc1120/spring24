package wk2;

import javafx.event.ActionEvent;
import javafx.scene.control.TextField;
import javafx.event.EventHandler;

public class HandleInput implements EventHandler<ActionEvent> {
    private Teenager dumb;

    public HandleInput(Teenager ugly) {
        dumb = ugly;
    }

    @Override
    public void handle(ActionEvent actionEvent) {
        String text = ((TextField)actionEvent.getSource()).getText();
        int age = Integer.parseInt(text);
        String not = "";
        if(age<13 || age>19) {
            not = "not ";
        }
        Teenager stupid = dumb;
        //stupid.response.setText("You are " + not + "a teenager.");
    }
}
