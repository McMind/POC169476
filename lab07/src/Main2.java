public class Main2 {
    public static void main(String[] args) {
        // Napisz metodę statyczną capitalizeEverySecond,
        // która przyjmuje jako argument obiekt typu StringBuilder.
        // Metoda ma zmienić każdą drugą literę na wielką. Stwórz przypadek testowy.
        StringBuilder zdanie = new StringBuilder("Ala3ma5kOTa");
        System.out.println(zdanie);
        capitalizeEverySecond(zdanie);
        System.out.println(zdanie);
    }
    public static void capitalizeEverySecond(StringBuilder zdanie){
        for(int i = 1; i < zdanie.length(); i += 2){
            zdanie.setCharAt(i,Character.toUpperCase(zdanie.charAt(i)));
        }
    }
}
