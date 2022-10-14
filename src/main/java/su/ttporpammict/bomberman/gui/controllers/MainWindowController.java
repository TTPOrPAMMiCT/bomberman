package su.ttporpammict.bomberman.gui.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import org.springframework.stereotype.Controller;
import su.ttporpammict.bomberman.loader.loadControllers.LoaderControllers;
import su.ttporpammict.bomberman.util.styleWindow.StyleWindow;

@Controller
public class MainWindowController implements SpringController {
    Stage mainWindowStage;


    @Override
    public void createWindow(Stage stage) {
        /*AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                SpringConfigurationApplication.class
        );*/
        stage.setTitle("Bomberman");
        stage.setScene(
                new Scene(
                        new LoaderControllers().load(getClass().getResource("/window/fxml/mainWindow.fxml"))
                )
        );
        stage.show();
    }
}
