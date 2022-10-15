package su.ttporpammict.bomberman.gui.controllers;

import javafx.scene.Scene;
import javafx.stage.Stage;
import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.stereotype.Controller;
import su.ttporpammict.bomberman.gui.controllers.springStage.SpringStage;
import su.ttporpammict.bomberman.loader.loadControllers.ConfigurationLoader;
import su.ttporpammict.bomberman.loader.loadControllers.LoaderControllers;

import javax.annotation.PostConstruct;

@Controller
@Getter
@Setter
public class MainWindowController implements SpringController {
    Stage mainWindowStage;

    public MainWindowController(SpringStage stage) {
        this.mainWindowStage = stage;
    }

    @Override
    public void createWindow() {
        mainWindowStage.setTitle("Bomberman");
        mainWindowStage.setScene(
                new Scene(
                        new LoaderControllers().load(getClass().getResource("/window/fxml/mainWindow.fxml"))
                )
        );
        mainWindowStage.show();
        setMainWindowStage(mainWindowStage);
    }

    @Override
    public void propertyWindow() {
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
                ConfigurationLoader.class
        );
    }
}
