package Java_Currency_Formatter;

import org.w3c.dom.xpath.XPathResult;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*Given a double-precision number, payment,
        denoting an amount of money, use the NumberFormat class'
        getCurrencyInstance method to convert payment into the US, Indian, Chinese, and French currency formats.
        Then print the formatted values as follows:
        where formattedPayment is payment formatted according to the appropriate Locale's currency.*/

        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        Locale indialocale = new Locale("en", "IN");

        NumberFormat us = NumberFormat.getCurrencyInstance(Locale.US);
        String usFormat = us.format(payment);

        NumberFormat india = NumberFormat.getCurrencyInstance(indialocale);
        String indiaFormat = india.format(payment);

        NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
        String chinaFormat = china.format(payment);

        NumberFormat france = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String franceFormat = france.format(payment);

        System.out.println("US: " + usFormat);
        System.out.println("India: " + indiaFormat);
        System.out.println("China: " + chinaFormat);
        System.out.println("France: " + franceFormat);
    }
}
