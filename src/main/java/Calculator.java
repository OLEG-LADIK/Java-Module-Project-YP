import java.util.Scanner;
class Calculator {
    void calculatingCheckPerGuest(double total, int numberOfGuests) {
        double checkPerGuest = total / numberOfGuests;
        double roundingCheck = Math.floor(checkPerGuest);
        double roundingCheck2 = roundingCheck - Math.floor(roundingCheck / 100) * 100;
        double roundingCheck3 = roundingCheck - Math.floor(roundingCheck / 10) * 10;
        if(roundingCheck3 ==1&&roundingCheck2 !=11) {
            System.out.println(String.format("Каждый гость должен заплатить %.2f рубль", checkPerGuest));
        } else if(roundingCheck3 >1&&roundingCheck3<5&roundingCheck2 !=12&roundingCheck2 !=13&roundingCheck2 !=14) {
            System.out.println(String.format("Каждый гость должен заплатить %.2f рубля", checkPerGuest));
        } else {
            System.out.println(String.format("Каждый гость должен заплатить %.2f рублей", checkPerGuest));
        }
    }
}