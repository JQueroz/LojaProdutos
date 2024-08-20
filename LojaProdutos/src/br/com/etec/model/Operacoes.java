package br.com.etec.model;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Operacoes {
	@FXML
	private TextField txfUsuario;
	@FXML
	private PasswordField psfUsuario;
	@FXML
	private Button btnAcessar;
	
	@FXML
	private void acessarConta(ActionEvent event) {
		String nomeUsuario;
		nomeUsuario = txtUsuario.getText();
		
		String senhaUsuario;
		senhaUsuario = psfUsuario.getText();
		
		if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
			
			if(nomeUsuario.isEmpty()) {
			mostrarMensagem(Alert.AlertType.WARNING, "FALTANDO DADOS", "INFORMAR A SENHA");
			}
		}//if
	}//acessarConta
//---------------------------------------------------------------------------

	private void mostrarMensagem(Alert.AlertType tipo, String titulo, String mensagem);
	alerta.setTitle(titulo);
	alerta.setHeaderText(null);
	alerta.setContentText(mensagem);
	alerta.ShowAndWait();
}
