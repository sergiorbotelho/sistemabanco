package appbanco;

public class ContaEspecial extends Conta {
	protected double limite;

	public ContaEspecial(String nome, int num, double saldo, double limite) {
		super(nome, num, saldo);
		this.limite = limite;
	}

}
