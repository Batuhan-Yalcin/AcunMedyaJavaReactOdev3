package AbstractInterface.InterfaceOrnek;

public class DenizBank implements IBank {
    @Override
    public void bankName() {
        System.out.println("Deniz Bank");
    }

    @Override
    public void foundingDate() {
        System.out.println("25-05-1981");
    }
}
