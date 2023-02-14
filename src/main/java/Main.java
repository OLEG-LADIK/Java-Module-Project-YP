
import java.util.Scanner;

// dev branch for Y.Practicum
public class Main {

    public static void main(String[] args) {

        Guests guests = new Guests();
        int numberOfGuests = guests.numberOfGuests();

        Products products = new Products();
        double total = products.totalExpense();

        Calculator calc = new Calculator();
        calc.calculation(total,numberOfGuests);
    }
}
        class Guests {
            Scanner scan = new Scanner(System.in);

            int numberOfGuests() {
                System.out.println("Введите кол-во гостей, на которых необходимо поделить счет");
                int numberOfGuests = scan.nextInt();
                while (numberOfGuests <= 1) {
                    System.out.println("Ошибка. Число гостей должно быть свыше 1. Введите кол-во гостей");
                    numberOfGuests = scan.nextInt();
                }
            return numberOfGuests;
            }// ваш код начнется здесь
        }
        class Products {
            Scanner scan = new Scanner(System.in);
            boolean ifWantFinish = true;
            String[] dish =  new String[100];
            int i =0;
            double[] expense = new double[100];
            double total = 0;
            double totalExpense() {
                while (ifWantFinish) {
                    System.out.println("Введите название товара");
                    dish[i] = scan.next();

                    System.out.println("Введите цену товара в формате рубли,копейки");
                    expense[i] = scan.nextDouble();
                    total = total + expense[i];

                    System.out.println("Товар " + dish[i] + " стоимостью " + expense[i] + " рублей успешно добавлен!");
                    i++;
                    System.out.println("\nВы хотите ввести еще товары? Если да, то введите любой текст. Если нет, введите 'Завершить'");
                    ifWantFinish = !scan.next().equalsIgnoreCase("Завершить");
                }
                System.out.println("Добавленные товары:");
                for (int l = 0; l < i; l++) {
                    System.out.println((l + 1) + ". " + dish[l] + " Цена " + expense[l] + " рублей");
                }
            return total;
            }
        }
        class Calculator {
        void calculation(double total, int numberOfGuests) {
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



