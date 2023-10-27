public class Singleton {
    public static Singleton instacja;

    private Singleton(){

    }

    public static Singleton getInstance(){
        if(instacja == null){
            instacja = new Singleton();
        }
        return instacja;
    }

}
