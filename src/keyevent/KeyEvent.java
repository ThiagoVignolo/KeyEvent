/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package keyevent;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 *
 * @author Thiago Vignolo
 */
public class KeyEvent extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        Text mainText = new Text(20, 20, "A");
        mainText.setFocusTraversable(true);
        Pane root = new Pane();
        root.getChildren().add(mainText);
        
        mainText.setOnKeyPressed(event -> {
            if (null != event.getCode()) switch (event.getCode()) {
                case DOWN:
                    mainText.setY(mainText.getY()-10);
                    break;
                case UP:
                    mainText.setY(mainText.getY()+10);
                    break;
                case LEFT:
                    mainText.setX(mainText.getX()-10);
                    break;
                case RIGHT:
                    mainText.setX(mainText.getX()+10);
                    break;
                default:
                    mainText.setText(event.getText());
                    break;
            } 
        });
        
        Scene scene = new Scene(root, 300, 250);
        
        primaryStage.setTitle("Lambda MouseEvent");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
