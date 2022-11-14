package project.Controllers;

public class ControllerFactory {


    private ControllerFactory() {
    }


    public static Controller create(String s) {
        switch (s.toLowerCase()) {
            case "country":
                return new CountryController();
            case "city":
                return new CityController();
            case "airline":
                return new AirlineController();
            case "flight":
                return new FlightController();
        }
        return null;
    }
}
