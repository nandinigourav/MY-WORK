import java.util.*;
public class calculator {
    public static void main(String[] args) {
        System.out.println("Enter two numbers");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int operator = sc.nextInt();
        
        switch(operator) {
            case 1 : System.out.println(x+y);
            break;
            case 2 : System.out.println(x-y);
            break;
            case 3 : System.out.println(x*y);
            break;
            case 4 : if (y==0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(x/y);
            }
            break;
            case 5 : if(y==0) {
                System.out.println("Invalid Division");
            } else {
                System.out.println(x%y);
            }
            break;
            default : System.out.println("Invalid Operator");
            }

        }
    }
    

