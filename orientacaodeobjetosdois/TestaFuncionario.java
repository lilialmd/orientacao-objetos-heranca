package orientacaodeobjetosdois;

public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente gerente1 = new Gerente("Lucas Velho", 30, 3000.0, "Gerente", "TI", 5);
        Gerente gerente2 = new Gerente("Uriel Zolpidem de Clonazepam", 35, 3500.0, "Gerente", "Desenvolvimento", 4);

        Vendedor vendedor1 = new Vendedor("Carolina Bodala", 25, 2000.0, "Vendedor", "Vendas", 500.0);
        Vendedor vendedor2 = new Vendedor("Alice Tsukino", 28, 2200.0, "Vendedor", "Vendas", 600.0);

        gerente1.visualizar();
        System.out.println();
        gerente2.visualizar();
        System.out.println();
        vendedor1.visualizar();
        System.out.println();
        vendedor2.visualizar();
	}

}
