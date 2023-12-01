package kolos1;

public class TestPerson {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder();
        a.append("abcd");
        String b = "1234567";
        System.out.println(a);
        Person.insertSubstring(a,b);
        System.out.println(a);
    }
}

class Person{
    //. Napisz metodę statyczną insertSubstring, która przyjmuje dwa argumenty:
    //StringBuilder sb oraz String toInsert. Metoda ma wstawiać toInsert w
    //środek pierwotnego StringBuilder. Stwórz przypadek testowy.

    public StringBuilder sb;

    public String toInsert;

    public Person(){}

    public Person(StringBuilder sb, String toInsert) {
        this.sb = sb;
        this.toInsert = toInsert;
    }

    public static void insertSubstring(StringBuilder sb, String toInsert){
        int srodek = (sb.length() / 2);
        if(sb.length() % 2 != 0){
            srodek++;
        }
        for(int i = 0; i < toInsert.length(); i++){
            sb.insert(srodek++,toInsert.charAt(i));
        }
    }
}