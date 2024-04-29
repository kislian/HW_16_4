package service;

import vehicle.Vehicle;

public class ServiceStation {
    //можем передать в параметры метода любой объект
    //реализующий интерфейс ServiceStation
    public void check(Serviceable serviceable) {
        //вызываем метод check от того
        //аргумента объекта который пришёл
        //объект должен подддерживать интерфейс Serviceable
        //привязываем к методам которые не меняются а не к объектам
        // которые могут меняться
        serviceable.check();
    }
}
