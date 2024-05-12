import java.util.List;

public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente riquelme = new Cliente();
		riquelme.setNome("Riquelme");
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(riquelme);

		cc.depositar(100);
		cc.transferir(100, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco contaBanco = new Banco("santander");
		contaBanco.adicionarContas(cc);
		contaBanco.adicionarContas(poupanca);
		System.out.println(contaBanco);

		contaBanco.removerConta(cc);
		try {
			System.out.println("Conta está no banco: " + contaBanco.contemConta(cc));
		} catch (ExceptionContaNaoEncontrada e) {
			System.out.println("A conta não está no banco.");
		} catch (Exception e) {
            throw new RuntimeException(e);
        }

        Conta contaEncontrada = contaBanco.buscarContaPorNumero(2);
		if (contaEncontrada != null) {
			System.out.println("Conta encontrada: " + contaEncontrada);
		} else {
			System.out.println("Conta não encontrada.");
		}

		List<Conta> contasDoCliente = contaBanco.buscarContasDoCliente("Riquelme");
		if (!contasDoCliente.isEmpty()) {
			System.out.println("Contas do cliente Riquelme: " + contasDoCliente);
		} else {
			System.out.println("Não há contas do cliente Riquelme.");
		}

		System.out.println("Saldo total do banco: " + contaBanco.calcularSaldoTotal());
	}
}
