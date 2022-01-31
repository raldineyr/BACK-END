package fxml;

import java.net.URL;

import javafx.application.Application;
import javafx.stage.Stage;

public class AppFXML extends Application{

	@Override
	public void start(Stage primaryStage) throws Exception {
		URL arquivoFXML = getClass().getResource("/fxml/Login.fxml");
		
    
		primaryStage.show();
	}
	
	public static void main(String[] args) {
		launch(args);
	}

}
