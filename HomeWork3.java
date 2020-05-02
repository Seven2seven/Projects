/*
Mustafa Alibek
HomeWork 3
Create 2 instance of class Point with two protected fields X and Y.
To get values of Point use scanner from command line and set to Point by setters;
Implement the method that get in parameters 2 point objects and calculate distance between them. And show distance in command line.
Then show how to make these objects read-only fields. 
 */

public class Distance {
    double x;
    double y;

    public Distance(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setX1(double x) {
        this.x = x;
    }

    public void setY1(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getX1() {
        return x;
    }

    public double getY1() {
        return y;
    }
}

public class Test {

    public static void main(String[] args) {
        Distance dis = new Distance(0, 0);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter X: ");
        double x = input.nextDouble();
        dis.setX(x);

        System.out.print("Enter Y: ");
        double y = input.nextDouble();
        dis.setY(y);

        System.out.print("Enter X1: ");
        double x1 = input.nextDouble();
        dis.setX1(x);

        System.out.print("Enter Y1: ");
        double y1 = input.nextDouble();
        dis.setY1(y);

        double dst = Math.sqrt(Math.pow(x1 - x, 2) + Math.pow(y1 - y, 2));
        System.out.print("Distance: " + dst);

    }
}
