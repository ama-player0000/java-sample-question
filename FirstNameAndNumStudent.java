import java.io.PrintWriter;
import java.util.Scanner;

public class FirstNameAndNumStudent {
    public static void main(String[] args) {
        String fileName = "stName.dat";
        CreateFile(fileName);
    }

    public static void CreateFile(String fileName) {
        try {
            Scanner in = new Scanner(System.in);
            PrintWriter outFile = new PrintWriter(fileName);
            String S;
            System.out.print("Enter Name & Family: ");
            S = in.next();
            while (!S.equals("stop")) {
                outFile.print(S + " ");
                S = in.next(); // ورودی بعدی را بخوانید
            }
            outFile.close();

            System.out.print("Enter Number of Students: ");
            int n = in.nextInt();
            for (int i = 1; i <= n; i++) {
                // پیاده سازی منطق برای مدیریت داده های دانش آموز و نوشتن در فایل
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}
