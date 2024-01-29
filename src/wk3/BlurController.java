package wk3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.effect.GaussianBlur;

public class BlurController {
    @FXML
    private Button toggleButton;
    @FXML
    private Label displayText;

    @FXML
    public void toggleBlur(ActionEvent actionEvent) {
        if(displayText.getEffect()==null) {
            toggleButton.setText("De-blur");
            displayText.setEffect(new GaussianBlur());
        } else {
            toggleButton.setText("Blur");
            displayText.setEffect(null);
        }
    }
}
