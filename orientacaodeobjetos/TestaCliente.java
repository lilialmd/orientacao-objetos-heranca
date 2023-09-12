package orientacaodeobjetos;

public class TestaCliente {

	public static void main(String[] args) {
		PessoaFisica pessoaFisica1 = new PessoaFisica("Lucas Velho", "Rua 1 - Alvorada - RS", "lucasold@email.com", "123456789", "111.222.333-44", "12345678");
        PessoaFisica pessoaFisica2 = new PessoaFisica("Uriel Zolpidem de Clonazepam", "Rua 2 - Camboriu - SC", "urielzolpidem@email.com", "987654321", "999.888.777-66", "23456789");
        PessoaJuridica pessoaJuridica1 = new PessoaJuridica("Empresa 1", "Rua 3 - Alvorada - RS", "empresa1@email.com", "123456789", "111.222.333-44", "11223344556677");
        PessoaJuridica pessoaJuridica2 = new PessoaJuridica("Empresa 2", "Rua 4 - Camboriu - SC", "empresa2@email.com", "987654321", "999.888.777-66", "99887766554433");

        pessoaFisica1.visualizar();
        System.out.println();
        pessoaFisica2.visualizar();
        System.out.println();
        pessoaJuridica1.visualizar();
        System.out.println();
        pessoaJuridica2.visualizar();

	}

}
