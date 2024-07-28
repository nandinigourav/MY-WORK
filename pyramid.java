import java.util.*;
public class pyramid {
    public static void main(String[] args) {
        int n = 4;
       //half pyramid
//         //outer loop
//         for(int i=1; i<=n; i++){
//             //inner loop
//             for(int j=1; j<=i; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }


//  inverted half pyramid
//     //outer loop
//     for(int i = n; i>=1; i--){
//         for(int j = 1; j<=i; j++){
//             System.out.print("*");
//                          }
//                         System.out.println();
//                      }

// IHP(rotated 180 Degree)
for(int i=n; i>=1; i--) {
    for(int j=1; j<i; j++) {
        System.out.print(" ");
    }


    for(int j=0; j<=n-i; j++) {
        System.out.print("*");
    }
    System.out.println();
}
}
}

   
    
    




