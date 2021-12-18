import java.util.Scanner;
public class RectangleArea{
    public static void main(String[]args){
        System.out.println("the area will be shown here");
        Scanner put = new Scanner(System.in);
        System.out.println("enter the length");
        double length = put.nextDouble();
        System.out.println("enter the breadth");
        double breadth = put.nextDouble();
        Area  a = new Area(length,breadth);
        System.out.println("the area of the rectangle of length " + length + " and breadth of "+ breadth + " is : " + a.returnArea());
    }
}
// RectangleArea implementation class
class Area{
    double length;
    double breadth;
    Area(double length,double breadth){
        this.length = length;
        this.breadth = breadth;
    }
    double returnArea(){
        return length * breadth;
    }
}