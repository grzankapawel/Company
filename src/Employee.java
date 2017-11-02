public class Employee
{
    String name,surname;
    int salary;
    //Creates few blank variables for each instance of employee
    public Employee()
    {
        name = "";
        surname = "";
        salary = 0;
    }
    //The same thing, but if someone wishes to set the properties when initiating a new instance of Employee it's possible now
    public Employee(String n, String nn, int s)
    {
        name = n;
        surname = nn;
        salary = s;
    }
    //Three "setters" - so you can set the properties whenever you like
    public void setName(String n)
    {
        name = n;
    }
    public void setSurname(String n)
    {
        surname = n;
    }
    public void setSalary(int a)
    {
        salary = a;
    }



}
