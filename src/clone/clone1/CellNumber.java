package clone.clone1;

public class CellNumber  {
    Main main;
    private String number;
    private double coverage;

    public CellNumber(String number, double coverage) {
        this.number = number;
        this.coverage = coverage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public double getCoverage() {
        return coverage;
    }

    public void setCoverage(double coverage) {
        this.coverage = coverage;
    }

    @Override
    public String toString() {
        return "CellNumber{" +
                "number='" + number + '\'' +
                ", coverage=" + coverage +
                '}';
    }


}
