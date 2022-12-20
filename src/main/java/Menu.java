import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public void createMenu() {
        Scanner scanner = new Scanner(System.in);
        int max_v = 0;
        String producer = "0";
        Vehicle.Type typ = Vehicle.Type.CAR;
        boolean exit = false;
        ArrayList<Vehicle> vehicles = new ArrayList<>();
        Logger logger = LogManager.getLogger();
        Vehicle a = new Vehicle("BMW", 220, Vehicle.Type.CAR);
        vehicles.add(a);
        Vehicle b = new Vehicle("SKODA", 200, Vehicle.Type.CAR);
        vehicles.add(b);
        Vehicle c = new Vehicle("FINCANTERI", 50, Vehicle.Type.SHIP);
        vehicles.add(c);
        Vehicle d = new Vehicle("IMABARI", 70, Vehicle.Type.SHIP);
        vehicles.add(d);
        Vehicle e = new Vehicle("AIRBUS", 600, Vehicle.Type.PLANE);
        vehicles.add(e);
        Vehicle f = new Vehicle("BOEING", 1000, Vehicle.Type.PLANE);
        vehicles.add(f);
        Vehicle g = new Vehicle("ROMET", 30, Vehicle.Type.BICYCLE);
        vehicles.add(g);
        Vehicle h = new Vehicle("PEGASUS", 45, Vehicle.Type.BICYCLE);
        vehicles.add(h);
        while (!exit) {
            logger.info("Wybierz jedną z opcji: CAR, SHIP, PLANE, BICYCLE, ALL, EXIT");
            String type = scanner.nextLine();
            switch (type) {
                case "CAR":
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getType() == Vehicle.Type.CAR && vehicles.get(i).getV_max() > max_v) {
                            max_v = vehicles.get(i).getV_max();
                            producer = vehicles.get(i).getProducer();
                        }
                    }
                    logger.info("Pojazd CAR " + "producenta:" + producer + " jest najszybszy, maksymalna prędkość to " + max_v);
                    max_v = 0;
                    break;
                case "SHIP":
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getType() == Vehicle.Type.SHIP && vehicles.get(i).getV_max() > max_v) {
                            max_v = vehicles.get(i).getV_max();
                            producer = vehicles.get(i).getProducer();
                        }
                    }
                    logger.info("Pojazd SHIP " + "producenta:" + producer + " jest najszybszy, maksymalna prędkość to " + max_v);
                    max_v = 0;
                    break;
                case "PLANE":
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getType() == Vehicle.Type.PLANE && vehicles.get(i).getV_max() > max_v) {
                            max_v = vehicles.get(i).getV_max();
                            producer = vehicles.get(i).getProducer();
                        }
                    }
                    logger.info("Pojazd PLANE " + "producenta:" + producer + " jest najszybszy, maksymalna prędkość to " + max_v);
                    max_v = 0;
                    break;
                case "BICYCLE":
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getType() == Vehicle.Type.BICYCLE && vehicles.get(i).getV_max() > max_v) {
                            max_v = vehicles.get(i).getV_max();
                            producer = vehicles.get(i).getProducer();
                        }
                    }
                    logger.info("Pojazd BICYCLE " + "producenta:" + producer + " jest najszybszy, maksymalna prędkość to " + max_v);
                    max_v = 0;
                    break;
                case "ALL":
                    for (int i = 0; i < vehicles.size(); i++) {
                        if (vehicles.get(i).getV_max() > max_v) {
                            max_v = vehicles.get(i).getV_max();
                            producer = vehicles.get(i).getProducer();
                            // typ= String.valueOf(vehicles.get(i).getType());
                            typ = vehicles.get(i).getType();
                        }
                    }
                    logger.info("Pojazd " + typ + " producenta:" + producer + " jest najszybszy, maksymalna prędkość to " + max_v);
                    max_v = 0;
                    break;
                case "EXIT":
                    exit = true;
                    break;
                default:
                    logger.error("Podaj prawidłową opcję");
                    break;

            }
        }
    }
}