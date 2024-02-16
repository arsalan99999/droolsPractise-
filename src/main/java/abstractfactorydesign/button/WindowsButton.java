package abstractfactorydesign.button;

import abstractfactorydesign.button.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton");
    }
}
