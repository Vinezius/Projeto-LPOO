/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetolpoo.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CadastroController implements Initializable {

    @FXML
    private Text txtLogin;
    @FXML
    private Label lblEmail;
    @FXML
    private Text txtTitulo;
    @FXML
    private Label lblNome;
    @FXML
    private Label lblEndereco;
    @FXML
    private Label lblTelefone;
    @FXML
    private TextField txtfEmail;
    @FXML
    private Label lblSenha;
    @FXML
    private TextField txtfNome;
    @FXML
    private TextField txtfEndereco;
    @FXML
    private TextField txtfTelefone;
    @FXML
    private TextField txtfSenha;
    @FXML
    private Button btnLimpar;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnVoltar;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
