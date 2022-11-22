package ba.unsa.etf.rpr.factoryPattern;

public class OperatingSystemFactory {
    public OS getInstance(String str){
        if(str.equals("Open-Source")){
            return new Android();
        }
        else if(str.equals("Closed")){
            return new iOS();
        }else{
            return new Windows();
        }

    }
}
