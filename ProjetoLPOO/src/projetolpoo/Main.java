/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMain.java to edit this template
 */
package projetolpoo;

import java.io.FileNotFoundException;
import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author User
 */
public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws IOException {
        try {
            Parent root = FXMLLoader.load(getClass().getResource("views/Cadastro.fxml"));
            primaryStage.setTitle("Casa de Leilões do Zeca");
            Scene cena = new Scene(root);
            primaryStage.setScene(cena);
            primaryStage.show();
        } catch (NullPointerException e) {
            System.out.println("Erro de execução. Endereço do arquivo incorreto.");
            e.printStackTrace();
            throw e;
        } catch (FileNotFoundException e) {
            System.out.println("Arquivo não encontrado.");
            throw e;
        } catch (IOException e) {
            System.out.println("Erro de leitura.");
            throw e;
        } catch (Exception e) {
            System.out.println("Erro desconhecido.");
            throw e;
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
