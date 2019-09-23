
public class Extra
{
   public static void main(){
           int p_a = 0;
           int p_b = 0;
           int p_c = 0;
           for (int i = 1; i < 1000; i++){
               int a_square = i*i;
               for (int n = 1; n < 1000; n++){
                   int b_square = n*n;
                   for (int m = 1; m < 1000; m++){    
                       int c_square = m*m;
                       //System.out.print(i + "\t");
                       //System.out.print(n +"\t");
                       //System.out.println(m);
                       if ((a_square + b_square) == (c_square)){
                           if((i+n+m) == 1000){
                               p_a += i;
                               p_b += n;
                               p_c += m;
                               int product = (p_a * p_b * p_c);
                               System.out.println("The product of abc such that (a^2 + b^2 = c^2) and a+b+c = 1000 is " + product);
                               return;
                            }
                        }
                    }
                }
            }
            System.out.println(p_a);
            System.out.println(p_b);
            System.out.println(p_c);
            int product = (p_a * p_b * p_c);
            System.out.println("The product of abc such that (a^2 + b^2 = c^2) and a+b=c is " + product); 
        }
       
    }

