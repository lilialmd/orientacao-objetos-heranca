package orientacaodeobjetosdois;

public class Vendedor extends Funcionario {
	private double comissao;

    public Vendedor(String nome, int idade, double salario, String cargo, String departamento, double comissao) {
        super(nome, idade, salario, cargo, departamento);
        this.comissao = comissao;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    @Override
    public void visualizar() {
        super.visualizar();
        System.out.println("Comissão: " + comissao);
    }
}
