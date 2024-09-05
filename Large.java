import java.util.Scanner;

class Large{
    public static void main(String[] args){
        Scanner s  = new Scanner(System.in);

        int n, x, big=0;
        System.out.println("enter number of inputs: ");
        n = s.nextInt();

        for (int i=0; i<n; i++){
            System.out.println("enter number: ");
            x = s.nextInt();
            if( x > 0 & big < x){
                big = x;
            }
            else{}
        }

        System.out.println("largest number of given number inputs is: "+big);
    }
}