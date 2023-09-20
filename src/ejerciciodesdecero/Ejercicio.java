package ejerciciodesdecero;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class Ejercicio extends Application {
	Scene mainScene;
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage stage) throws Exception {
		BorderPane mainPane = new BorderPane();
		mainScene = new Scene(mainPane);
		Button botonAceptar = new Button("Aceptar");
		TextField txtfNombre = new TextField();

		botonAceptar.setOnAction(e -> txtfNombre.getText());
		BorderPane.setAlignment(botonAceptar, Pos.CENTER);
		mainPane.setCenter(txtfNombre);
		mainPane.setBottom(botonAceptar);
		botonAceptar.setAlignment(Pos.CENTER);

		stage.setResizable(false);
		stage.setHeight(100);
		stage.setWidth(200);
		stage.setScene(mainScene);
		stage.show();
	}
}
