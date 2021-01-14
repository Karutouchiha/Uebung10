package main;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class Controller implements Initializable {
    DataBase DB = new DataBase();
    @FXML private TextField txtout;
    @FXML private TextArea txt_lPlate;
    @FXML private Button quicksearch;

    public void getVehicle(MouseEvent event) {
        Object node = event.getSource();
        Button btn = (Button)node;
        boolean qsearch=false;
        if (btn.equals(quicksearch))
        {
            qsearch=true;
        }
        ArrayList cars = DB.search("M",qsearch);
        System.out.print(cars.toString());
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        //txtout.setEditable(false);
    }
}
