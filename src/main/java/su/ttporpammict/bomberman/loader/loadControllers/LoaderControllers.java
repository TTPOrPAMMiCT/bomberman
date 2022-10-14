package su.ttporpammict.bomberman.loader.loadControllers;

import javafx.fxml.FXMLLoader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;

@Component
public class LoaderControllers {

    private static final ApplicationContext applicationContext = new AnnotationConfigApplicationContext(
      ConfigurationLoader.class
    );

    public <T> T load(URL url) {
        try {
            FXMLLoader loader = new FXMLLoader(url);
            loader.setControllerFactory(applicationContext::getBean);
            return loader.load();
        } catch (Exception ioException) {
            throw new RuntimeException(ioException);
        }
    }
}
