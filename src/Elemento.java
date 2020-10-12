public class Elemento<T>{
    
    protected T meuDado;
    protected Elemento<T> proximo;
    protected Elemento<T> anterior;

    public Elemento (T quem){ // Construtor da classe que cria um elemento recebido por parâmetro
        meuDado = quem;                                      // e aponta seus ponteiros para nulo
        proximo = null;
        anterior = null;
    }

    @Override
    public boolean equals (Object obj){ // Método que verifica se o objeto recebido por parâmetro
        if (meuDado.toString().contains(obj.toString())) {                      // existe na vaga
            return true;
        }
        else return false;
    }
}
