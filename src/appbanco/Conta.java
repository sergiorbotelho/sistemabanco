package appbanco;

public class Conta {

	protected int num;
	protected double saldo;

	public Conta(int num, double saldo) {
		super();
		this.num = num;
		this.saldo = saldo;
	}

	public Conta() {
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

	public void exibeConta() {
		System.out.println("-------------------------");
		System.out.println("Número: " + num);
		System.out.println("Saldo : " + saldo);
		System.out.println("=========================");
	}

	public String toString() {
		return "-------------------------\n" + "Número: " + num + "\n" + "Saldo : " + saldo + "\n"
				+ "=========================";
	}
}