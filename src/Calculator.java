public class Calculator {
    public <T extends Number, U extends Number> Double sum(T number1, U number2) {

        Double a = number1.doubleValue();
        Double b = number2.doubleValue();
        return a + b;
    }

    public <T extends Number, U extends Number> Double multiply(T number1, U number2) {
        Double a = number1.doubleValue();
        Double b = number2.doubleValue();
        return a * b;
    }

    public <T extends Number, U extends Number> Double divide(T number1, U number2) {
        Double a = number1.doubleValue();
        Double b = number2.doubleValue();
        return a / b;
    }

    public <T extends Number, U extends Number> Double substract(T number1, U number2) {
        Double a = number1.doubleValue();
        Double b = number2.doubleValue();
        return a - b;
    }



}

