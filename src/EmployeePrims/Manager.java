package EmployeePrims;

public class Manager  extends Employee{
    private int teamSize;

    // Constructor
    public Manager(int id, String name, double salary, String department, int teamSize) {
        super(id, name, salary, department);
        this.teamSize = teamSize;
    }

    // Getter ve Setter
    public int getTeamSize() {
        return teamSize;
    }

    public void setTeamSize(int teamSize) {
        this.teamSize = teamSize;
    }

    // Bonus hesaplama (Yöneticiler maaşlarının %20’sini prim olarak alır)
    @Override
    public double calculateBonus() {
        return getSalary() * 0.20; // Yöneticilerin primi maaşlarının %20'si
    }
}
