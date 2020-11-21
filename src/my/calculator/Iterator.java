package my.calculator;

public class Iterator {
    /**
     * Математическое выражение
     */
    private String string;

    /**
     * Индекс текущего символа строки
     */
    private int currentIndex;

    public Iterator(String string) {
        this.string = string.replace(" ", "");
        currentIndex = 0;
    }

    /**
     * Проверяет наличие следующего элемента сроки
     *
     * @return true, если следующий элемент строки существует, иначе - false
     */
    public boolean hasNext() {
        return  string != null &&
                !string.isEmpty() &&
                currentIndex < string.length();
    }

    /**
     * Возвращает следующий элемент строки
     *
     * @return элемент строки
     */
    String next() {
        StringBuilder operand = new StringBuilder();
        char element = string.charAt(currentIndex);

        while(Character.isDigit(element) || element == '.' || (currentIndex == 0 && element == '-') ||
                (currentIndex > 0 && string.charAt(currentIndex - 1) == '(' && element == '-')) {
            operand.append(element);
            currentIndex++;

            if(currentIndex == string.length())
                return operand.toString();

            element = string.charAt(currentIndex);
        }

        if(operand.length() != 0)
            return operand.toString();

        currentIndex++;
        return Character.toString(element);
    }
}
