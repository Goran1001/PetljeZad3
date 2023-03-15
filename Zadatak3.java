
import java.util.InputMismatchException;

public class Zadatak3 {
    public static void main(String[] args) throws InputMismatchException {

        java.util.Scanner input = new java.util.Scanner(System.in);

        int sum = 0;


        //Koristio bih inače do-while petlju, ali je u zadatku traženo da se koristi for petlja
        for (int i = 1; i <= 1000; i++) {

            try {
                System.out.println("Enter an integer: ");
                int number = input.nextInt();

                switch (number % 7) {
                    case 0:
                        System.out.println("Sunday");
                        break;
                    case 1:
                        System.out.println("Monday");
                        break;
                    case 2:
                        System.out.println("Tuesday");
                        break;
                    case 3:
                        System.out.println("Wednesday");
                        break;
                    case 4:
                        System.out.println("Thursday");
                        break;
                    case 5:
                        System.out.println("Friday");
                        break;
                    case 6:
                        System.out.println("Saturday");
                        break;
                }

                if (number == 0) {
                    continue;
                /*else if ((number > 0) && (number % 2 != 0)) {
                    break;
                }     Ne razumijem zašto mora program izaći iz petlje ako je poz. neparan broj*/
                } else if (number < 0) {
                    break;
                } else if ((number > 0) && (number % 2 == 0)) {
                    sum = sum + number;
                }
            } catch (InputMismatchException ex) {
                System.out.println("Invalid input. Please enter an integer.");
                input.nextLine();
            }
        }
        
        System.out.println("The sum of even numbers entered is: " + sum);

    }
}
