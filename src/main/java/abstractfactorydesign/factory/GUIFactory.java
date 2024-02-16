package abstractfactorydesign.factory;

import abstractfactorydesign.button.Button;
import abstractfactorydesign.checkBox.CheckBox;

public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
