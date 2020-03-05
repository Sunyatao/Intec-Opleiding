package hfdst18_lambda_expressions.demo1;

@FunctionalInterface
public interface FuncInterface {

    void speak ();

    default void speakDefault () {
        System.out.println("No rest for the wicked!");
    }
}
