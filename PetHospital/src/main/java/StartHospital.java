import Hospital.Hospital;
import java.util.Scanner;

public class StartHospital {
    public static void main(String[] args) {
        Hospital    hospital;
        Scanner     scanner;

        scanner = new Scanner(System.in);
        System.out.print("Please type max hospital places (numeric): ");
        while (true){
            if (scanner.hasNextInt()) {
                hospital = new Hospital(scanner.nextInt());
                break ;
            }
            scanner.next();
            System.out.print("Please type max hospital places (ONLY numeric): ");
        }
        hospital.start(scanner);
    }
}
