package vehicle;

public abstract class EngineVehicle extends Vehicle{
    public EngineVehicle(String modelName, int wheelsCount) {
        super(modelName, wheelsCount);
    }

    @Override
    public void check() {
        super.check();
        checkEngine();
    }
    private void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}

