import java.util.function.BinaryOperator;
import java.util.function.UnaryOperator;
import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Consumer;

public class Calculator {
    static Supplier<Calculator> instance = Calculator::new;

    public Calculator() {

    }

    BinaryOperator<Integer> plus = (x,y) -> x + y;
    BinaryOperator<Integer> minus = (x,y) -> x - y;
    BinaryOperator<Integer> multiply = (x,y) -> x * y;
    BinaryOperator<Integer> divide = (x,y) -> x / y;
    UnaryOperator<Integer> pow = x -> x * x;
    UnaryOperator<Integer> abs = x -> x < 0 ? -x : x;
    Predicate<Integer> isPositive = x -> x > 0;
    Consumer<Integer> printInt = System.out::println;
    Consumer<String> printString = System.out::println;



}
