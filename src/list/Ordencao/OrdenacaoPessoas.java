package list.Ordencao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas(){
        this.pessoaList = new ArrayList<>();
    }
    public  void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>();
        if (!pessoaList.isEmpty()){
            Collections.sort(pessoasPorIdade, new ComparatorPorAltura());
            return pessoasPorIdade;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    public  List<Pessoa> pessoasPorAltura() {
            List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
            if (!pessoaList.isEmpty()) {
                Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
                return pessoasPorAltura;
            } else {
                throw new RuntimeException("A lista está vazia!");
            }
        }

    public static void main(String[] args) {
        //Criando um instancia da classe OrdenacaoPessoas
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        //Adicionando pessoas a lista

        ordenacaoPessoas.adicionarPessoa("Alice", 20, 1.56);
        ordenacaoPessoas.adicionarPessoa("ob", 30, 1.80);
        ordenacaoPessoas.adicionarPessoa("harlie", 25, 1.70);
        ordenacaoPessoas.adicionarPessoa("David", 17, 1.56);

        //Exibindo a lista de pessoas adicionadas

        System.out.println(ordenacaoPessoas.pessoaList);

        // Ordenando e exibindo por idade

        System.out.println(ordenacaoPessoas.ordenarPorIdade());

        //Ordenando e exibindo por altura

        System.out.println(ordenacaoPessoas.pessoasPorAltura());
    }

}



