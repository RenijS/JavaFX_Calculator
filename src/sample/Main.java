package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage){
        primaryStage.setTitle("Calculator");
        build(primaryStage);
        primaryStage.show();
    }

    public static void build(Stage stage){
        TextField textField = new TextField();
        textField.setPrefColumnCount(10);
        textField.setMinWidth(10);

        Button[] digitsBT = new Button[10];
        HBox h1 = new HBox();
        HBox h2 = new HBox();
        HBox h3 = new HBox();
        HBox h4 = new HBox();
        for (int i = 0; i<digitsBT.length; i++){
            Integer iWrapper = new Integer(i);
            digitsBT[i] = new Button(i + "");
            digitsBT[i].setOnAction(event -> textField.appendText(iWrapper.toString()));
            if(i > 6 && i<=9) {
                h1.getChildren().addAll(digitsBT[i]);
            }
            else if(i>3 && i<7) {
                h2.getChildren().addAll(digitsBT[i]);
            }
            else if(i>0 && i<4) {
                h3.getChildren().addAll(digitsBT[i]);
            }
            else {
                h4.getChildren().addAll(digitsBT[i]);
            }
        }

        Button addBT = new Button("+");
        addBT.setOnAction(event -> textField.appendText("+"));

        Button subtractBT = new Button("-");
        subtractBT.setOnAction(event -> textField.appendText("-"));

        Button multiplyBT = new Button("*");
        multiplyBT.setOnAction(event -> textField.appendText("*"));

        Button divideBT = new Button("/");
        divideBT.setOnAction(event -> textField.appendText("/"));

        Button equalsBT = new Button("=");
        equalsBT.setOnAction(event -> {

        });

        Button clearBT = new Button("C");
        clearBT.setOnAction(event -> textField.clear());

        h4.getChildren().addAll(clearBT, equalsBT);

        VBox v1 = new VBox();
        v1.getChildren().addAll(h1, h2, h3, h4);

        VBox v2 = new VBox();
        v2.getChildren().addAll(divideBT, multiplyBT, subtractBT, addBT);

        HBox h5 = new HBox();
        h5.getChildren().addAll(v1, v2);

        VBox root = new VBox();
        root.getChildren().addAll(textField, h5);

        Scene scene = new Scene(root, 500, 400);

        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
