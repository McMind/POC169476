package kolos1;

public class TestMusician {
    public static void main(String[] args) {
        Musician muzyk = new Musician("aa","bb");
        StringBuilder wyjscie = muzyk.writeSong(4);
        System.out.println(wyjscie);
        Guitarist gitarzysta = new Guitarist("aa","bb","cc");
        StringBuilder wyjscie2 = gitarzysta.writeSong(4);
        System.out.println(wyjscie2);
        System.out.println(muzyk);
        System.out.println(gitarzysta);
        System.out.println(muzyk.equals(gitarzysta));
        System.out.println(muzyk.equals(muzyk));
    }
}
