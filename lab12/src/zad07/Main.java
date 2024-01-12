package zad07;

public class Main {
    public static void main(String[] args) {
        try{
            sprawdzFormatDanych("Ala ma kota");
            sprawdzFormatDanych("Ala");
        }catch(NiepoprawnyFormatDanychException e){
            System.out.println(e.getMessage());
        }
    }
    public static void sprawdzFormatDanych(String dane) throws NiepoprawnyFormatDanychException{
        if(dane.length() < 4){
            throw new NiepoprawnyFormatDanychException("Dane krótsze niż 4 znaki");
        }
        System.out.println("Poprawne");
    }
}
