package set.Pesquisa;

import java.lang.invoke.StringConcatFactory;
import java.util.Objects;

public class Contato {

    //atributos

    private String nome;
    private int numero;

    //contrutor


    public Contato(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    //metodo acessor Get
    public String getNome() {
        return nome;
    }
    public int getNumero() {
        return numero;
    }
    //metodo acessor Set
    public void setNumero(int numero) {
        this.numero = numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Contato contato)) return false;
        return Objects.equals(getNome(), contato.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome());
    }
    //to String

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
