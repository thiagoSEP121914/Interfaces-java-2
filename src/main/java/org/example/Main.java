package org.example;

import services.BrazilInterestService;
import services.InterestService;
import services.UsaInterestingService;

import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Quantia: ");
        double quantia = sc.nextDouble();
        System.out.print("Meses: ");
        int meses = sc.nextInt();

        InterestService interestService = new UsaInterestingService(1.0);
        double payment = interestService.payment(quantia, meses);

        System.out.print("Pagamento após " + meses + " meses: ");
        System.out.println(String.format("%.2f", payment));
    }
}