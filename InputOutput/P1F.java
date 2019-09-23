import javax.swing.JOptionPane;
public class P1F
{
    public static void main(){
        String array1[] = new String [3];
        String array2[] = new String [3];
        array1[0] = JOptionPane.showInputDialog("First name");
        array1[1] = JOptionPane.showInputDialog("Middle name");
        array1[2] = JOptionPane.showInputDialog("Last name");
        array2[0] = JOptionPane.showInputDialog("Friend's First name");
        array2[1] = JOptionPane.showInputDialog("Friend's Middle name");
        array2[2] = JOptionPane.showInputDialog("Friend's Last name");
        int age1 = Integer.parseInt(JOptionPane.showInputDialog("Your age?"));
        int age2 = Integer.parseInt(JOptionPane.showInputDialog("Your friend's age?"));        
        int name1 = 0;
        int name2 = 0;
        Person p1 = new Person(array1, age1);
        Person p2 = new Person(array2, age2);
        Person p3 = new Person();
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        for (int i = 0; i < array1.length; i++)
        {
            name1 += array1[i].length();
            name2 += array2[i].length();
        }
        if (name1 > name2)
        {
            System.out.println("You have a longer name");
        }
        else{
            System.out.println("Your friend has a longer name");
        }
    }

}
