package AbstractInterface.AbstractOrnek;

public  class Car extends Vehicle{
    public Car(int id, String name, String model) {
        super(id, name, model);
    }

    @Override
    public void vehicleİnformation() {
        System.out.println("Brand : BMW , Model : 5.25");
    }
}
