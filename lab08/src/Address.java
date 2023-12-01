public record Address(String street, int houseNumber, String postalCode, String city) {
    public static void main(String[] args) {
        Address adres = new Address("Warszawska",31,"00-000","Olsztyn");
        Person osoba1 = new Person("Adam","Kowalski",adres);
    }
}
