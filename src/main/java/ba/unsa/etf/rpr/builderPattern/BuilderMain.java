package ba.unsa.etf.rpr.builderPattern;

public class BuilderMain {

        public static void main( String[] args )
        {
            Computer comp=new ComputerBuilder().setOs("Windows").setStorage(500).setMemory(16).getComputer();
            System.out.println(comp);
        }

}
