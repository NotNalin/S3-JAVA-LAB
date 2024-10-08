class Employee
{
    private String name;
    private int age;
    private String address;
    private double salary;
    public void setName(String name)
    {
        this.name =name;
    }
    public String getName()
    {
        return name;
    }
    public void setAge(int age)
    {
        this.age = age;
    }
    public int getAge()
    {
        return age;
    }
    public void setAddress(String address)
    {
        this.address = address;
    }
    public String getAddress()
    {
        return address;
    }
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    public double getSalary()
    {
        return salary;
    }
    public void printSalary()
    {
        System.out.println("The salary is : "+ salary);
    }
}

class Officer extends Employee
{
    private String specialisation;
    public void setSpecialization(String specialisation)
    {
        this.specialisation =specialisation;
    }
    public String getSpecialization()
    {
        return specialisation;
    }
}

class Manager extends Employee
{
    private String department;
    public void setDepartment(String department)
    {
        this.department =department;
    }
    public String getDepartment()
    {
        return department;
    }
}

class Test
{
    public static void main(String args[])
    {
        Officer o = new Officer();
        o.setName("John");
        o.setAge(20);
        o.setAddress("TVM");
        o.setSalary(20000.00);
        
        Manager m = new Manager();
        m.setName("Smith");
        m.setAge(30);
        m.setAddress("TVM");
        m.setSalary(50000.00);
        
        System.out.println("Officer details :-");
        System.out.println("Name : "+o.getName());
        System.out.println("Age : "+ o.getAge());
        System.out.println("Address : "+o.getAddress());
        System.out.println("Salary : " + o.getSalary());
        System.out.println("printSalary method :-");
        o.printSalary();
        
        System.out.println();
        
        System.out.println("Manager details :-");
        System.out.println("Name : "+m.getName());
        System.out.println("Age : "+ m.getAge());
        System.out.println("Address : "+m.getAddress());
        System.out.println("Salary : " + m.getSalary());
        System.out.println("printSalary method : ");
        m.printSalary();
    }
}

