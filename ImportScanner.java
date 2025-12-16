import java.util.Scanner;
public class ImportScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        String name = sc.next();
        String quotes = sc.nextLine();
        char gender = sc.next().charAt(0);

        System.out.println(num);
        System.out.println(name);
        System.out.println(quotes);
        System.out.println(gender);
    }
}
