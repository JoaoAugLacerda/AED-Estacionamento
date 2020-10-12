public class EstruturaDeDados<T> {

    protected Elemento<T> primeiro;
    protected Elemento<T> ultimo;

    public EstruturaDeDados (){ // Construtor da classe que cria os sentinelas da lista
        primeiro = new Elemento<T>(null);
        ultimo = primeiro;
    }

    public boolean vazia (){ // Método que verifica se lista está vazia
        if (primeiro.proximo == null ) {
            return true;
        }
        else return false;
    }
}
