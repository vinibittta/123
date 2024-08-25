package fintech1;

public class Perfil {
    private String nome;
    private int telefone;
    private double cpf;
    private String dataDeNascimento;

    public Perfil(){

    }

    public Perfil(String nome, int telefone, double cpf, String dataDeNascimento) {
        this.nome = nome;
        this.telefone = telefone;
        this.cpf = cpf;
        this.dataDeNascimento = dataDeNascimento;
    }
    public void exibirDadosPerfil(){
        System.out.println("Nome: " + this.nome);
        System.out.println("Telefone: " + this.telefone);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Data de Nascimento: " + this.dataDeNascimento);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public double getCpf() {
        return cpf;
    }

    public void setCpf(double cpf) {
        this.cpf = cpf;
    }

    public String getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(String dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }
}
