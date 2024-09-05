import java.util.Scanner;
class Month1{
    public static void main(String[] args){
        
        Scanner s = new Scanner(System.in);
        int n;

        System.out.println("enter number");
        n = s.nextInt();

        switch (n) {
            case 1 ->{
                System.out.println("January " + "31");
            }

            case 2 ->{
                System.out.println("February " + "27");
            }

            case 3 ->{
                System.out.println("March " + "31");
            }

            case 4 ->{
                System.out.println("April " + "30");
            }

            case 5 ->{
                System.out.println("May " + "31");
            }

            case 6 ->{
                System.out.println("June " + "30");
            }

            case 7 ->{
                System.out.println("July " + "31");
            }

            case 8 ->{
                System.out.println("August " + "31");
            }

            case 9 ->{
                System.out.println("September " + "30");
            }

            case 10 ->{
                System.out.println("October " + "31");
            }

            case 11 ->{
                System.out.println("November " + "30");
            }

            case 12 ->{
                System.out.println("December " + "31");
            }

            default -> 
                System.out.println("enter number between 1-12");
        }
    }    
}