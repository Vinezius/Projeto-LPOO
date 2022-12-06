/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetolpoo.controllers;

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
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.sql.*;
import java.util.Scanner;
import javafx.scene.control.PasswordField;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author User
 */
public class LoginController implements Initializable {

    @FXML
    private Text txtTitulo;
    @FXML
    private Text txtLogin;

    @FXML
    private Button btnAcessar;
    @FXML
    private Button BtnCadastrar;
    @FXML
    private PasswordField passSenha;
    @FXML
    private TextField txtfLogin;
    @FXML
    private Label lblLogin;

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

    private void irPraHome(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/Home.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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
    private void realizarLogin(ActionEvent event) {

        String user = "postgres";
        String senha = "985241";
        String url = "jdbc:postgresql://localhost/leilao";

        String login = txtfLogin.getText();
        String senhaUsuario = passSenha.getText();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão concluída");

            try {
                Statement sessao = conexao.createStatement();
                ResultSet resultadoQuery = sessao.executeQuery("Select * from participante where login = ' " + login + " ' and senha = '" + senhaUsuario + "'");
                if (resultadoQuery.next()) {
                    JOptionPane.showMessageDialog(null, "Login realizado com sucesso!");
                    irPraHome(event);
                    sessao.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Login ou senha incorretos.");

                }
            } catch (SQLException e) {
                System.out.println("Erro de conexão.");
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Tabela não encontrada");
        }

    }

    @FXML
    private void telaDeCadastro(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/Cadastro.fxml"));
            stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

}
