import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;

public class Order {
    public int id;
    public String customerName;
    public LocalDate orderDate;

    public Order(int id, LocalDate orderDate) {
        this.id = id;
        this.orderDate = orderDate;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", orderDate=" + orderDate +
                '}';
    }

    public static void main(String[] args) {
        ArrayList<Order> orders = new ArrayList<>();
        orders.add(new Order(1,
                LocalDate.parse("2023-08-12")));
        orders.add(new Order(2,
                LocalDate.parse("2023-08-12")));
        orders.add(new Order(5,
                LocalDate.parse("2013-08-12")));
        orders.add(new Order(10,
                LocalDate.parse("2018-08-12")));
        orders.add(new Order(4,
                LocalDate.parse("2023-08-12")));
        orders.add(new Order(8,
                LocalDate.of(2023,12,5)));
        System.out.println(orders);
        orders.sort(new OrderByDate());
        System.out.println(orders);
    }
}
class OrderByDate implements Comparator<Order>{

    @Override
    public int compare(Order o1, Order o2) {
        int compare = o1.orderDate.compareTo(o2.orderDate);
        if(compare == 0){
            return Integer.compare(o1.id,o2.id);
        }
        return compare;
    }
}
