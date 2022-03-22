package examples.javafx.chapter01;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickMe extends Application {
    
    Button btnClickMe;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> onButtonClick());

        // Add the button to the layout panel
        BorderPane borderLayoutPane = new BorderPane();
        borderLayoutPane.setCenter(btnClickMe);

        // Add the pane to the scene 
        Scene btnScene = new Scene(borderLayoutPane, 300, 250);

        // Finalise stage
        primaryStage.setScene(btnScene);
        primaryStage.setTitle("Click Me App");

        // Switch on lights
        primaryStage.show();

    }

    public void onButtonClick() {
        if (btnClickMe.getText().equals("Click me please!")) {
            btnClickMe.setText("You clicked me!");
        } else {
            btnClickMe.setText("Click me please!");
        }
    }
}
