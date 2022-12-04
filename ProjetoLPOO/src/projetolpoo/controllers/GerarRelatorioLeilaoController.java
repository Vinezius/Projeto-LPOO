/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetolpoo.controllers;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

/**
 * FXML Controller class
 *
 * @author User
 */
public class GerarRelatorioLeilaoController implements Initializable {

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
    @FXML
    private TableView<?> tvTabelaItens;
    @FXML
    private TableColumn<?, ?> tbcNomeItem;
    @FXML
    private TableColumn<?, ?> tbcNomeLeilao;
    @FXML
    private TableColumn<?, ?> tbcLanceIntermediario;
    @FXML
    private TableColumn<?, ?> tbcLanceFinal;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
