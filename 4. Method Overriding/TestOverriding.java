class Person
{
    private String name;
    private int age;
    public void setName(String name)
    {
        this.name =name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public void display()
    {
        System.out.println("Name : "+ name);
        System.out.println("Age : " + age);
    }
}

class Employee extends Person
{
    private int empId;
    public void setEmpId(int empId)
    {
        this.empId = empId;
    }
    public void display()
    {
        super.display();
        System.out.println("Emp Id : "+ empId);
    }
}

class TestOverriding
{
    public static void main(String args[])
    {
        Employee e = new Employee();
        e.setName("Bob");
        e.setAge(20);
        e.setEmpId(101);
        e.display();
    }
}
        
        
    
    
    
