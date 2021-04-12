import java.util.Scanner;

/**
 * @autor Соболев Данила
 *
 */

public class HomeTaskNumber3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x =1;
        int y = 1;


        System.out.println("Выберете задание: 1-калькулятор, 2 - поиск максимального слова в массиве");
        int с;
        int c = scan.nextInt();
        if (c == 1) {

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
                    String result1 = String.format("%.4f", answer);
                    System.out.println("Результат математической операции равен: " + result1);
                    break;
                case '-':
                    answer = variable1 - variable2;
                    String result2 = String.format("%.4f", answer);
                    System.out.println("Результат математической операции равен: " + result2);
                    break;
                case '*':
                    answer = variable1 * variable2;
                    String result3 = String.format("%.4f", answer);
                    System.out.println("Результат математической операции равен: " + result3);
                    break;
                case '/':
                    answer = variable1 / variable2;
                    String result4 = String.format("%.4f", answer);
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

        else if (c == 2) {

                /**
                 *Процедура создания массива из строк с вводом количества элментов массива и самих элементов в консоль
                 */

                System.out.println("Введите количество строк в массиве: ");
                int NumberOfLines = scan.nextInt();
                scan.nextLine();
                String[] wordsArr = new String[NumberOfLines];
                for (int j = 0; j < wordsArr.length; j++) {
                    System.out.println("Введите cтроку " + x + ":");
                    wordsArr[j] = scan.nextLine();
                    x = x +1;
                }
            /*

             * Процедура вывода заполненного массива

            for (int j = 0; j < wordsArr.length; j++) {
                System.out.println("Строка " + y +": "+ wordsArr[j]);
                y = y + 1;
            }*/

                /**
                 *Процедура поиска самого длинного слова в массиве
                 */
                String MaxWord = "";
                for (int j = 0; j < wordsArr.length; j++){
                if(MaxWord.length() < wordsArr[j].length()){
                    MaxWord = wordsArr[j];
                }

                }
                 System.out.println("Самое длинное слово в массиве: "+ MaxWord);


            }
    }
}
