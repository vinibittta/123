package fintech1;

import java.util.Date;

public class Extrato {
    private int numConta;
    private Date periodoInicial;
    private Date periodoFinal;
    private double saldoInicial;
    private double saldoFinal;


    public Extrato(){

    }

    public Extrato(int numConta, Date periodoInicial, Date periodoFinal, double saldoInicial, double saldo) {
        this.numConta = numConta;
        this.periodoInicial = periodoInicial;
        this.periodoFinal = periodoFinal;
        this.saldoInicial = saldoInicial;
        this.saldoFinal = saldoFinal;
    }
    public void gerarExtrato(){
        System.out.println("Gerando Extrato: ");
        System.out.println("Numero da Conta: "+ numConta);
        System.out.println("escolha Periodo final e inicial: "+ periodoInicial, periodoFinal);
        System.out.println("Saldo Inicial: R$ "+ saldoInicial);
        System.out.println("Final Final: R$ "+saldoFinal);
    }
    public void mostarSaldoInical(){
        System.out.println("Saldo Inicial: R$ "+saldoInicial);
    }

    public void calcularSaldoFinal(){
        System.out.println("Mostrar saldo inical: R$ "+ saldoInicial);
        System.out.println("Saldo final: R$ "+ saldoFinal);
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public Date getPeriodoInicial() {
        return periodoInicial;
    }

    public void setPeriodoInicial(Date periodoInicial) {
        this.periodoInicial = periodoInicial;
    }

    public Date getPeriodoFinal() {
        return periodoFinal;
    }

    public void setPeriodoFinal(Date periodoFinal) {
        this.periodoFinal = periodoFinal;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public double getSaldoFinal() {
        return saldoFinal;
    }

    public void setSaldoFinal(double saldoFinal) {
        this.saldoFinal = saldoFinal;
    }
}
