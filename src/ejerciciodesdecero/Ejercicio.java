package ejerciciodesdecero;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Ejercicio extends Application {
	Scene mainScene;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		VBox mainBox = new VBox();
		mainScene = new Scene(mainBox);
		Button botonAceptar = new Button("Aceptar");
		botonAceptar.setOnAction(e -> stage.close());;

		mainBox.getChildren().add(botonAceptar);
		stage.setScene(mainScene);
		stage.show();
	}
}
