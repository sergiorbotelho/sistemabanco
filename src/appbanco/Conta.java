package appbanco;

public class Conta {

	protected String nome;
	protected int num;
	protected double saldo;

	public Conta(String nome, int num, double saldo) {
		super();
		this.nome = nome;
		this.num = num;
		this.saldo = saldo;
	}

	public Conta() {
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public int getNum() {
		return num;
	}

	public void setNum(int n) {
		num = n;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double s) {
		saldo = s;
	}

	public void debite(double val) {
		if (val <= saldo) {
			saldo = saldo - val;
		} else
			System.out.println("Saldo insuficiente!");
	}

	public void credite(double val) {
		saldo = saldo + val;
	}

	
}