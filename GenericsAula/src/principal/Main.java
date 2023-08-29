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
        
        lista1.adicionar("Aula POO");
        lista1.adicionar("TADS");
        
        lista2.adicionar(10);
        lista2.adicionar(54);
        
        lista3.adicionar(new Aluno("Pedrinho", "123"));
        lista3.adicionar(new Aluno("Aninha", "456"));
        
        for (int i = 0; i < lista1.getQuantidade(); i++) {
            System.out.println(lista1.buscarElemento(i));   
        }
        System.out.println("");
        
        for (int i = 0; i < lista2.getQuantidade(); i++) {
            System.out.println(lista2.buscarElemento(i));   
        }
        System.out.println("");
        
        for (int i = 0; i < lista3.getQuantidade(); i++) {
            System.out.println(lista3.buscarElemento(i));   
        }
    }
}
