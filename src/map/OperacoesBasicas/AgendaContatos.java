package map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    //atributis
    private Map<String, Integer> agendaContatoMap;

    //construtor
    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone ){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if (!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda de contatos está vazia!");
        }
    }

    public void exibirContato(){
        if (!agendaContatoMap.isEmpty()){
            System.out.println(agendaContatoMap);
        }else {
            System.out.println("A agenda de contatos está vazia!");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()){
            numeroPorNome = agendaContatoMap.get(nome);
            if (numeroPorNome == null){
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Camila", 123456);
        agendaContatos.adicionarContato("Camila", 76543);
        agendaContatos.adicionarContato("Camila Cavalcante", 111111);
        agendaContatos.adicionarContato("Camila Dio", 654987);
        agendaContatos.adicionarContato("Maria Silva", 11111111);
        agendaContatos.adicionarContato("Camila", 44444);

        agendaContatos.exibirContato();
        //remover um contato
        agendaContatos.removerContato("Maria Silva");
        agendaContatos.exibirContato();

        //pesquisar numero por nome
        String nomePesquisa = "João";
        Integer numeroPesquisa = agendaContatos.pesquisarPorNome("João");
        System.out.println("Numero de telefone de " + nomePesquisa + ": " + numeroPesquisa);

        String nomePesquisaNaoExiste = "Paula";
        Integer numeroPesquisaNaoExiste = agendaContatos.pesquisarPorNome(nomePesquisaNaoExiste);
        System.out.println("Número de telefone de " + nomePesquisaNaoExiste + ": " + numeroPesquisaNaoExiste);
    }
}
