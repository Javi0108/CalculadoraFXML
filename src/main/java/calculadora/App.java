package calculadora;

import calculadoraController.calcuadoraController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class App extends Application {

	private calcuadoraController controller;
	
	@Override
	public void start(Stage primaryStage) throws Exception {

		controller = new calcuadoraController();
		
		Scene scene = new Scene(controller.getView(), 540, 340);
		
		primaryStage.setTitle("CalculadoraFXML");
		primaryStage.setScene(scene);
		primaryStage.show();
		
	}

	public static void main(String[] args) {
		launch(args);
	}

}
