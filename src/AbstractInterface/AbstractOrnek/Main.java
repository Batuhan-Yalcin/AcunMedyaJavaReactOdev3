package AbstractInterface.AbstractOrnek;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat(1);
        cat.animalName();
        cat.sound();
        System.out.println("Cat Id : " +  cat.getId());
        System.out.println("**********************************");

        Vehicle car = new Car(1,"Otomobil","5.25");
        car.vehicleİnformation();

        //Mesela bu methodu Car classında kullanmadığım halde yinede Vehicle ı extends ettiğim için
        // Burada çağırabiliyorum..
        car.vehicleSound();
    }
}
