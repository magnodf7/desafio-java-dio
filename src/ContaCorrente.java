
public class ContaCorrente extends Conta implements Comparable<Conta> {

	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Corrente ===");
		super.imprimirInfosComuns();
	}

	@Override
	public int compareTo(Conta o) {
		return o.getAgencia();
	}
}
