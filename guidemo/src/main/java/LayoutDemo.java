import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import java.awt.*;

public class LayoutDemo extends Application {
    private static final int SEL = 2;
    @Override
    public void start(Stage window) {
        Scene view = null;

        if (SEL == 0) {
            window.setTitle("BorderPane Demo");
            BorderPane layout = new BorderPane();

            Button topButton = new Button("NORTH");
            Button rightButton = new Button("EAST");
            Button bottomButton = new Button("SOUTH");
            Button leftButton = new Button("WEST");
            Button centerButton = new Button("CENTER");

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

            layout.setTop(topButton);
            layout.setRight(rightButton);
            //layout.setBottom(bottomButton);
            layout.setLeft(leftButton);
            layout.setCenter(centerButton);
            layout.setBottom(componentGroup);

            layout.setAlignment(topButton, Pos.CENTER);
            layout.setAlignment(componentGroup, Pos.CENTER);

            layout.setAlignment(leftButton, Pos.CENTER_LEFT);
            layout.setAlignment(rightButton, Pos.CENTER_RIGHT);
            view = new Scene(layout);
        } else if (SEL == 1) {
            window.setTitle("GridPane Demo");
            GridPane layout = new GridPane();

            Button button1 = new Button("TOP LEFT");
            Button button2 = new Button("TOP RIGHT");
            Button button3 = new Button("BOTTOM LEFT");
            Button button4 = new Button("BOTTOM RIGHT");
            Button button5 = new Button("MIDDLE (with long text)");

            layout.add(button1, 0, 0);
            layout.add(button2, 1, 0);
            layout.add(button3, 0, 1);
            layout.add(button4, 1, 1);
            layout.add(button5, 0, 2, 2, 1);

            view = new Scene(layout);
        } else if (SEL == 2) {
            HBox layout = new HBox();

            Button[] buttons = new Button[12];

            for (int i = 0; i < 12; i++) {
                buttons[i] = new Button(Integer.toString(i + 1));
                buttons[i].setOnAction(new ButtonBoy(Integer.toString(i + 1)));
                layout.getChildren().add(buttons[i]);
            }

            view = new Scene(layout);
            view.getStylesheets().add("style.css");
        } else if (SEL == 3) {
            StackPane layout = new StackPane();

            Button button1 = new Button("[           ]");
            Label label = new Label("Hello!");

            label.setOpacity(0.5);

            layout.getChildren().add(button1);
            layout.getChildren().add(label);

            view = new Scene(layout);
        } else if (SEL == 4) {
            VBox layout = new VBox();

            Button button = new Button("CLICK ME!");
            button.setOnAction(new ButtonBoy("Green button"));
            layout.getChildren().add(button);

            view = new Scene(layout);

            view.getStylesheets().add("style.css");
        } else if (SEL == 5) {
            System.out.println("Starting canvas demo");
            window.setTitle("Canvas Demo");

            Canvas canvas = new Canvas(200, 200);
            GraphicsContext gc = canvas.getGraphicsContext2D();
            gc.setFill(Color.GREEN);
            gc.fillOval(70, 70, 60, 30);

            canvas.setFocusTraversable(true);
            canvas.setOnKeyPressed(event -> {
                KeyCode keyCode = event.getCode();
                System.out.println("Key pressed: " + keyCode);
            });

            canvas.setOnMouseMoved(event -> {
                double x = event.getX();
                double y = event.getY();
                System.out.println("Mouse moved to (" + x + ", " + y + ")");
            });

            StackPane root = new StackPane(canvas);
            view = new Scene(root, 200, 200);
        } else if (SEL == 6) {
            /* Check the screen size */
            Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
            System.out.println("Screen size, width " + screenSize.width + ", height " + screenSize.height);
            double width = screenSize.getWidth() / 3;
            double height = screenSize.getHeight() / 2;

            try {
                window.setScene(new Scene(new AnchorPane(), width, height));
                window.show();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        window.setScene(view);
        window.show();
    }

    /* JavaFX does not start inside the GUI class */
    //public static void main(String[] args) { LayoutDemo.launch(LayoutDemo.class); }
}