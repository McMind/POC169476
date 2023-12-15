package zad04;

public class NumberProcessor implements DataProcessor{
    @Override
    public String processData(String data) throws NullPointerException {
        if(data == null){
            throw new NullPointerException("Data is null");
        }
        return "Processed: " + data;
    }

    @Override
    public boolean isValid(String data) throws NullPointerException {
        if(data == null){
            throw new NullPointerException("Data is null");
        }
        return data.matches("-?\\d+(\\.\\d+)?");
    }
}
