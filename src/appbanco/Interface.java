package appbanco;

public interface Interface {
	
	public abstract void cadastro(String nome, int num, double conta);
	public abstract void login();
	public abstract void depositar();
	public abstract void saldo();
	public abstract void transferir();
	public abstract String relatorio(String nome, int num, double saldo);
	
}
