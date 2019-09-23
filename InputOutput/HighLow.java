import javax.swing.JOptionPane;
public class HighLow
{
    public static void main(){
        try{
            int num;
            int even = 0;
            int odd = 0;
            int dope = Integer.parseInt(JOptionPane.showInputDialog("How long would you like your array to be? "));
            if (dope <= 0){
                System.out.println("You are dumb");
                main();
            }
            else{
                int[] Array = new int[dope];
                int high = Integer.parseInt(JOptionPane.showInputDialog("Enter a high number"));        
                int low = Integer.parseInt(JOptionPane.showInputDialog("Enter a lower number than " + high));
                if (high <= low){
                    System.out.println("That is invalid");
                    System.out.println("Your high number was " + high);
                    System.out.println("Your low number was " + low);
                    System.out.println("Now think buddy in what world is " + low + " larger than " + high);
                    main();
                }
                else{
                    for (int i = 0; i<dope; i++){
                        num = (int)(Math.random()*(high-low)+low + 0.5);
                        Array[i] = num;
                        int index = i+1;
                        int stat = num%2;
                        //System.out.print("Element #" + index +" in the array is " + Array[i]);
                        if (stat == 0){
                            //System.out.println(" which is even");
                            even++;
                        }
                        else{
                            //System.out.println(" which is odd");
                            odd++;
                        }
                    }
                    System.out.println("The array has " + even + " even numbers and " + odd + " odd numbers"); 
                }
            }
        }
        catch(Exception e){
            main();
        }
        
        
        
    }
}
