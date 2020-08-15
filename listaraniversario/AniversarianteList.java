package listaraniversario;

import java.util.AbstractList;
import java.util.Arrays;

public class AniversarianteList<E> extends AbstractList<E> implements IAniversarianteList<E> {
    private E[] aniversariantes;
    private int index;
    private int size;
    
    public AniversarianteList(){
        index = 0;
        size = 1;
        aniversariantes = (E[]) new Object[1];
    }
    
    @Override
    public E get(int index){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException("O indice informado está fora do tamanho do vetor");
        }
        return aniversariantes[index];
    }
    
    @Override
    public E set(int index, E aniversariante){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException("O indice informado está fora do tamanho do vetor");
        }
        return (aniversariantes[index] = aniversariante);
    }
    
    @Override
    public int size(){
        return aniversariantes.length;
    }
    
    @Override
    public void sort(){
        aniversariantes = removeNulls(aniversariantes);
        Arrays.sort(aniversariantes);
    }
    
    public E[] removeNulls(E[] aniversariante) {
        E[] arrayCopy = (E[]) new Object[index];
        for(int i = 0; i < index; i++){
            arrayCopy[i] = aniversariantes[i];
        }
        return arrayCopy;
    }
    
    @Override
    public E remove(int index){
        if(index > size() || index < 0 || aniversariantes[index] == null){
            throw new ArrayIndexOutOfBoundsException();
        }
        E elemento = aniversariantes[index];
        aniversariantes[index] = null;
        for(int i = index; i < aniversariantes.length-1; i++){
            aniversariantes[i] = aniversariantes[i+1];
        }
        this.index--;
        return elemento;
    }
    
    @Override
    public boolean add(E aniversariante){
        if(index < size()){
            aniversariantes[index++] = aniversariante;
        }else{
            size *= 2;
            aniversariantes = Arrays.copyOfRange(aniversariantes, 0, size);
            aniversariantes[index++] = aniversariante;
        }
        return true;
    }
}
