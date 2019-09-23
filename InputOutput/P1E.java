import javax.swing.JOptionPane;
public class P1E
{
    public static void main()
    {
      int min = 1;
      int max = 3;
      int count1 = 0;
      int count2 = 0;
      int count3 = 0;
      int num = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want in an array?"));
      while ((num < 10) || (num >20000))
      {
        System.out.println("Error!");
        num = Integer.parseInt(JOptionPane.showInputDialog("How many numbers do you want in an array?"));
      }
      int[] Array = new int[num];
      for(int i = 0; i < Array.length; i++)
      {
        int fill = (int)(Math.random()*(max-min+1)+min);
        Array[i] = fill;
        if (fill == 1){
            count1++;
        }
        else if(fill == 2){
            count2++;
        }
        else{
            count3++;
        }
      }
      int least = max;
      int greatest = min;
      for(int k = 0; k<Array.length; k++)
      {
          System.out.print(Array[k] + " ");
          if (Array[k] < least)
          {
              least = Array[k];
          }
          else if (Array[k] > greatest)
          {
              greatest = Array[k];
          }
      }
      System.out.println("\ngreatest " + greatest);
      System.out.println("least " + least);
      System.out.println(count1);
      System.out.println(count2);
      System.out.println(count3);

    }
}
