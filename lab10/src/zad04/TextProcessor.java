package zad04;

public class TextProcessor implements DataProcessor {
    @Override
    public String processData(String data) throws NullPointerException {
        if(data == null){
            throw new NullPointerException("Data is null");
        }
        return new StringBuilder(data).reverse().toString();
    }

    @Override
    public boolean isValid(String data) throws NullPointerException {
        if(data == null){
            throw new NullPointerException("Data is null");
        }
        return !data.isEmpty();
    }
}
