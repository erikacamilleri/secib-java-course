package examples.javafx.chapter02;

import javafx.application.*;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ClickCounter extends Application {
    
    // ---- Data --------------------------------------

    int clickCounter = 0;

    // ---- Components --------------------------------

    Button btnClickMe;

    Label lblClickCount;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Create the button
        btnClickMe = new Button();
        btnClickMe.setText("Click me please!");
        btnClickMe.setOnAction(e -> onButtonClick());

        // Create the label
        lblClickCount = new Label();
        lblClickCount.setText("Number of clicks: " + clickCounter);

        // Add the label and button to the layout panel
        BorderPane borderLayoutPane = new BorderPane();
        borderLayoutPane.setTop(lblClickCount);
        borderLayoutPane.setCenter(btnClickMe);

        // Add the pane to the scene 
        Scene btnScene = new Scene(borderLayoutPane, 300, 250);

        // Finalise stage
        primaryStage.setScene(btnScene);
        primaryStage.setTitle("Click Counter App");

        // Switch on lights
        primaryStage.show();
    }

    public void onButtonClick() {
        // update data
        clickCounter++;
        // update components
        lblClickCount.setText("Number of clicks: " + clickCounter);
    }
}
