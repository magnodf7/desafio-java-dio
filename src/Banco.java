import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco(String nome) {
		this.nome = nome;
		this.contas = new ArrayList<>();
	}

	public void adicionarContas(Conta conta) {
		contas.add(conta);
	}

	public void removerConta(Conta conta) {
		if (!contas.isEmpty()) {
			if (contas.contains(conta)) {
				contas.remove(conta);
			}
		} else {
			System.out.println("Conta não encontrada.");
		}
	}

	public Conta contemConta(Conta conta) throws Exception {
		Conta contaAux = null;
		if (!contas.isEmpty()) {
			if (contas.contains(conta)) {
				for (Conta contaAux1 : contas) {
					if (contaAux1.equals(conta)) {
						contaAux = contaAux1;
						break;
					}
				}
			}
		}
		throw new ExceptionContaNaoEncontrada("Conta não encontrada.");
	}
	public Conta buscarContaPorNumero(int numero) {
		if (!contas.isEmpty()) {
			for (Conta conta : contas) {
				if (conta.getNumero() == numero) {
					return conta;
				}
			}
		}
		return null; // Retorna null se a lista estiver vazia ou a conta não for encontrada
	}

	public List<Conta> buscarContasDoCliente(String nomeCliente) {
		List<Conta> contasCliente = new ArrayList<>();
		if (!contas.isEmpty()) {
			for (Conta conta : contas) {
				if (conta.getCliente().getNome().equals(nomeCliente)) {
					contasCliente.add(conta);
				}
			}
		}
		return contasCliente;
	}

	public double calcularSaldoTotal() {
		double saldoTotal = 0;
		if (!contas.isEmpty()) {
			for (Conta conta : contas) {
				saldoTotal += conta.getSaldo();
			}
		}
		return saldoTotal;
	}
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	@Override
	public String toString() {
		return "Banco, nome: " + nome + " +  contas=" + contas + " }";
	}
}
