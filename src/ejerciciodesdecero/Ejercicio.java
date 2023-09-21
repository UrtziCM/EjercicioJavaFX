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
		/* Creacion de panel y escena principal */
		BorderPane mainPane = new BorderPane();
		mainScene = new Scene(mainPane);
		
		/* Creamos un boton y un textfield para que se introduzcan datos */
		Button botonAceptar = new Button("Aceptar");
		Button botonCerrar = new Button("x");
		TextField txtfNombre = new TextField();

		/* Establecemos el outcome de pulsar el boton */
		botonAceptar.setOnAction(e -> modalSaludo(txtfNombre.getText()));

		/* Centramos el boton en la pantalla */
		BorderPane.setAlignment(botonAceptar, Pos.CENTER);
		/* Colocamos ambos campos en el panel principal */
		mainPane.setCenter(txtfNombre); // Panel en el centro
		mainPane.setBottom(botonAceptar); // Panel en la parte de abajo

		botonCerrar.setOnAction(e -> stage.close());
		BorderPane.setAlignment(botonAceptar, Pos.CENTER);
		mainPane.setCenter(txtfNombre);
		mainPane.setBottom(botonAceptar);
		mainPane.setTop(botonCerrar);
		botonAceptar.setAlignment(Pos.CENTER);

		BorderPane.setAlignment(botonCerrar, Pos.TOP_RIGHT);

		stage.setResizable(false);
		stage.setHeight(100);
		stage.setWidth(200);
		/* Establecemos la escena y enseñamos la ventana */
		stage.setScene(mainScene);
		stage.show();
	}
	/**
	 * Crea una ventana modal a partir del nombre dado,
	 * en caso de que el nombre coincida con obi wan sin
	 * tener en cuenta si es mayus. o minus. , responderá con 
	 * 'General Kenobi' en caso contrario simplemente aparecerá: 
	 * "Hola " + nombre (parámetro)
	 * 
	 * @param nombre Nombre del TextField de la ventana padre
	 */
	private static void modalSaludo(String nombre) {
		Stage modal = new Stage();
		modal.setTitle(""); // Borramos el título
		VBox mainPane = new VBox();
		Scene modalScene = new Scene(mainPane);
		/* Si el nombre es Obi Wan o derivados, cambiamos el saludo a General Kenobi*/
		Text txtModal =(nombre.toLowerCase().contains("obi wan"))? new Text("General Kenobi!"):new Text("Hola " + nombre);
		mainPane.getChildren().add(txtModal);
		modal.setWidth(150);
		modal.setHeight(75);
		/* Establecemos escena y enseñamos la ventana */
		modal.setScene(modalScene);
		modal.show();
	}
}
