package util;

import java.lang.reflect.Array;

public class MinhaLista<E> {

    private E vet[];
    private int quantidade;

    public MinhaLista() {
        vet = (E[]) new Object[100];
        //this.vet = (E[]) Array.newInstance(Object.class, 100);
    }

    public MinhaLista(int tamanho) {
        vet = (E[]) new Object[tamanho];
    }

    public int getQuantidade() {
        return quantidade;
    }


    
    public void adicionar(E elemento) {
        if (quantidade < vet.length) {
            vet[quantidade] = elemento;
            quantidade++;
        }
        else{
            System.out.println("Lista está cheia!");
        }
    }
    
    public int posicaoDoElemento(E elemento){
        for (int i = 0; i <= quantidade; i++) {
            E element = vet[i];
            if(element.equals(elemento)){
                return i;
            }
        }
        return -1;
    }
    
    public void remover(E elemento){
        int posicaoElemento = posicaoDoElemento(elemento);
        if(posicaoElemento == -1){
            System.out.println("Elemento não foi encontrado na lista!");
            return;
        }
        
        vet[posicaoElemento] = null;
        if(posicaoElemento < quantidade){
            for (int i = posicaoElemento+1; i <= quantidade; i++) {
                vet[i-1] = vet[i];
            }
        }
        
        quantidade--;
    }
    
    public E buscarElemento(int posicao){
        if(posicao < 0 || posicao > quantidade){
            System.out.println("Posição inválida!");
            return null;
        }
        return vet[posicao];
    }

}
