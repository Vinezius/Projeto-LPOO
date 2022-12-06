/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package projetolpoo.controllers;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
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
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javax.swing.JOptionPane;

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
    private Button btnLimpar;
    @FXML
    private Button btnCadastrar;
    @FXML
    private Button btnVoltar;
    @FXML
    private PasswordField passSenha;

    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private Label lblLogin;
    @FXML
    private TextField txtfLogin;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void limparCampos(ActionEvent event) {

        txtfEmail.setText("");
        txtfLogin.setText("");
        txtfNome.setText("");
        txtfEndereco.setText("");
        txtfTelefone.setText("");
        passSenha.setText("");

    }

    @FXML
    private void realizarCadastro(ActionEvent event) {

        String user = "postgres";
        String senha = "985241";
        String url = "jdbc:postgresql://localhost/leilao";

        String email = txtfEmail.getText();
        String login = txtfLogin.getText();
        String nome = txtfNome.getText();
        String endereco = txtfEndereco.getText();
        String telefone = txtfTelefone.getText();
        String senhaUsuario = passSenha.getText();

        try {
            Class.forName("org.postgresql.Driver");
            Connection conexao = DriverManager.getConnection(url, user, senha);
            System.out.println("Conexão concluída");

            try {
                Statement sessao = conexao.createStatement();
                ResultSet resultadoQuery = sessao.executeQuery("Insert into participante(email, login, nome, endereco, telefone, senha ) "
                        + "VALUES (" + email + "," + login + "," + nome + "," + endereco + "," + telefone + "," + senhaUsuario + ")");

                if (resultadoQuery.next() && email.matches("^(.+)@(.+)$*") && telefone.length() > 10 && !login.isBlank() && !nome.isBlank() && !endereco.isBlank() && !senhaUsuario.isBlank()) {
                    JOptionPane.showMessageDialog(null, "Cadastro realizado com sucesso!");
                    voltarLogin(event);
                    sessao.close();
                } else {
                    JOptionPane.showMessageDialog(null, "Erro ao realizar cadastro. Tente novamente.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Falha na conexão");
            e.printStackTrace();
        }

    }

    @FXML
    private void voltarLogin(ActionEvent event) {

        try {
            Parent root = FXMLLoader.load(getClass().getResource("../views/Login.fxml"));
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
