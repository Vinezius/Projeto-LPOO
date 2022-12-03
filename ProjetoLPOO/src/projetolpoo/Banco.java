package projetolpoo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Banco {
    
    public static void main(String[] args) {
        
        try{
            Statement s;
            String usuario = "postgres";
            String senha = "985241";
            String url = "jdbc:postgresql://localhost:5432/leilao";
            
            Class.forName("org.postgresql.Driver");
           
            Connection c = DriverManager.getConnection(url, usuario, senha);
//            s = c.createStatement();
            System.out.println("deu boa");
//            s.executeQuery("INSERT INTO tabela VALUES ('valor1', 'valor2')");
            
            c.close();
        }catch(Exception E){
            System.out.println("\n" + E);
            
        }
    }
}
