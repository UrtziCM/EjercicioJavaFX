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

		botonAceptar.setOnAction(e -> modalSaludo(txtfNombre.getText()));
		BorderPane.setAlignment(botonAceptar, Pos.CENTER);
		mainPane.setCenter(txtfNombre);
		mainPane.setBottom(botonAceptar);
		botonAceptar.setAlignment(Pos.CENTER);
		stage.setScene(mainScene);
		stage.show();
	}

	private static void modalSaludo(String nombre) {
		Stage modal = new Stage();
		modal.setTitle("");
		VBox mainPane = new VBox();
		Scene modalScene = new Scene(mainPane);
		if (nombre.toLowerCase().equals("obi wan")) {
			mainPane.getChildren().add(new Text("General Kenobi!"));
		} else {
			mainPane.getChildren().add(new Text("Hola " + nombre));
		}

		modal.setScene(modalScene);
		modal.show();
	}
}
