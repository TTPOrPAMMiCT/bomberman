package su.ttporpammict.bomberman.gui.controllers;


import javafx.stage.Stage;
import org.springframework.stereotype.Controller;

import javax.annotation.PostConstruct;

@Controller
public interface SpringController {
    @PostConstruct
    void createWindow();
    @PostConstruct
    void propertyWindow();
}
