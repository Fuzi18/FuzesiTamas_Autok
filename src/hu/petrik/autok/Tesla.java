package hu.petrik.autok;

public class Tesla implements Auto{
    private double sebesseg = 0;

    Tesla() {
        sebesseg = Math.floor(Math.random() * 60);
    }
    @Override
    public void gyorsul() {
        sebesseg += Math.floor(Math.random() * 10) + 5;
    }

    @Override
    public double getSebesseg() {
        return sebesseg;
    }
}
