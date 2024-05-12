import java.util.ArrayList;
import java.util.List;

public class Banco {

	private String nome;
	private List<Conta> contas;

	public Banco() {
		this.contas = new ArrayList<>();
	}

	public void adicionarContas(Conta conta) {
		contas.add(conta);
	}

	public void removerConta(Conta conta) {
		if (!contas.contains(conta)) {
			if (contas.contains(conta)) {
				contas.remove(conta);
			}
		}
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
		return "Banco{" +
				"contas=" + contas +
				", nome='" + nome + '\'' +
				'}';
	}
}
