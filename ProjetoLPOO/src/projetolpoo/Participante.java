package projetolpoo;

public class Participante {
    
    private int idParticipante;
    private String login;
    private String senha;
    private String nome;
    private String email;
    private String endereco;
    private String telefone;

    public Participante(int idParticipante, String login, String senha, String nome, String email, String endereco, String telefone) {
        this.idParticipante = idParticipante;
        this.login = login;
        this.senha = senha;
        this.nome = nome;
        this.email = email;
        this.endereco = endereco;
        this.telefone = telefone;
    }

}
