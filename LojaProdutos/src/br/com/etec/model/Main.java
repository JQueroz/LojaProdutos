package br.com.etec.model;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("/br/com/etec/view/telaLogin.fxml"));
			Scene scene = new Scene(root);
			scene.getStylesheets().add(getClass().getResource("/br/com/etec/view/application.css").toExternalForm());
			primaryStage.setScene(scene);
			
			primaryStage.initStyle(StageStyle.UNDECORATED);
			
			primaryStage.show();
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
