package orientacaodeobjetosdois;

public class Funcionario {
	private String nome;
    private int idade;
    private double salario;
    private String cargo;
    private String departamento;

    public Funcionario(String nome, int idade, double salario, String cargo, String departamento) {
        this.nome = nome;
        this.idade = idade;
        this.salario = salario;
        this.cargo = cargo;
        this.departamento = departamento; 
    }

	private String getNome() {
		return nome;
	}

	private void setNome(String nome) {
		this.nome = nome;
	}

	private int getIdade() {
		return idade;
	}

	private void setIdade(int idade) {
		this.idade = idade;
	}

	private double getSalario() {
		return salario;
	}

	private void setSalario(double salario) {
		this.salario = salario;
	}

	private String getCargo() {
		return cargo;
	}

	private void setCargo(String cargo) {
		this.cargo = cargo;
	}

	private String getDepartamento() {
		return departamento;
	}

	private void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	
	public void visualizar() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Salário: " + salario);
        System.out.println("Cargo: " + cargo);
        System.out.println("Departamento: " + departamento);
    }
}
