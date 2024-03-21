package Vehicle;

public class PrintNameOfCar {
    Vehicle[] cars;
    public PrintNameOfCar(Vehicle[] cars){
        this.cars = cars;
    }

    public String execute () {
        String name = "";

        for (int i = 0; i < cars.length; i++){
            Vehicle car = cars[i];
            if(i != cars.length - 1){
                name = name + car.getMark() + "-";
            } else {
                name = name + car.getMark();
            }
        }

        return name;
    }
}
