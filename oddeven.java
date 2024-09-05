import java.util.Scanner;

class oddeven {
    public static void main(String[] args){
        int a;
        Scanner s = new Scanner(System.in);
    
        System.out.println("enter a number: ");
        a = s.nextInt();

        if( a%2 == 0){
            System.out.println("Given number is even");
        }

        else if( a%2 != 0){
            System.out.println("Given number is odd");
        }

        else{
            System.out.println("zero is neither even or odd");
        }
    }
}
