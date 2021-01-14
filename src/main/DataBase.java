package main;

import java.util.ArrayList;
import java.util.HashMap;

public class DataBase {

    private HashMap<String,Vehicle> CarDB = new HashMap();
    private MagicGenerator generator = new MagicGenerator();

    DataBase() {
        for (int i = 0; i < 20; i++) {
            String manufacturer = generator.getRandomManufacturer();
            String licencePlate = generator.getRandomLicencePlate();
            Vehicle v = new Vehicle(generator.getRandomColor(), generator.getRandomName(), manufacturer, generator.getRandomModel(manufacturer), licencePlate);
            CarDB.put(licencePlate, v);
            System.out.print("Licence Plate:" + licencePlate);
        }
    }
    public ArrayList<Vehicle> search(String licencePlate, boolean exact){
        ArrayList<Vehicle> car = new ArrayList();
        if (exact){
            try {
                car.add(CarDB.get(licencePlate));
            }
            catch (Exception x){
                return null;
            }
        }
        else {
            for (int i=0; i < CarDB.size(); i++) {
                if (CarDB.keySet().contains(licencePlate)) {
                    car.add(CarDB.get(CarDB.keySet()));
                }
            }
        }
        return car;
    }
}
