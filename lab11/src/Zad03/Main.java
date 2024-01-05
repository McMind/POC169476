package Zad03;
//Zaprojektuj i zaimplementuj klasę wyjątku NiepoprawnyFormatDanychException, która będzie rozszerzać klasę Exception.
// Następnie napisz metodę sprawdzFormatDanych(String dane), która rzuci wyjątek NiepoprawnyFormatDanychException,
// jeśli podany ciąg znaków nie odpowiada określonemu wzorcowi (np. nie jest adresem e-mail).
// W metodzie main przetestuj działanie tej metody, obsługując wyjątek i informując użytkownika o błędzie.
public class Main {
    public static void main(String[] args) {
        try {
            String data = "11-11-2023";
            sprawdzFormatDanych(data);
            String zlaData = "11--1-2034";
            sprawdzFormatDanych(zlaData);
        } catch (NiepoprawnyFormatDanychException e) {
            System.out.println("Nieprawidłowa data");
        }
    }

    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException {
        if (!dane.matches("\\d{1,2}-\\d{1,2}-\\d{2,4}")) {
            throw new NiepoprawnyFormatDanychException();
        }
        System.out.println("Prawidłowe");
    }
}
