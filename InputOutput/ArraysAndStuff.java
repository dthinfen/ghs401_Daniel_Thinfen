public class ArraysAndStuff
{
    public static void main(){
        
      int num;
      for (int i = 0; i<30; i++){
        num = (int)(Math.random()*11)+90;
        System.out.println(num);
        System.out.println("remainder when divided by 5 is " + num%5);
        }
        
    }    
}
