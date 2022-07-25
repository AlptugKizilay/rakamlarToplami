import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;
        int tempNumber, basValue = 0;
        int total = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Sayi Giriniz: ");
        number = inp.nextInt();
        tempNumber = number;

        while (tempNumber != 0) {
            tempNumber = tempNumber / 10;
        }
        tempNumber = number;
        while (tempNumber != 0) {
            basValue = tempNumber % 10;
            tempNumber = tempNumber / 10;
            total = total + basValue;
        }

        System.out.println("Basmaklar Toplami: " + total);

    }
}