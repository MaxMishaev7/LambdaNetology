public class Main {
    public static void main(String[] args) {

        OnTaskDoneListener callback = System.out::println;
        OnTaskErrorListener error = (i) -> {
            return i == 13?  "\nError! Task " + i + " is not completed\n": "Task " + i + " is completed";};

        Worker dima = new Worker(callback, error);
        dima.start();
    }
}