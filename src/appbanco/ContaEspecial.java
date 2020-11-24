package appbanco;

public class ContaEspecial extends Conta {
	protected double limite;

	public ContaEspecial(String nome, int num, double saldo, double limite) {
		super(nome, num, saldo);
		this.limite = limite;
	}

	@Override
	public void debite(double val) {
		if (val <= (saldo + limite)) {
			saldo = saldo - val;
		} else
			System.out.println("Saldo insuficiente!");
	}

	@Override
	public void exibeConta() {
		super.exibeConta();
		System.out.println("Limite: " + limite);
		System.out.println("=========================");
	}

	@Override
	public String toString() {
		return super.toString() + "\nLimite: " + limite + "\n" + "=========================";
	}
}
