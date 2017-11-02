public class Company
{
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.setName("Thomas");
        e.setSurname("Anderson");
        e.setSalary(5000);
        System.out.println("Name: "+e.name);
        System.out.println("Surname: "+e.surname);
        System.out.println("Salary: "+e.salary+"$");
        //I make a new Boss instance and thanks to inheritance I can use methods from Employee class as well as Boss methods
        //I wouldn't be able to set bonus for a regular employee from here. Of course IRL each employee could get a bonus
        //I just simplified this to show example of inheritance. So class Boss extends Employee.
        Boss boss = new Boss();
        boss.setName("Agent");
        boss.setSurname("Smith");
        boss.setSalary(12000);
        boss.setBonus(5000);
        //I've also added one more variable for a boss, which is unreachable for Employee - room number, as a Boss should have his own room
        boss.setRoom(105);
        //e.setBonus(1000);  This won't work
        System.out.println();
        System.out.println("Name: "+boss.name);
        System.out.println("Surname: "+boss.surname);
        System.out.println("Room number: "+boss.room);
        System.out.println("Salary: "+boss.salary+"$" +" + bonus "+ boss.bonus+"$");


    }

}
