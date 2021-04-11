import java.util.Scanner;

/**
 * Класс калькулятор.
 * @autor Соболев Данила
 *
 */

public class HomeTaskNumber2 {
    public static void main (String[]args){
        Scanner scan = new Scanner(System.in);

        /** Поле первая переменная*/
        System.out.println("Введите первое число: ");
        double variable1 = scan.nextDouble(); // ввод первой переменной в консоль

        /** Поле вторая переменная*/
        System.out.println("Введите второе число: ");
        double variable2 = scan.nextDouble(); //
        double answer; //

        /** Поле выбора арифметичсекого действия*/
        System.out.println("Выберете одно арифметическое действие: ( +, -, *, / ) ");
        char operation = scan.next().charAt(0); // выбор математического действия

        /**
         * Процедура выполнения арифметического дейсвтия
         */
        switch (operation) {
            case '+':
                answer = variable1 + variable2;
                String result1 = String.format("%.4f",answer);
                System.out.println("Результат математической операции равен: " + result1);
                break;
            case '-':
                answer = variable1 - variable2;
                String result2 = String.format("%.4f",answer);
                System.out.println("Результат математической операции равен: " + result2);
                break;
            case '*':
                answer = variable1 * variable2;
                String result3 = String.format("%.4f",answer);
                System.out.println("Результат математической операции равен: " + result3);
                break;
            case '/':
                answer = variable1 / variable2;
                String result4 = String.format("%.4f",answer);
                if (variable2 == 0) {
                    System.out.println("Ошибка! На ноль делить нельзя");
                } else
                System.out.println("Результат математической операции равен: " + result4);
                break;
            default:
                //System.out.println("Некорректный символ, попробуйте еще раз!");
                return;
        }

    }
}
