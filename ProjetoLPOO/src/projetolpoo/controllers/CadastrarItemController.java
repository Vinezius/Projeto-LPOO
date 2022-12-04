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
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * FXML Controller class
 *
 * @author User
 */
public class CadastrarItemController implements Initializable {

    @FXML
    private Label lblNomeItem;
    @FXML
    private TextField txtfNomeItem;
    @FXML
    private Label lblDescricaoItem;
    @FXML
    private TextField txtfDescricaoItem;
    @FXML
    private Label lblLanceMinimo;
    @FXML
    private TextField txtfLanceMinimo;
    @FXML
    private Label lblCaminhoFoto;
    @FXML
    private TextField txtfCaminhoFoto;
    @FXML
    private Text txtCadastrarItem;
    @FXML
    private Button btnConcluir;
    @FXML
    private Button btnVoltar;
    @FXML
    private MenuBar mnbMenu;
    @FXML
    private Menu btnMenu;
    @FXML
    private Menu mnLeiloes;
    @FXML
    private MenuItem btnListarLeiloes;
    @FXML
    private MenuItem btnCadastrarLeilao;
    @FXML
    private MenuItem btnGerarRelatorio;
    @FXML
    private Menu btnSair;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
