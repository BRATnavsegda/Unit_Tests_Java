package seminars.five.number;

import java.util.Collections;
import java.util.List;

public class MaxNumberModule {
//    Создайте два модуля. Первый модуль генерирует список случайных чисел. Второй модуль находит
//    максимальное число в этом списке.
//    Вам нужно сначала написать юнит-тесты для каждого модуля, затем написать интеграционный
//    тест, который проверяет, что оба модуля работают вместе правильно

    public int takeMaxNumber(List<Integer> asList) {
        return Collections.max(asList);
    }

}
