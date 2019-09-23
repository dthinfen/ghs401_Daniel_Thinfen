import javax.swing.JOptionPane;
public class InputOutput
{
    public static void main(){
        
        String[] firstNames = {"Kevin", "Cai", "sucks", "at", "smash!"};
        String[] lastNames = {"Bopped", "got", "walloped", "on", "easily"};
        System.out.println("FirstName\t\tLastName");
        for (int i = 0; i < 10; i++){
            int num1 =  (int) (Math.random() * firstNames.length);
            int num2 =  (int) (Math.random() * lastNames.length);
            System.out.println(firstNames[num1]+"\t\t"+lastNames[num2]);
        }
        int a = firstNames.length-1;
        while (a >= 0) {
            System.out.println(firstNames[a]);
            a--;
          
        }
    }
}
