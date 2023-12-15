package zad04;

public class TestProcessor {
    public static void main(String[] args) throws NullPointerException {
        String string = "AbCdE";
        String stringNumber = "12.3";
        TextProcessor textProcessor = new TextProcessor();
        System.out.println(textProcessor.processData(string));
        System.out.println(textProcessor.isValid(string));
        NumberProcessor numberProcessor = new NumberProcessor();
        System.out.println(numberProcessor.processData(stringNumber));
        System.out.println(numberProcessor.isValid(stringNumber));
        System.out.println(numberProcessor.isValid(string));
    }
}
