package sample;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
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
        Label label1 = new Label();

        Button zeroBT = new Button("0");
        zeroBT.setOnAction(event -> label1.setText(label1.getText() + "0"));

        Button oneBT = new Button("1");
        oneBT.setOnAction(event -> label1.setText(label1.getText() + "1"));

        Button twoBT = new Button("2");
        twoBT.setOnAction(event -> label1.setText(label1.getText() + "2"));

        Button threeBT = new Button("3");
        threeBT.setOnAction(event -> label1.setText(label1.getText() + "3"));

        Button fourBT = new Button("4");
        fourBT.setOnAction(event -> label1.setText(label1.getText() + "4"));

        Button fiveBT = new Button("5");
        fiveBT.setOnAction(event -> label1.setText(label1.getText() + "5"));

        Button sixBT = new Button("6");
        sixBT.setOnAction(event -> label1.setText(label1.getText() + "6"));

        Button sevenBT = new Button("7");
        sevenBT.setOnAction(event -> label1.setText(label1.getText() + "7"));

        Button eightBT = new Button("8");
        eightBT.setOnAction(event -> label1.setText(label1.getText() + "8"));

        Button nineBT = new Button("9");
        nineBT.setOnAction(event -> label1.setText(label1.getText() + "9"));

        Button addBT = new Button("+");
        addBT.setOnAction(event -> label1.setText(label1.getText() + "*"));

        Button subtractBT = new Button("-");
        subtractBT.setOnAction(event -> label1.setText(label1.getText() + "-"));

        Button multiplyBT = new Button("*");
        multiplyBT.setOnAction(event -> label1.setText(label1.getText() + "*"));

        Button divideBT = new Button("/");
        divideBT.setOnAction(event -> label1.setText(label1.getText() + "/"));

        Button equalsBT = new Button("=");
        equalsBT.setOnAction(event -> {

        });

        Button clearBT = new Button("C");
        clearBT.setOnAction(event -> label1.setText(""));

        HBox h1 = new HBox();
        h1.getChildren().addAll(sevenBT, eightBT, nineBT);

        HBox h2 = new HBox();
        h2.getChildren().addAll(fourBT, fiveBT, sixBT);

        HBox h3 = new HBox();
        h3.getChildren().addAll(oneBT, twoBT, threeBT);

        HBox h4 = new HBox();
        h4.getChildren().addAll(clearBT, zeroBT, equalsBT);

        VBox v1 = new VBox();
        v1.getChildren().addAll(h1, h2, h3, h4);

        VBox v2 = new VBox();
        v2.getChildren().addAll(divideBT, multiplyBT, subtractBT, addBT);

        HBox h5 = new HBox();
        h5.getChildren().addAll(v1, v2);

        VBox root = new VBox();
        root.getChildren().addAll(label1, h5);

        Scene scene = new Scene(root, 500, 400);

        stage.setScene(scene);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
