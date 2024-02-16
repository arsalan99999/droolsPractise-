package abstractfactorydesign.factory;

import abstractfactorydesign.button.Button;
import abstractfactorydesign.button.MacOSButton;
import abstractfactorydesign.checkBox.CheckBox;
import abstractfactorydesign.checkBox.MacOSCheckBoxButton;
import abstractfactorydesign.factory.GUIFactory;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new MacOSCheckBoxButton();
    }
}
