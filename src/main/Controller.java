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
    @FXML private TextField txt_lPlate;
    @FXML private TextArea txtout;
    @FXML private Button quicksearch;

    public void getVehicle(MouseEvent event) {
        Object node = event.getSource();
        Button btn = (Button)node;
        boolean qsearch=false;
        if (btn.equals(quicksearch))
        {
            qsearch=true;
        }
        ArrayList cars = DB.search(txt_lPlate.getText().toUpperCase(),qsearch);
        String txt="";
        if (cars.size()!=0 && !cars.contains(null)){
            for (int i=0;i<cars.size();i++){
                txt= txt + cars.get(i).toString();
            }
        }
        else {
            txt="car not found";
        }
        txtout.setText(txt);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        txtout.setEditable(false);
    }
}
