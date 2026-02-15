package oop.inheritance;

public class Fish extends Animal{
    private int fins;
    private int gills;

    // It is constructor
    public Fish(String type, double weight, int gills, int fins) {
        super("small", type, weight);
        this.fins = fins;
        this.gills = gills;
    }

    private void moveMuscle() {
        System.out.println("muscle moving");
    }

    private void moveBackFin() {
        System.out.println("backfin moving");
    }

    @Override
    public void move(String speed) {
        super.move(speed);
        moveMuscle();
        if (speed == "fast") {
            moveBackFin();
        }
        System.out.println();
    }

    @Override
    public String toString() {
        return "Fish{" +
                "fins=" + fins +
                ", gills=" + gills +
                "} " + super.toString();
    }
}
