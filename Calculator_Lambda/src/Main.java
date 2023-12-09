public class Main {
    public static void main(String[] args) {
        Calculator calc = Calculator.instance.get();
        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1);
        //На ноль делить нельзя. Нужно предусмотреть условие, которое не позволит разделить на ноль и привести к ошибке.
        if (calc.isPositive.test(calc.abs.apply(b))) {
            int c = calc.divide.apply(a, b);
            calc.printInt.accept(c);
        } else {
            calc.printString.accept("No division by zero");
        }
    }
}