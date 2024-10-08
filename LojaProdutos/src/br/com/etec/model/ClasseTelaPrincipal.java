package br.com.etec.model;

import java.awt.event.ActionEvent;

import javafx.scene.Node;
import javafx.scene.control.MenuItem;
import javafx.stage.Stage;
import javafx.fxml.FXML;

public class ClasseTelaPrincipal {
	
	@FXML
	private MenuItem mniFechar;
	@FXML
	private static Stage acpTelaPrincipal;
	
	@FXML
	public static void fecharTela(ActionEvent event) {
		acpTelaPrincipal = (Stage)((Node)event.getSource()).getScene().getWindow();
		acpTelaPrincipal.close();
	}

}
