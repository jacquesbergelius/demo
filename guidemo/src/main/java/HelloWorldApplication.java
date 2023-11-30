import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloWorldApplication extends Application {
    private final static String HELLO1 = "Hello World!";
    private final static String HELLO2 = "Goodby World!";

    public void start(Stage window) {
        Label text = new Label("Hello World!");
        Button button1 = new Button("Click me!");
        Button button2 = new Button("Don't click me!");
        Button button3 = new Button("This button does nothing!");
        FlowPane componentGroup = new FlowPane();
        componentGroup.getChildren().add(text);
        componentGroup.getChildren().add(button1);
        componentGroup.getChildren().add(button2);
        componentGroup.getChildren().add(new Label("This is a label"));
        componentGroup.getChildren().add(button3);

        ButtonBoy buttonBoy = new ButtonBoy("Button 1");
        button1.setOnAction(buttonBoy);
        button2.setOnAction(new ButtonBoy("Button 2"));

        button3.setOnAction(new EventHandler<ActionEvent>() {
            public void handle(ActionEvent event) {
                if (text.getText().equals(HELLO1)) {
                    text.setText(HELLO2);
                } else
                    text.setText(HELLO1);
            }
        });

        Scene view = new Scene(componentGroup);
        window.setTitle("My Greeting Application");
        window.setScene(view);
        window.show();
    }
}