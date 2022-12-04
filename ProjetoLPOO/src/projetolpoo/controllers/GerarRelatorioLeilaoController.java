/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetolpoo.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.stage.Stage;

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

    private Stage stage;
    private Scene scene;
    private Parent root;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void voltarPraHome(ActionEvent event) {
    }

    @FXML
    private void listarLeiloes(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/ListarLeiloes.fxml"));
            stage = (Stage) ((Node) mnbMenu).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();

        } catch (NullPointerException e) {
            System.out.println("Erro de execução. Endereço do arquivo incorreto.");
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro de leitura.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido.");
            throw e;
        }

    }

    @FXML
    private void cadastrarLeilao(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/CadastrarLeilao.fxml"));
            stage = (Stage) ((Node) mnbMenu).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (NullPointerException e) {
            System.out.println("Erro de execução. Endereço do arquivo incorreto.");
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro de leitura.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido.");
            throw e;
        }

    }

    @FXML
    private void gerarRelatorioLeilao(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/GerarRelatorioLeilao.fxml"));
            stage = (Stage) ((Node) mnbMenu).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
        } catch (NullPointerException e) {
            System.out.println("Erro de execução. Endereço do arquivo incorreto.");
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
        } catch (IOException e) {
            System.out.println("Erro de leitura.");
        } catch (Exception e) {
            System.out.println("Erro desconhecido.");
            throw e;
        }

    }

    @FXML
    private void sair(ActionEvent event) {
    }

}
