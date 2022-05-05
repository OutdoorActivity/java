package java16.patternmatching;

public interface Spaceship {
    static double expectedTimeOfArrival(double distance, Spaceship ship) {

        if (ship instanceof BattleCruiser battleCruiser) { //pattern matching
            int battleCruiserEngineSpeed = battleCruiser.getSecondEngine() + battleCruiser.getFirstEngine();
            return distance / battleCruiserEngineSpeed;
            //pattern matching
        } else if (ship instanceof Cargo cargo) { //pattern matching
            int cargoEngineSpeed = cargo.getSecondEngine() + cargo.getFirstEngine();
            return distance / cargoEngineSpeed;
        }
        return 0.0;
    }
}

class BattleCruiser implements Spaceship {
    private int firstEngine;
    private int secondEngine;
    private int thirdEngine;
    private int fourthEngine;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BattleCruiser that = (BattleCruiser) o;

        if (firstEngine != that.firstEngine) return false;
        if (secondEngine != that.secondEngine) return false;
        if (thirdEngine != that.thirdEngine) return false;
        return fourthEngine == that.fourthEngine;
    }

    @Override
    public int hashCode() {
        int result = firstEngine;
        result = 31 * result + secondEngine;
        result = 31 * result + thirdEngine;
        result = 31 * result + fourthEngine;
        return result;
    }

    public BattleCruiser(int firstEngine, int secondEngine, int thirdEngine, int fourthEngine) {
        this.firstEngine = firstEngine;
        this.secondEngine = secondEngine;
        this.thirdEngine = thirdEngine;
        this.fourthEngine = fourthEngine;
    }

    public int getFirstEngine() {
        return firstEngine;
    }

    public int getSecondEngine() {
        return secondEngine;
    }

    public int getThirdEngine() {
        return thirdEngine;
    }

    public int getFourthEngine() {
        return fourthEngine;
    }
}

class Cargo implements Spaceship {
    private int firstEngine;
    private int secondEngine;

    public Cargo(int firstEngine, int secondEngine) {
        this.firstEngine = firstEngine;
        this.secondEngine = secondEngine;
    }

    public int getFirstEngine() {
        return firstEngine;
    }

    public int getSecondEngine() {
        return secondEngine;
    }
}
