package AbstractInterface.InterfaceOrnek;

public class Main {
    public static void main(String[] args)
    {
        Bike bike = new Bike();
        bike.vehicleInformation();
        System.out.println("-----------------");
        // Görüldüğü gibi 2 Ayrı Classta 2 ayrı şekilde kullanmamızı sağladı Methodları..
        GarantiBank garanti = new GarantiBank();
        DenizBank deniz = new DenizBank();

        garanti.bankName();
        garanti.foundingDate();
        System.out.println("--------------------");
        deniz.bankName();
        deniz.foundingDate();
    }

}
