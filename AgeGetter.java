import java.util.Scanner;

public class AgeGetter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int age1, age2, age3;

        System.out.print("ENTER AGE OF PERSON 1: ");
        age1 = scan.nextInt();
        System.out.print("ENTER AGE OF PERSON 2: ");
        age2 = scan.nextInt();
        System.out.print("ENTER AGE OF PERSON 3: ");
        age3 = scan.nextInt();

        if ( age1 > age2 && age1 > age3 ) {
            System.out.println("PERSON 1 IS THE OLDEST");
        } else if ( age2 > age3 ) {
           System.out.println("PERSON IS THE OLDEST");
        } else {
            System.out.println("PERSON IS THE OLDEST");
        }

        if ( age1 < age2 && age1 < age3 ) { 
            System.out.println("PERSON 1 IS THE YOUNGEST");
        } else if ( age2 < age3 ) {
           System.out.println("PERSON 2 IS THE YOUNGEST");
        } else {
            System.out.println("PERSON 3 IS THE YOUNGEST");
        }
    }
}