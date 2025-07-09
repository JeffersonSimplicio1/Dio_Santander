package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

        private List<item> itensLista;

        public CarrinhoDeCompras(){
            this.itensLista = new ArrayList<>();
        }
        public void adicionarItem (String nome, Integer quantidade, Double preco){
            itensLista.add(new item(nome, quantidade,  preco));
        }
        public void removerItem(String nome){
            List <item> itemParaRemover = new ArrayList<>();
            for(item t : itensLista){
                if(t.getNome().equalsIgnoreCase(nome)){
                    itemParaRemover.add(t);

                }
            }
            itensLista.removeAll(itemParaRemover);
        }
        public int obterNumeroTotalItens(){
            return itensLista.size();
        }
        public void obterDescricaoItem(){
            System.out.println(itensLista);
        }

        public static void main(String[] args) {
            list.OperacoesBasicas.ListaItens listaItens = new list.OperacoesBasicas.ListaItens();

            System.out.println("O numero total de itens na lista é: " + listaItens.obterNumeroTotalItens());
            listaItens.adicionarItem("feijão", 2, 5.10);
            listaItens.adicionarItem("Arroz", 2, 4.10);
            listaItens.adicionarItem("Macarrão", 3, 3.20);
            listaItens.adicionarItem("Açúcar", 3, 2.50);
            System.out.println("O numero total de itens na lista é: " + listaItens.obterNumeroTotalItens());
            listaItens.removerItem("Feijão");
            System.out.println("O numero total de itens na lista é: " + listaItens.obterNumeroTotalItens());
            listaItens.removerItem("arroz");
            System.out.println("O numero total de itens na lista é: " + listaItens.obterNumeroTotalItens());
            listaItens.obterDescricaoItem();


        }
    }


