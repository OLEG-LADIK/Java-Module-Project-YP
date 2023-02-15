import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {

        Guests guests = new Guests();
        int numberOfGuests = guests.gettingToKnowNumberOfGuests();

        Products products = new Products();
        double total = products.calculatingTotalExpense();

        Calculator calc = new Calculator();
        calc.calculatingCheckPerGuest(total,numberOfGuests);
    }
}




