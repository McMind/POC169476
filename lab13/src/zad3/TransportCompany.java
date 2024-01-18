package zad3;

public class TransportCompany {
    private Transporter transporter;

    public TransportCompany(Transporter transporter) {
        this.transporter = transporter;
    }

    public void transportTo(String information) {
        transporter.moveTo(information);
    }
}
