package calc;
import java.util.Scanner;
public class calculator {
	public static void main(String[] args) {
		 Scanner console = new Scanner(System.in);
       
       System.out.print("Enter the 1st number: ");
      double st1 = console.nextDouble();
       System.out.print("Enter the 2nd number: ");
       double st2 = console.nextDouble();
       System.out.print ("Please choose between + - * / and expo: ");
        String operator = console.next();
        System.out.println();
        double result = 0;
 
        try {
            switch (operator) {
                case "+":
                    result = addition(st1, st2);
                    break;
                case "-":
                    result = subtraction(st1, st2);
                    break;
                case "*":
                    result = multyplyng(st1, st2);
                    break;
                case "/":
                    result = division(st1, st2);
                    break;
                case "expo":
                    result = exponentCal(st1, st2);
                    break;
                default:
                    System.out.println("There is NO such operation! Please choose between the 4!");
                    break;
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Number formatting exception " + e.getMessage());
        }
    }
 
    
    static double addition(double st1, double st2) {//METHOD FOR ADDITION: addition (WITH 2 String ARGUMENTS st1 AND st2)
        double d1 = (st1);
        double d2 = (st2);
        return d1 + d2;
    }
 
    static double subtraction(double st1, double st2) {//METHOD FOR SUBTRACTION: subtraction (WITH 2 String ARGUMENTS st1 AND st2)
        double d1 = (st1);
        double d2 = (st2);
        return d1 - d2;
    }
 
    static double multyplyng(double st1, double st2) {//METHOD FOR MULTYPLYNG: multyplyng (WITH 2 String ARGUMENTS st1 AND st2)
        double d1 = (st1);
        double d2 = (st2);
        return d1 * d2;
    }
 
    static double division(double st1, double st2) {//METHOD FOR DIVISION: division (WITH 2 String ARGUMENTS st1 AND st2)
        double d1 = (st1);
        double d2 = (st2);
        return d1 / d2;
    }
    
    static double exponentCal(double st1,double st2)
    {
	double r=st1;
	for (int i=1;i<st2;i++)
	{
		r=r*st1;
	}
	return r;

    }
}
