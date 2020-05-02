/*
Mustafa Alibek
HomeWork5
Create abstract method in class Employee overall_income() which should return overall income.
And then in each extended (from Employee) class calculate overall income and then print out.
 */

abstract class Employee{
    abstract int overall_income();
}

class S1 extends Employee{
    public int salary = 250000;

    int overall_income() {
        return salary;
    }
}

class S2 extends Employee {
    public int salary = 60000;

    int overall_income() {
        return salary;
    }
}

class Main{
    public static void main(String[] args){
        S1 a = new S1();
        S2 b = new S2();
        System.out.print("Overall income: "+(a.overall_income() + b.overall_income()));
    }
}
