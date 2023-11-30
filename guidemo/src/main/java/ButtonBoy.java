import javafx.event.*;
public class ButtonBoy implements EventHandler<ActionEvent> {
    private String name;

    public ButtonBoy(String name) {
        this.name = name;
    }

    public void handle(ActionEvent event) {
        System.out.printf("%s was clicked\n", this.name);
    }
}
