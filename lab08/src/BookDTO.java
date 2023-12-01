public record BookDTO(String title, String author, double price, int yearOfPublication) {
    public static void main(String[] args) {
        BookDTO k1 = new BookDTO("Harri Pota", "JKR", 49.99,1997);
        BookDTO k2 = new BookDTO("W pustyni i w puszczy", "HS", 39.99, 1910);
        System.out.println(k1);
    }
}
