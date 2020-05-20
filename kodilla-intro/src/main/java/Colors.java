
import java.util.Scanner;

public class Colors {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("enter first letter of color");
        String color = scanner.nextLine();
        while (true){

            String calc = scanner.nextLine().trim().toUpperCase();
            switch (calc) {
                case "R" :
                    System.out.println("red");
                    break;
                case "G" :
                    System.out.println("green");
                    break;
                case "B" :
                    System.out.println("black");
                    break;

                default:
                    System.out.println("wrong letter, try again");
            }}}


}











