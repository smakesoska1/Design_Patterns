package ba.unsa.etf.rpr.factoryPattern;


public class FactoryMain {

    public static void main( String[] args )
    {
        OperatingSystemFactory os=new OperatingSystemFactory();
        OS obj=os.getInstance("Open-Source");
        obj.spec();

    }
}
