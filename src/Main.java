
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		Cliente riquelme = new Cliente();
		venilton.setNome("Riquelme");
		Conta cc = new ContaCorrente(venilton);
		Conta poupanca = new ContaPoupanca(riquelme);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		Banco contaBanco = new Banco();
		contaBanco.adicionarContas(cc);
		contaBanco.adicionarContas(poupanca);
		System.out.println(contaBanco);


	}

}
