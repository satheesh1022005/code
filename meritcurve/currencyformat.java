import java.util.*;
import java.text.*;

public class Solution {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();
        NumberFormat nf=NumberFormat.getCurrencyInstance(Locale.US);
        String us=nf.format(payment);
        NumberFormat a=NumberFormat.getCurrencyInstance(new Locale("en", "IN"));
        String india=a.format(payment);
        NumberFormat b=NumberFormat.getCurrencyInstance(Locale.CHINA);
        String china=b.format(payment);
        NumberFormat c=NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france=c.format(payment);
        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}