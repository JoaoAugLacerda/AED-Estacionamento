public class Lista<T> extends EstruturaDeDados<T> {
    
    public T localizar (T quem){ // Método que localiza os dados de uma vaga, recebendo
        Elemento<T> aux = new Elemento<T>(null);   // a placa como parâmetro e retorna a vaga
        aux = (Elemento<T>)primeiro.proximo;
        while (!aux.equals(quem)) {
            aux = (Elemento<T>)aux.proximo;
        }
        return aux.meuDado;
    }

    public T retirar (T quem){ // Método que remove uma vaga, recebendo a placa 
        Elemento<T> aux = new Elemento<T>(null);   // como parâmetro e retorna a vaga
        aux = (Elemento<T>)primeiro.proximo;
        while (!aux.equals(quem)) {
            aux = (Elemento<T>)aux.proximo;
        }

        if (aux != null) {
            ((Elemento<T>)aux.anterior).proximo = aux.proximo;
            if (aux == ultimo){
                ultimo = aux.anterior;
                aux.proximo = null; aux.anterior=null;
            return aux.meuDado;
            }
            ((Elemento<T>)aux.proximo).anterior = aux.anterior;
            aux.proximo = null; aux.anterior=null;
            return aux.meuDado;
        }
        else return null;
    }

    public void inserir (T novo){ // Método para adicionar uma nova vaga, recebendo o objeto por parâmetro
        Elemento<T> novoElemento = new Elemento<T>(novo);
        ultimo.proximo = novoElemento;
        novoElemento.anterior = ultimo;
        ultimo = novoElemento;
    }


    public String toString (){ // Método que imprime todas as vagas da lista
        Elemento<T> aux = new Elemento<T>(null);
        aux = (Elemento<T>)primeiro.proximo;
        String print = "";
        while (aux != null) {
            print += aux.meuDado.toString() + "\n";
            aux = (Elemento<T>)aux.proximo;
        }
        return print;
    }
}
