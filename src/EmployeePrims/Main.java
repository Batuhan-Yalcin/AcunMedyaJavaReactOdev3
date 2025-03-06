package EmployeePrims;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager(1, "Batuhan Yalçın", 58000, "IT", 10);
        Developer developer = new Developer(2, "Muhammed İnan", 75000, "IT", "Java Developer");


        System.out.println("Manager's Bonus: " + manager.calculateBonus());
        System.out.println("Developer's Bonus: " + developer.calculateBonus());

    }
}