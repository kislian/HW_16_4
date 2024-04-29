import service.ServiceStation;
import vehicle.Bicycle;
import vehicle.Car;
import vehicle.Truck;
import vehicle.Vehicle;


public class Main {
    public static void main(String[] args) {
     ServiceStation  serviceStation=new ServiceStation();
        Vehicle [] vehicles=new Vehicle[6];
        vehicles[0] = new Truck("МАЗ", 8);
        vehicles[1] = new Truck("УРАЛ", 6);
        vehicles[2] = new Car("Калина", 4);
        vehicles[3] = new Car("УАЗ", 4);
        vehicles[4] = new Bicycle("Урал", 2);
        vehicles[5] = new Bicycle("Кама", 2);
   // В check ожидается интерфейс Serviceable
   //Truck является наследником класса Vehicle,
   //который реализует    интерфейс Serviceable
        for (int i = 0; i < vehicles.length; i++) {
          Vehicle vehicle= vehicles[i];
            serviceStation.check(vehicle);
        }
    }
}