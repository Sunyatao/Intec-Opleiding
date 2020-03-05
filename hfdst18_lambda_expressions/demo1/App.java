package hfdst18_lambda_expressions.demo1;

public class App {

    public static void main(String[] args) {

        FuncInterface fobj = new FuncInterface() {
            @Override
            public void speak() {
                System.out.println("This is quite cumbersome");
            }
        };

        fobj.speak();
        fobj.speakDefault();

        int a = 5;
        Square s = (int x) -> x * x;
        System.out.println(s.calculate(a));

        s = (x) -> x * x;
        s = (var x) -> x * x;

        System.out.println(s.calculate(a));


    }

}
