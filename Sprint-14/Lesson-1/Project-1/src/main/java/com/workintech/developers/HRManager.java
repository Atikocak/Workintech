package com.workintech.developers;

public class HRManager extends Employee{
    private final JuniorDeveloper[] juniorDevelopers = new JuniorDeveloper[5];
    private final MidDeveloper[] midDevelopers = new MidDeveloper[5];
    private final SeniorDeveloper[] seniorDevelopers = new SeniorDeveloper[5];

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is managing employees and resources as HR Manager.");
        setSalary(getSalary() * 1.1);
    }

    public void addEmployee(JuniorDeveloper juniorDeveloper) {
        for (int i = 0; i < juniorDevelopers.length; i++) {
            if (juniorDevelopers[i] == null) {
                juniorDevelopers[i] = juniorDeveloper;
                break;
            } else {
                System.out.println("Junior Developer positions are full.");
            }
        }
    }

    public void addEmployee(MidDeveloper midDeveloper) {
        for (int i = 0; i < midDevelopers.length; i++) {
            if (midDevelopers[i] == null) {
                midDevelopers[i] = midDeveloper;
                break;
            } else {
                System.out.println("Mid Developer positions are full.");
            }
        }
    }

    public void addEmployee(SeniorDeveloper seniorDeveloper) {
        for (int i = 0; i < seniorDevelopers.length; i++) {
            if (seniorDevelopers[i] == null) {
                seniorDevelopers[i] = seniorDeveloper;
                break;
            } else {
                System.out.println("Senior Developer positions are full.");
            }
        }
    }
}
