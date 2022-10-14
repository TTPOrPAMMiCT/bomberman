package su.ttporpammict.bomberman.util.styleWindow;

import javafx.stage.Stage;
import org.springframework.stereotype.Component;

@Component
public class StyleWindow {

    public void setStyleWindow(Stage stage) {
        String stylesheet = getClass().getResource("/window/fxml/style/style.css").toExternalForm();
        System.out.println(stylesheet);
        stage.getScene().getStylesheets().add(stylesheet);
    }
}
