package abstractfactorydesign.checkBox;

public class WindowsCheckBoxButton implements CheckBox {
    @Override
    public void paint() {
        System.out.println("You have created Windows Check Box Button");
    }
}
