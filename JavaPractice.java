public class JavaPractice{
    public static void main(String[] args){
        Vehicle v1 =  new Vehicle();
        v1.setRegNumber("UBG-234H");
        v1.setModel("2024");
        v1.setSpeed(120);
        v1.displayInfo();

        Truck t1 = new Truck();
        t1.setRegNumber("UAY-659K");
        t1.setModel("2020");
        t1.setSpeed(80);
        t1.setCapacity(7000);
        t1.displayInfo();

        Employee e1 = new Employee();
        e1.setEmpId("S24B23/024");
        e1.setName("Blair");
        e1.setSalary(1000);
        e1.calculatePay();

        ContractEmployee e2 = new ContractEmployee();
        e2.setEmpId("B30009");
        e2.setName("Tonny");
        e2.setSalary(1200);
        e2.setContractDuration(5);
        e2.calculatePay();

        Book b1 = new Book();
        b1.setTitle("Atomic Habits");
        b1.setAuthor("James Clear");
        b1.setPrice(70000);
        b1.displayDetails();

        Magazine b2 = new Magazine();
        b2.setTitle("48 Laws");
        b2.setAuthor("Robert Greene");
        b2.setPrice(60000);
        b2.setIssueNumber(10);
        b2.displayDetails();

        System.out.println("\n--- Banking System ---");
        Account acc1 = new Account();
        acc1.setAccNumber("ACC1001");
        acc1.setBalance(5000);
        acc1.deposit(1500);
        acc1.withdraw(2000);

        SavingsAccount sav1 = new SavingsAccount();
        sav1.setAccNumber("SAV2001");
        sav1.setBalance(1500);
        sav1.setInterestRate(5);
        sav1.withdraw(600);
        sav1.withdraw(200);

    }
}

//Vehicle Management System
class Vehicle{
    private String regNumber;
    private String model;
    private int speed;
    
    void setRegNumber(String regNumber){this.regNumber = regNumber;}
    
    void setModel(String model){this.model = model;}
    
    void setSpeed(int speed){this.speed = speed;}
    
    public String getRegNumber(){return this.regNumber;}
    
    public String getModel(){return this.model;}
    
    public int getSpeed(){return this.speed;}
    
    void displayInfo(){
        System.out.println("Registration number: " + getRegNumber() + " Model: " + getModel() + " speed: " +getSpeed());
    }
}

class Truck extends Vehicle{
    private int loadCapacity;
    void setCapacity(int loadCapacity){this.loadCapacity = loadCapacity;}
    
    public int getCapacity(){return this.loadCapacity;}
    
    @Override
    void displayInfo(){
        System.out.println("Registration number: " + getRegNumber() + " Model: " + getModel() + " speed: " +getSpeed() +" Capacity: " + getCapacity());
    }
}

//Employee Payroll System
class Employee{
    private String empId;
    private String name;
    private float salary;

    void setEmpId(String empId){this.empId = empId;}

    void setName(String name){this.name = name;}

    void setSalary(float salary){this.salary = salary;}

    String getEmpId(){return empId;}

    String getName(){return name;}

    float getSalary(){return salary;}

    void calculatePay(){System.out.println("Employee ID: " + getEmpId() + " Employee name: " + getName() + " Salary is " + getSalary());}
}

class ContractEmployee extends Employee{
    private int contract;

    void setContractDuration(int contract){this.contract = contract;}

    int getContractDuration(){return contract;}

    @Override
    void calculatePay(){System.out.println("Employee ID: " + getEmpId() + " Employee name: " + getName() + " Salary is " + (getSalary() - (getSalary() * 0.1f)) + " Contract Duration: " + getContractDuration() + " years");}
}

//Library Management
class Book{
    private String title;
    private String author;
    private float price;

    void setTitle(String title){this.title = title;}

    void setAuthor(String author){this.author = author;}

    void setPrice(float price){this.price = price;}

    String getTitle(){return this.title;}

    String getAuthor(){return this.author;}

    float getPrice(){return this.price;}

    void displayDetails(){System.out.println("Title: " + getTitle() + " | Author: " + getAuthor() + " | Price: Shs." + getPrice());}
}

class Magazine extends Book{
    private int issueNumber;

    void setIssueNumber(int issueNumber){this.issueNumber = issueNumber;}

    int getIssueNumber(){return this.issueNumber;}

    @Override
    void displayDetails(){System.out.println("Title: " + getTitle() + " | Author: " + getAuthor() + " | Price: Shs." + getPrice() + " | IssueNumber: " + getIssueNumber());}   
}

//Banking System
class Account{
    private String accountNumber;
    private float balance;
    float amount;

    void setAccNumber(String accountNumber){this.accountNumber = accountNumber;}
    void setBalance(float balance){this.balance = balance;}

    String getAccNumber(){return this.accountNumber;}
    float getBalance(){return this.balance;}

    void deposit(float amount){
        if(amount > 0){
            setBalance( getBalance() + amount );
            System.out.println("Deposited: Shs."+ amount + " New Balance is Shs. " + getBalance());
        }else{
            System.out.println("Transaction invalid.");
        }
    }
    void withdraw(int amount){
        if(getBalance() > 0 && amount > 0){
            setBalance( getBalance() - amount);
            System.out.println("Transaction Successful, New Balance is: " + getBalance());
        }else{
            System.out.println("Transaction invalid.");
        }
    }
}

class SavingsAccount extends Account{
    private float interestRate;

    void setInterestRate(int interestRate){this.interestRate = interestRate;}
    float getInterestRate(){return this.interestRate;}
    @Override
    void withdraw(int amount){
        if(getBalance() - amount < 1000){
            System.out.println("Transaction failed, cannot have a balance less than Shs.1000.");
        }else{
            setBalance( getBalance() - amount);
            System.out.println("Transaction Successful, new balance is Shs." + getBalance());
        }
    }
}