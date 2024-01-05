package Zad01;
//Napisz program, który definiuje metodę checkAge(int age). Metoda ta powinna rzucić wyjątek IllegalArgumentException z
//odpowiednim komunikatem, jeśli podany wiek jest mniejszy niż 18. W głównej metodzie programu (main) wywołaj checkAge z różnymi wartościami
//i obsłuż wyjątek, wyświetlając stosowny komunikat dla użytkownika.
public class Main{
    public static void main(String[] args) {
        try{
            checkAge(17);
        }catch (IllegalArgumentException e) {
            System.out.println("Mniej niż 18 lat!");
        }
        //checkAge(17);
    }
    public static void checkAge(int age){
        if(age < 18){
            throw new IllegalArgumentException();
        }
        System.out.println("Wszystko ok");
    }
}
