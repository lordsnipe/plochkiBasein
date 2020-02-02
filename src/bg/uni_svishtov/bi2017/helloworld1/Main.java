package bg.uni_svishtov.bi2017.helloworld1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //  ДЕКЛАРИРАНЕ НА ПРОМЕНЛИВИ:
        Scanner scanner = new Scanner(System.in);
        System.out.println("Напишете ширината в метри");
	    double shirina = scanner.nextDouble();
        System.out.println("Напишете дължината в метри");
        double duljina = scanner.nextDouble();
        System.out.println("Напишете височината в метри:");
        double visochina = scanner.nextDouble();

        // ПРОМЕНЛИВИ ЗА СЪХРАНЕНИЕ НА РЕЗУЛТАТИ ОТ ИЗЧИСЛЕНИЯ:
        double stranaA = duljina*visochina;
        double stranaB = shirina * visochina;
        double pod = shirina * duljina;
        double rezultat = (stranaA*2) + (stranaB*2) +pod;

        //  ПРИНТИРАНЕ НА РЕЗУЛТАТ:
        System.out.print("Обща площ = "+rezultat);
    }
}
