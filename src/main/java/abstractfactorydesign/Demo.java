package abstractfactorydesign;

import abstractfactorydesign.factory.GUIFactory;
import abstractfactorydesign.factory.MacOSFactory;
import abstractfactorydesign.factory.WindowsFactory;

public class Demo {
    public static void main(String[] args) {
        String operatingSystem = "os";

        ClientCode clientCode;
        GUIFactory guiFactory;
        if(operatingSystem.equalsIgnoreCase("os")){
            guiFactory = new MacOSFactory();
        }else{
            guiFactory = new WindowsFactory();
        }
        clientCode = new ClientCode(guiFactory);
        clientCode.paint();
    }
}
