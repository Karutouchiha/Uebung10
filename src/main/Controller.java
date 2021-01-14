package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.net.URL;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    DataBase DB = new DataBase();
    @FXML
    private TextField txtout;
    @FXML private TextArea txt_lPlate;
    @FXML private Button quicksearch;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtout.setEditable(false);
    }
}
