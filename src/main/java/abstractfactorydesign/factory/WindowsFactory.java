package abstractfactorydesign.factory;

import abstractfactorydesign.button.Button;
import abstractfactorydesign.button.WindowsButton;
import abstractfactorydesign.checkBox.CheckBox;
import abstractfactorydesign.checkBox.WindowsCheckBoxButton;
import abstractfactorydesign.factory.GUIFactory;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new WindowsCheckBoxButton();
    }
}
