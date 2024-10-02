interface Button {
    void render();
}
interface Window {
    void render();
}
class WindowsButton implements Button {
    public void render() {
        System.out.println("Rendering a button in Windows style.");
    }
}
class WindowsWindow implements Window {
    public void render() {
        System.out.println("Rendering a window in Windows style.");
    }
}
class MacButton implements Button {
    public void render() {
        System.out.println("Rendering a button in Mac style.");
    }
}
class MacWindow implements Window {
    public void render() {
        System.out.println("Rendering a window in Mac style.");
    }
}
interface GUIFactory {
    Button createButton();
    Window createWindow();
}
class WindowsFactory implements GUIFactory {
    public Button createButton() {
        return new WindowsButton();
    }

    public Window createWindow() {
        return new WindowsWindow();
    }
}
class MacFactory implements GUIFactory {
    public Button createButton() {
        return new MacButton();
    }

    public Window createWindow() {
        return new MacWindow();
    }
}
public class abstract_fctr {
    public static void main(String[] args) {
        GUIFactory factory = new WindowsFactory();
        Button button = factory.createButton();
        Window window = factory.createWindow();
        button.render();
        window.render();

        factory = new MacFactory();
        button = factory.createButton();
        window = factory.createWindow();
        button.render();
        window.render();
    }
}
