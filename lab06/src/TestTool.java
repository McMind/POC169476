public class TestTool {
    public static void main(String[] args) {
        Hammer mlotek = new Hammer("młotek");
    }
}
class Tool{
    protected Tool(String name){
    }
}
class Hammer extends Tool{
    protected Hammer(String name) {
        super(name);
    }

//    private Hammer(String name) {
//        super(name); //has private access
//    }
}