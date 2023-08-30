package principal;

import modelo.Aluno;
import util.MinhaLista;

/**
 *
 * @author Andre
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MinhaLista<String> lista1 = new MinhaLista<>();
        MinhaLista<Integer> lista2 = new MinhaLista<>();
        MinhaLista<Aluno> lista3 = new MinhaLista<>();
        MinhaLista<Double> lista4 = new MinhaLista<>();        

        lista1.adicionar("Aula POO");
        lista1.adicionar("TADS");
        
        lista2.adicionar(10);
        lista2.adicionar(54);
        
        lista3.adicionar(new Aluno("Pedrinho", "123"));
        lista3.adicionar(new Aluno("Aninha", "456"));
        
        lista4.adicionar(5.5);
        lista4.adicionar(8.2);

        exibirLista(lista1);
        exibirLista(lista2);
        exibirLista(lista3);
        exibirLista(lista4);  
    }
    
    public static <T> void exibirLista(MinhaLista<? extends T> lista){
        for (int i = 0; i < lista.getQuantidade(); i++) {
            System.out.println(lista.buscarElemento(i));   
        }
    }
}
