package map.Pesquisa;

public class Produto {
    //atributos

    private String nome;
    private double preco;
    private int quantidade;

    //construtor




    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //metodo acessor get

    public String getNome() {
        return nome;
    }
    public double getPreco() {
        return preco;
    }
    public int getQuantidade() {
        return quantidade;
    }

    //To String


    @Override
    public String toString() {
        return "EstoqueProdutos{" +
                "nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                '}';
    }
}
