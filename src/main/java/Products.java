import java.util.Scanner;

class Products {

    Scanner scan = new Scanner(System.in);
    boolean ifWantFinish = true;
    String[] dish =  new String[100];
    int i =0;
    double[] expense = new double[100];
    double price = 0;
    double total = 0;
    double calculatingTotalExpense() {
        while (ifWantFinish) {
            System.out.println("Введите название товара");
            dish[i] = scan.next();

            expense[i] = checkingIfValueIsNumber();
            total = total + expense[i];

            System.out.println("Товар " + dish[i] + " стоимостью " + expense[i] + " руб. успешно добавлен!");
            i++;
            System.out.println("\nВы хотите ввести еще товары? Если да, то введите любой текст. Если нет, введите 'Завершить'");
            ifWantFinish = !scan.next().equalsIgnoreCase("Завершить");
        }
        System.out.println("Добавленные товары:");
        for (int l = 0; l < i; l++) {
            System.out.println((l + 1) + ". " + dish[l] + " Цена " + expense[l] + " руб.");
        }
        return total;
    }

    double checkingIfValueIsNumber () {
        while(true) {
        System.out.println("Введите цену товара в формате рубли,копейки");
        while (true) {
            if (scan.hasNextDouble()) {
                break;
            } else {
                System.out.println("Ошибка! Введите число!");
                scan.next();
            }
        }
            price = scan.nextDouble();
            if (price <= 0) {
                System.out.println("Цена блюда не может быть отрицательной и не может быть равна нулю");
            } else {
                break;
            }
        }
        return price;
    }


}