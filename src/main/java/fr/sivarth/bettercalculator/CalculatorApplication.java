package fr.sivarth.bettercalculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.io.IOException;

public class CalculatorApplication extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(CalculatorApplication.class.getResource("app-view.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 300, 570, Color.BLACK);
            Image ico = new Image("C:\\Users\\sivau\\Documents\\Dev\\BetterCalculator\\images\\app\\logo.png");
            stage.setTitle("BetterCalculator");
            stage.getIcons().add(ico);
            stage.setScene(scene);
            stage.setResizable(true);
            stage.show();

            System.out.println("CalculatorApplication is running !");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch();
    }

}
