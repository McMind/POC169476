package zad04;

public interface DataProcessor {
    abstract public String processData(String data) throws NullPointerException;
    abstract public boolean isValid(String data) throws NullPointerException;
}
