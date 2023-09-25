//Задание 1.
// * В классе Calculator создайте метод calculateDiscount, который принимает сумму покупки и процент скидки и
// возвращает сумму с учетом скидки. Ваша задача - проверить этот метод с использованием библиотеки AssertJ. Если метод
// calculateDiscount получает недопустимые аргументы, он должен выбрасывать исключение ArithmeticException. Не забудьте
// написать тесты для проверки этого поведения.

package org.Task_1;

public class Calculator {

    public static void main(String[] args) {



    }

    public static double calculateDiscount(double purchase, int discount) {
        if (discount < 0 || discount > 100)
            throw new ArithmeticException("Discount must be between 0 and 100.");
        else if (purchase <= 0) {
            throw new ArithmeticException("Purchase can't be zero or below");
        }

        return purchase - (purchase / 100 * discount);
    }
}