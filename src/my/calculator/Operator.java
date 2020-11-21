package my.calculator;

import java.util.HashMap;
import java.util.Map;

/**
 * Класс, хранящий приоритеты операций.
 */
public class Operator {
    /**
     * Словарь, хранящий приоритеты операций.
     */
    private final Map<String, Integer> map;

    public Operator() {
        map = new HashMap<>();
        this.addOperator("+", 1);
        this.addOperator("-", 1);
        this.addOperator("*", 2);
        this.addOperator("/", 2);
    }

    /**
     * Возвращает приоритет операции.
     *
     * @param operator оператор
     * @return приоритет операции
     */
    public Integer getPriority(String operator) {
        return map.get(operator);
    }

    /**
     * Добавляет оператор.
     *
     * @param operator оператор
     * @param priority приоритет операции
     */
    public void addOperator(String operator, int priority) {
        map.put(operator, priority);
    }
}
