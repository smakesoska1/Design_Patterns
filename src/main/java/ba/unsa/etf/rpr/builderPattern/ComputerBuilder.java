package ba.unsa.etf.rpr.builderPattern;

public class ComputerBuilder {
    private String os;
    private String processor;
    private int memory;
    private double screenSize;
    private int storage;

    public ComputerBuilder setOs(String os) {
        this.os = os;
        return this;
    }

    public ComputerBuilder setProcessor(String processor) {
        this.processor = processor;
        return this;
    }

    public ComputerBuilder setMemory(int memory) {
        this.memory = memory;
        return this;
    }

    public ComputerBuilder setScreenSize(double screenSize) {
        this.screenSize = screenSize;
        return this;
    }

    public ComputerBuilder setStorage(int storage) {
        this.storage = storage;
        return this;
    }

    public Computer getComputer(){
        return new Computer(os,processor,memory,screenSize,storage);
    }
}
