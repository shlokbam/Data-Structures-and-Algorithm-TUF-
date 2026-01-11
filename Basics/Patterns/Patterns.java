package Patterns;
import java.util.*;

// Patterns

// 1. 
// N=5
// *****

// *****

// *****

// *****

// *****

// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }

// 2.
// *

// **

// ***

// ****

// *****

// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(int j=0;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(i);
//             }
//             System.out.print("\n");
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=n-i+1;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }




// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for (int k=1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             for(int l=1; l<=n-i; l++){
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for (int k=1; k<=(2*n-1)-(2*i); k++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=n-i; j++){
//                 System.out.print(" ");
//             }
//             for (int k=1; k<=2*i-1; k++){
//                 System.out.print("*");
//             }
//             for(int l=1; l<=n-i; l++){
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
//         for(int i=0; i<n; i++){
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             for (int k=1; k<=(2*n-1)-(2*i); k++){
//                 System.out.print("*");
//             }
//             for(int j=0; j<i; j++){
//                 System.out.print(" ");
//             }
//             System.out.print("\n");
//         }
        
//     }
// }


// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//         for (int i=1;i<n;i++){
//             for(int j=1;j<=n-i;j++){
//                 System.out.print("*");
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             int start = (i % 2 == 0) ? 1 : 0;
//             for(int j=0;j<=i;j++){
//                 System.out.print(start + " ");
//                 start = 1 - start;
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(j);
//             }
//             for(int k=1; k<=n-i; k++){
//                 System.out.print("*");
//             }
//             for(int l=1; l<=n-i; l++){
//                 System.out.print("*");
//             }
//             for(int m=i;m>=1;m--){
//                 System.out.print(m);
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         int num=1;
//         for(int i=1;i<=n;i++){
//             for(int j=1;j<=i;j++){
//                 System.out.print(" "+num);
//                 num = num+1;
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(char ch ='A'; ch<='A'+i; ch++){
//                 System.out.print(ch);
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         for(int i=0;i<n;i++){
//             for(char ch ='A'; ch<'A'+n-i; ch++){
//                 System.out.print(ch);
//             }
//             System.out.print("\n");
//         }
//     }
// }



// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         char ch = 'A';
//         for(int i=0;i<n;i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print((char)(ch+i));
//             }
//             System.out.print("\n");
//         }
//     }
// }




// public class Patterns{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the Number : ");
//         int n = sc.nextInt();
//         char ch = 'A';
//         for(int i=0;i<n;i++){
//             for(int j=0; j<=i; j++){
//                 System.out.print((char)(ch+i));
//             }
//             System.out.print("\n");
//         }
//     }
// }
