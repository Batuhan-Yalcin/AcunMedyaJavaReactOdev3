package AbstractInterface.AbstractOrnek;

public abstract class Animal {
    private int id;
    public Animal(int id)
    {
       this.id = id;
    }
    public int getId()
    {
        return  id;
    }
    public void setId(int id)
    {
        this.id = id;
    }
    public abstract void sound();
    public void animalName()
    {
        System.out.println("Hayvan isimleri : ");
    }
}
