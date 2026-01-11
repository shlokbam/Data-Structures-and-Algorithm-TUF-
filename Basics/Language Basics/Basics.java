import java.util.Scanner;

// class Basics{
//     public static void main(String[]args){
//         Scanner sc= new Scanner(System.in);
//         System.out.print("Enter the Number:");
//         int num = sc.nextInt();
//         System.out.println("Entered Number is : " + num);
//         sc.close();
//     }
// }

//implicit
// class Basics{
//     public static void main(String[] args){
//         int x = 10;
//         double y = x;
//         System.out.print(y);
//     }
// }

//implicit
// class Basics{
//     public static void main(String[] args){
//         double x = 10;
//         int y = (int) x;
//         System.out.print(y);
//     }
// }

// array
// class basics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         int[] array = new int[10];
//         array[0] = 1;
//         // System.out.print(array[0]);
//         array[1] = sc.nextInt();
//         System.out.print(array[0]+" "+array[1]);
//     }
// }

// class Basics{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the age:");
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.print("You are adult");
//         }
//         else{
//             System.out.print("You are teen");
//         }
//     }}

// class Basics{
//     public static void main(String[] args){
//         for(int i=2; i<=50; i=i+2){
//             System.out.println(i);
//         }
//     }
// }

class Basics{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the elements of array: ");
        for(int n=0; n<size; n++){
            array[n] = sc.nextInt();
        }
        System.out.println("Entered array is : ");
        for(int n=0; n<size; n++){
            System.out.println(array[n]);
        }
    }
}