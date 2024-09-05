import java.util.Scanner;

class Search {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        int n;
        System.out.println("enter number of inputs:");
        n = s.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<arr.length; i++){
            System.out.println("enter number: ");
            arr[i] = s.nextInt();
        }

        int key;
        System.out.println("enter the element to search:");
        key = s.nextInt();

        int check = -1;
        for(int i=0; i<arr.length; i++){
            if(arr[i] == key){
                check = i;
                break;
            }
        }

        System.out.println(check);
    }
}
