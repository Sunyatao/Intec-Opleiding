package hfdst18_lambda_expressions.oef1;

public class App {

    public static void main(String[] args) {

        TextPrinter tp = new TextPrinter("Hello this is an example of a sentence containing words");

        System.out.println("*** Words containing 'e' ***");
        tp.printFilteredWords((String s) -> s.contains("e"));

        System.out.println("*** Words longer than 4 letters");
        tp.printFilteredWords(s -> s.length() > 4);

        System.out.println("*** Words containing 'e' ***");
        tp.printFilteredWords((String s) -> s.startsWith("a"));

        System.out.println("*** Words containing 'e' ***");
        tp.printFilteredWords(s -> s.length() > 1 && s.charAt(1) == 'e');

       /* System.out.println("*** Words containing 'e' ***");
        tp.printFilteredWords(s -> {
            int counter = 0;
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == 'e') {
                    counter++;
                }

            }
            return counter == 2;
     */   }


    }

