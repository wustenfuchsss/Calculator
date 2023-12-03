
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите выражение:");
            String ex = sc.nextLine();
            String result = calc(ex);
            System.out.println(result);

        } catch(NumberFormatException q){
            System.out.println("Только числа от 1 до 10");
        } catch (ArrayIndexOutOfBoundsException o){
            System.out.println("В римской системе нет отрицательных чисел");
        } catch(RuntimeException f){
            System.out.println("Выражение введено некорректно");
        }

    }

    public static String calc(String input) {

        String[] x = input.split(" ");
        if(x.length != 3){
            throw new RuntimeException();
        }

        int n1;
        String op = x[1];
        int n2;
        int result;

        try {
            n1 = Integer.parseInt(x[0]);
            n2 = Integer.parseInt(x[2]);
            if(n1 > 10 | n2 > 10 | n1< 1 | n2 < 1){
                throw new ArithmeticException();
            }
            result = operation(n1, op, n2);
            return Integer.toString(result);
        } catch (NumberFormatException e) {
            n1 = Integer.parseInt(Converter.convertRomanianToArabic(x[0]));
            n2 = Integer.parseInt(Converter.convertRomanianToArabic(x[2]));
            result = operation(n1, op, n2);
            return Converter.convertArabicToRomanian(result);
        }
    }

    public static int operation(int number1, String operation, int number2) {
        return switch (operation) {
            case "/" -> number1 / number2;
            case "*" -> number1 * number2;
            case "-" -> number1 - number2;
            case "+" -> number1 + number2;
            default -> throw new RuntimeException();
        };
    }
}
