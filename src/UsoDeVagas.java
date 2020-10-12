public class UsoDeVagas{

    private String placaCarro; // Atributos da classe
    private String IdVaga;
    private String horaEntrada;
    private String horaSaida;

    public UsoDeVagas (String placa, String id, String entrada, String saida){ // Construtor que cria
        placaCarro = placa;                                                          // uma nova vaga
        IdVaga = id;
        horaEntrada = entrada;
        horaSaida = saida;
    }

    public String toString (){
        return "ID Vaga: " + IdVaga + "\n" +
        "Placa do Carro: " + placaCarro + "\n" +
        "Hora de Entrada: " + horaEntrada + "\n" +
        "Hora de Saída: " + horaSaida + "\n";
    }
}
