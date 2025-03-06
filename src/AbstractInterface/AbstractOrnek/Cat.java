package AbstractInterface.AbstractOrnek;

public class Cat extends Animal{
    public Cat(int id) {
        super(id);
    }

    @Override
    public void sound() {
        System.out.println("Miyav");
    }

    // Görüldüğü gibi bunu istersem kullanırım istemezsem kullanmam çünkü abstract olarak
    // İşaretlemedim..
    @Override
    public void animalName() {
        System.out.println("Cat");
    }
}
