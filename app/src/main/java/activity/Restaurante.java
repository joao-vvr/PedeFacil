package activity;

/**
 * Created by joao on 08/02/17.
 */

public class Restaurante {
    private String nome;
    private int imagem; // vai armazenar o identificador do recurso
    private String tipo;

    public Restaurante(String nome, String tipo, int imagem) {
        this.nome = nome;
        this.tipo = tipo;
        this.imagem = imagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getImagem() {
        return imagem;
    }

    public void setImagem(int imagem) {
        this.imagem = imagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}