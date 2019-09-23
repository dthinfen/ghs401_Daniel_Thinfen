
public class GhostDriver
{
    public static void main(){
        Ghost g1 = new Ghost();
        System.out.println(g1);
        Ghost g2 = new Ghost("chantruse" ,99);
        System.out.println(g2);
        g2.bumpSpeed(2000);
        g2.doubleColor();
        System.out.println(g2);

    }
}
