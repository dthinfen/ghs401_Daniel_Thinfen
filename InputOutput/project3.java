import javax.swing.JOptionPane;
public class project3
{
    public static void main(){
        String school = JOptionPane.showInputDialog("School name");
        String mascot = JOptionPane.showInputDialog("Mascot");
        if (school.equals("Granada") && mascot.equals("Matadors")){
            if (mascot.equals("Matadors")){
                String[] array = {"Marty McFly","Mufasa","Waldo","Spongebob"};
                //array[2] = null;
                for (int i = 0; i < array.length; i++){
                    if (array[i]==(null)){
                        System.out.println("Spot " + (i+1) + " is empty(null)");
                    }
                    else if (array[i].equals("Waldo")){
                        System.out.println("We found him waldo is at spot " + (i+1));
                    }
                    else{
                        System.out.println("We did not find waldo in spot " + (i+1) + " this is " + array[i]);
                    }                    
                }
                String fav = JOptionPane.showInputDialog("What is your favorite movie character?");
                for (int i = 0; i < array.length; i++){
                    if (array[i].equals(fav)){
                        System.out.println("");
                        System.out.println("We have the same taste in movies!");
                        break;
                    }
                    System.out.println("");
                    System.out.println("We have different taste in movies");
                    break;
                }
            }
        }    
        else if(!(mascot.equals("Matadors")) && school.equals("Granada")){
            System.out.println("Your mascot name was invalid");
            main();
        }
        else if(!(school.equals("Granada")) && mascot.equals("Matadors")){
            System.out.println("Your school name was invalid");
            main();
        }
        else{
            System.out.println("Your school name and mascot name is wrong");
            main();
        }
    }
}
