import java.util.Scanner;

public class PowerOfNumbers {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        int num,power;

        System.out.print("Enter a number: ");
        num = input.nextInt();;

        System.out.print("Enter the power of the number: ");
        power = input.nextInt();

        int total = 1;
        for(int i=1;i<=power;i++){
            total*=num;
        }
        System.out.println(total);
    }
}
