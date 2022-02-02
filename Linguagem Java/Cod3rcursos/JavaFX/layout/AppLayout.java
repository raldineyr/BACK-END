package layout;

import javafx.application.Application;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class AppLayout extends Application {

	@Override
	public void start(Stage primaryStage) throws Exception {
		
		/*
		VBox temp = new VBox();
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		temp.getChildren().add(new Quadrado());
		
		Scene principal = new Scene(temp, 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();
		*/
		
		//Scene principal = new Scene(new TesteAnchorPane(), 800, 600);
		
		Parent raiz = null;
		raiz = new TesteAnchorPane();
		raiz = new TesteBorderPane();
		raiz = new TesteFlowPane();
		raiz = new TesteGridPane();
		raiz = new TesteStackPane();
		raiz = new TesteTilePane();
		
		Scene principal = new Scene(raiz, 800, 600);
		
		primaryStage.setScene(principal);
		primaryStage.setTitle("Gerenciadores de Layout");
		primaryStage.show();	
	} 
	
	public static void main (String[] args){
		
		launch(args);
	}
}
