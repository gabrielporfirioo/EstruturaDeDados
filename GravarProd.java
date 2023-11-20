// Gabriel Porfírio dos Santos - 01591399
//Arthur Nogueira Silveira de Lima Santos - 01610363
//Victor Levy Ferreira Torres - 01656685
// Allan



package Pacote2;



import meuPacote.Regpro;
import java.util.ArrayList;





public class GravarProd {
	
	public static void main(String[] args) {
        // Crie um ArrayList para armazenar objetos Regpro
		
		//Regpro reg = new Regpro(int codigo, String descricao, double preco, int qtd);
		
		
	
        ArrayList<Regpro> listaDeProdutos = new ArrayList<>();
        
        // Adicione objetos Regpro à lista
        listaDeProdutos.add(new Regpro(1, "Produto A", 10.99, 100,1));
        listaDeProdutos.add(new Regpro(2, "Produto B", 5.99, 50, 4));
        listaDeProdutos.add(new Regpro(3, "Produto C", 7.49, 75, 6));

        // Acesse os objetos na lista
        for (Regpro produto : listaDeProdutos) {
            System.out.println("Código: " + produto.getCodigo());
            System.out.println("Descrição: " + produto.getDescricao());
            System.out.println("Preço: " + produto.getPreco());
            System.out.println("Quantidade: " + produto.getQtd());
            System.out.println("Categoria: " + produto.getCategoria());

            
            System.out.println();
        }
   
	
	
	
	
	}
	
}
