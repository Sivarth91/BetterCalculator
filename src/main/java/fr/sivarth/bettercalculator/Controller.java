package fr.sivarth.bettercalculator;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * @author Sivarth
 */
public class Controller implements Initializable {

    @FXML
    private TextField textField;

    @FXML
    private Button zero;

    @FXML
    private Button one;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private Button four;

    @FXML
    private Button five;

    @FXML
    private Button six;

    @FXML
    private Button seven;

    @FXML
    private Button eight;

    @FXML
    private Button nine;

    @FXML
    private Button add;

    @FXML
    private Button minus;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button minusSign;

    @FXML
    private Button equal;

    @FXML
    private Button pi;

    @FXML
    private Button coma;

    @FXML
    private Button delete;


    Float data = 0f;
    int operation = -1;

    /**
     *
     * @param event
     */

    @FXML
    public void buildExpression(ActionEvent event) {

        // afficher the numbers
        if (event.getSource() == one) {
            textField.setText(textField.getText() + "1");
        }

        if (event.getSource() == two) {
            textField.setText(textField.getText() + "2");
        }

        if (event.getSource() == three) {
            textField.setText(textField.getText() + "3");
        }

        if (event.getSource() == four) {
            textField.setText(textField.getText() + "4");
        }

        if (event.getSource() == five) {
            textField.setText(textField.getText() + "5");
        }

        if (event.getSource() == six) {
            textField.setText(textField.getText() + "6");
        }

        if (event.getSource() == seven) {
            textField.setText(textField.getText() + "7");
        }

        if (event.getSource() == eight) {
            textField.setText(textField.getText() + "8");
        }

        if (event.getSource() == nine) {
            textField.setText(textField.getText() + "9");
        }

        if (event.getSource() == zero) {
            textField.setText(textField.getText() + "0");
        }

        if (event.getSource() == minusSign) {
            textField.setText("-" + textField.getText());
        }

        if (event.getSource() == pi) {
            textField.setText(textField.getText() + "3.14159265359");
        }

        if (event.getSource() == coma) {
            textField.setText(textField.getText() + ".");
        }

        // delete all the text
        if (event.getSource() == delete) {
            textField.setText("");
        }

        // operations
        if (event.getSource() == add) {
            data = Float.parseFloat(textField.getText());
            operation = 1; // number of the operation
            textField.setText("");
        }

        if (event.getSource() == minus) {
            data = Float.parseFloat(textField.getText());
            operation = 2;
            textField.setText("");
        }

        if (event.getSource() == multiply) {
            data = Float.parseFloat(textField.getText());
            operation = 3;
            textField.setText("");
        }

        if (event.getSource() == divide) {
            data = Float.parseFloat(textField.getText());
            operation = 4;
            textField.setText("");
        }

        // resolve operation
        if (event.getSource() == equal) {
            Float secondOperator = Float.parseFloat(textField.getText());

            switch (operation) {
                case 1:
                    Float answer = data + secondOperator;
                    textField.setText(String.valueOf(answer));
                    break;
                case 2:
                    answer = data - secondOperator;
                    textField.setText(String.valueOf(answer));
                    break;
                case 3:
                    answer = data * secondOperator;
                    textField.setText(String.valueOf(answer));
                    break;
                case 4:
                    try {
                        answer = data / secondOperator;
                        textField.setText(String.valueOf(answer));
                    } catch (Exception e) {
                        textField.setText("divison error");
                    }
                    break;
                case 5:
                    answer = data * (secondOperator / 100);
                    textField.setText(String.valueOf(answer));
                    break;
                default:
                    break;
            }

        }


    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {}

}
