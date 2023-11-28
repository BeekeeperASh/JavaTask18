import java.util.Scanner;

public class Exception2 {
    public void exceptionDemo() {
        try {

            Scanner myScanner = new Scanner(System.in);
            System.out.print("Enter an integer ");
            String intString = myScanner.next();
            int i = Integer.parseInt(intString);
            System.out.println(2 / i);
        } catch (Exception e){
            //e.printStackTrace();
            System.out.println(e.toString());
        } finally {
            System.out.println("finally");
        }
    }
}