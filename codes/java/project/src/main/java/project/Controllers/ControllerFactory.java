package project.Controllers;

public class ControllerFactory {

    private ControllerFactory() {
    }

    public static Controller create(String s) {
        switch (s.toLowerCase()) {
            case "countries":
                return new CountryController();
            case "cities":
                return new CityController();
            case "airlines":
                return new AirlineController();
            case "flights":
                return new FlightController();
        }
        return null;
    }
}
