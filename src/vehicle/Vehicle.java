package vehicle;

import service.Serviceable;
//Все объекты класса Vehicle, подврегаются обслуживанию
public abstract class Vehicle implements Serviceable {
    private final String modelName;
    private final int wheelsCount;

    protected Vehicle(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }

    public int getWheelsCount() {
        return wheelsCount;
    }

    //заложили общее для всех наследников
    //обслуживание колёс
    @Override
    public void check() {
        System.out.println("Обслуживаем " + modelName);
        for (int i = 0; i < getWheelsCount(); i++) {
            updateTyre();
            System.out.println((i + 1) + "-го" + " колеса");

        }
    }

    private void updateTyre() {
        System.out.print("Меняем покрышку :");

    }
}
