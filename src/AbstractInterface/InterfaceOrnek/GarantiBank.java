package AbstractInterface.InterfaceOrnek;

public class GarantiBank implements IBank {
    @Override
    public void bankName() {
        System.out.println("Garanti Bank");
    }

    @Override
    public void foundingDate() {
        System.out.println("28-12-1968");
    }
}
