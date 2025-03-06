package AbstractInterface.AbstractOrnek;

public abstract class Vehicle {
    private int id;
    private String name;
    private String model;

    public Vehicle(int id,String name,String model)
    {
        this.id = id;
        this.name = name;
        this.model = model;
    }

    public abstract void vehicleİnformation();
    public void vehicleSound(){

    }
}
