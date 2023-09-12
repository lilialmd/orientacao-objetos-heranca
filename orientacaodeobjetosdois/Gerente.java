package orientacaodeobjetosdois;

public class Gerente extends Funcionario {
	private int numFuncionariosGerenciados;

    public Gerente(String nome, int idade, double salario, String cargo, String departamento, int numFuncionariosGerenciados) {
        super(nome, idade, salario, cargo, departamento);
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }

    public int getNumFuncionariosGerenciados() {
        return numFuncionariosGerenciados;
    }

    public void setNumFuncionariosGerenciados(int numFuncionariosGerenciados) {
        this.numFuncionariosGerenciados = numFuncionariosGerenciados;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Número de funcionários gerenciados: " + numFuncionariosGerenciados);
    }
}
