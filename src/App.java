import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int number;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number:");
        number = input.nextInt();
        
        System.out.println("Powers of 2 less than entered number:");
        for(int i=2;i<=number;i*=2){
            System.out.println(i);
        }
    }
}
