package abstractfactorydesign;

import abstractfactorydesign.button.Button;
import abstractfactorydesign.checkBox.CheckBox;
import abstractfactorydesign.factory.GUIFactory;

//ClientCode interacts with the products and factory interfaces.
//It does not interact with the concrete classes.
public class ClientCode {
    private Button button;
    private CheckBox checkBox;

    public ClientCode(GUIFactory guiFactory) {
        this.button = guiFactory.createButton();
        this.checkBox = guiFactory.createCheckBox();
    }

    public void paint(){
        button.paint();
        checkBox.paint();
    }
}
