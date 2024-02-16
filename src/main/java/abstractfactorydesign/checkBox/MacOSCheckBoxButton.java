package abstractfactorydesign.checkBox;

public class MacOSCheckBoxButton implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created MacOS CheckBox Button");
    }
}
