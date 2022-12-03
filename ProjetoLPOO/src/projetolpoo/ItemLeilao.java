package projetolpoo;

public class ItemLeilao {
    
    private int idItem;
    private String titulo;
    private String descricao;
    private double lanceMinimo;
    private String caminhoFoto;
    private boolean arrematado;

    public ItemLeilao(int idItem, String titulo, String descricao, double lanceMinimo, String caminhoFoto, boolean arrematado) {
        this.idItem = idItem;
        this.titulo = titulo;
        this.descricao = descricao;
        this.lanceMinimo = lanceMinimo;
        this.caminhoFoto = caminhoFoto;
        this.arrematado = arrematado;
    }

}
