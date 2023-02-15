import java.util.Scanner;

class Guests {
        public static int gettingToKnowNumberOfGuests() {
            Scanner number = new Scanner(System.in);

            while (true) {

                System.out.println("Введите кол-во гостей, на которых нужно разделить счет");
                if (number.hasNextInt()) {
                    break;
                } else {
                    System.out.println("Ошибка! Введите число свыше 1.");
                    number.nextLine();
                }

                //return number.nextDouble();
            }
            return number.nextInt();
        }

}
