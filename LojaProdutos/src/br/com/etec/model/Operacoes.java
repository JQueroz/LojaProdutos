package br.com.etec.model;


import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Operacoes {
	@FXML
	private TextField txtUsuario;
	@FXML
	private PasswordField psfUsuario;
	@FXML
	private Button btnAcessar;
	@FXML
	private Button btnFechar;
	
	@FXML
	private void acessarConta(ActionEvent event) {
		String nomeUsuario;
		
		nomeUsuario = txtUsuario.getText();
		
		String senhaUsuario;
		senhaUsuario = psfUsuario.getText();
		
		if(nomeUsuario.isEmpty() || senhaUsuario.isEmpty()) {
			
			if(nomeUsuario.isEmpty()) {
			mostrarMensagem(Alert.AlertType.WARNING, "FALTANDO DADOS", "INFORMAR O USUÁRIO");
			}
			else {
				if(senhaUsuario.isEmpty()) {
				mostrarMensagem(Alert.AlertType.WARNING, "FALTANDO DADOS", "INFORMAR A SENHA");
				}
			}
			
		}//if
		
		else {
			if(nomeUsuario.equals("admin") && senhaUsuario.equals("123456")){
				mostrarMensagem(Alert.AlertType.CONFIRMATION, "ACESSO PERMIOTIDO", "Logado no Sistema");}
			else {
				mostrarMensagem(Alert.AlertType.ERROR, "ERRO DE ACESSO", "Usuario ou senha errada.");
			}
		}
	}//acessarConta
//---------------------------------------------------------------------------

	private void mostrarMensagem(Alert.AlertType tipo, String titulo, String mensagem) {
	Alert alerta = new Alert(tipo);
	alerta.setTitle(titulo);
	alerta.setHeaderText(null);
	alerta.setContentText(mensagem);
	alerta.showAndWait();
	}
}

//---------------------------------------------------------------------------
@FXML
private void fecharTela(ActionEvent event) {
	
	
}