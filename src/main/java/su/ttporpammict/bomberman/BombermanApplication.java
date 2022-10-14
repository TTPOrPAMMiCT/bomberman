package su.ttporpammict.bomberman;


import javafx.application.Application;

import javafx.stage.Stage;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import su.ttporpammict.bomberman.gui.controllers.MainWindowController;

@SpringBootApplication
public class BombermanApplication extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        MainWindowController mainWindowController = new MainWindowController();
        mainWindowController.createWindow(primaryStage);
    }
}
