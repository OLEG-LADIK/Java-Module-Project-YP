import java.util.Scanner;

class Guests {
    public static int gettingToKnowNumberOfGuests() {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        System.out.println("Введите кол-во гостей, на которых нужно разделить счет");
        while (!scanner.hasNextInt()) {
            System.out.println("Ошибка! Вы ввели текст! Вам нужно ввести целое число.");
            scanner.next();
        }

        while (true) {
            number = scanner.nextInt();
            if (number > 1) {
                break;
            } else if (number < 0) {
                System.out.println("Кол-во гостей не может быть отрицательынм");
            } else {
                System.out.println("Кол-во гостей не может быть меньше 1");
            }
        }
        return number;
    }
}
