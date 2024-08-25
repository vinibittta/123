package fintech1;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class TrasferenciaBancaria {
    private int contaOrigem;
    private int contaDestino;
    private double valor;
    private LocalDateTime dataHora;
    private boolean status;
    private int numDaTrasferencia;

    public TrasferenciaBancaria(){

    }

    public TrasferenciaBancaria(int contaOrigem, int contaDestino, double valor, LocalDateTime dataHora, boolean status, int numDaTrasferencia) {
        this.contaOrigem = contaOrigem;
        this.contaDestino = contaDestino;
        this.valor = valor;
        this.dataHora = dataHora;
        this.status = status;
        this.numDaTrasferencia = numDaTrasferencia;
    }

    public void fazerTrasferencia(){

        System.out.println("Fazer transferência Para : " + contaDestino);
        System.out.println("Valor da Trasferência: R$"+ valor);
        System.out.println("Data da trasferência: "+ dataHora);
        System.out.println("Solicitando Senha para usuario");
    }

    public void verificarStatus(){
        System.out.println("Status da Trasferência: "+ status);
        System.out.println("Horário e data: "+dataHora);
        System.out.println("Conta de destino: "+ contaDestino);
        System.out.println("Valor: " +valor);

    }
    public void verificarDetalhes(){
        System.out.println("Detalhes da Trasfêrencia: ");
        System.out.println("Conta de origem:"+ contaOrigem);
        System.out.println("Conta de destino: "+ contaDestino);
        System.out.println("Valor: R$"+valor);
        System.out.println("Data e Hora das trasferência:"+dataHora);

    }

    public int getContaOrigem() {
        return contaOrigem;
    }

    public void setContaOrigem(int contaOrigem) {
        this.contaOrigem = contaOrigem;
    }

    public int getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(int contaDestino) {
        this.contaDestino = contaDestino;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public int getNumDaTrasferencia() {
        return numDaTrasferencia;
    }

    public void setNumDaTrasferencia(int numDaTrasferencia) {
        this.numDaTrasferencia = numDaTrasferencia;
    }
}

