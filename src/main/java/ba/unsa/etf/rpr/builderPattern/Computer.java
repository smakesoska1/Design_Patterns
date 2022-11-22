package ba.unsa.etf.rpr.builderPattern;

public class Computer {
    private String os;
    private String processor;
    private int memory;
    private double screenSize;
    private int storage;

    public Computer(String os, String processor, int memory, double screenSize, int storage) {
        this.os = os;
        this.processor = processor;
        this.memory = memory;
        this.screenSize = screenSize;
        this.storage = storage;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "\"os\"='" + os + '\'' +
                ", processor='" + processor + '\'' +
                ", memory=" + memory +
                ", screenSize=" + screenSize +
                ", storage=" + storage +
                '}';
    }
}
