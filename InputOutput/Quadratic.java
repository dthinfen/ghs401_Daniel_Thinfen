import javax.swing.JOptionPane;
public class Quadratic
{
    public static void main(){
        
        int a = Integer.parseInt(JOptionPane.showInputDialog("a?"));
        int b = Integer.parseInt(JOptionPane.showInputDialog("b?"));
        int c = Integer.parseInt(JOptionPane.showInputDialog("c?"));
        double discriminant = b*b-(4*a*c);
        if (discriminant < 0){
            System.out.println("Sorry, your discriminant is negative. We cannot process imaginary roots right now…");
        }
        else{    
            System.out.println("The value of b squared is " + Math.pow(b,2));
            System.out.println("The value of 4 * a * c is " + 4*a*c);
            System.out.println("The value of sqrt(b^2 - 4ac) is " + Math.sqrt(discriminant));
            double r1 = ((-b + Math.sqrt(discriminant))/(2*a));
            double r2 = ((-b - Math.sqrt(discriminant))/(2*a));
            System.out.println("Your first root is " + r1);
            System.out.println("Your second root is " + r2);
        }
    }
}