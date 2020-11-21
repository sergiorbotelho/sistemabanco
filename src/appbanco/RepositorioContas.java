package appbanco;
import java.util.LinkedList;

public class RepositorioContas {

	private LinkedList<Conta> rep;

	public RepositorioContas() {
		rep = new LinkedList<Conta>();
	}

	public boolean insConta(Conta c) {
		rep.addLast(c);
		return true;
	}

	public Conta buscaConta(int n) {
		for (int i = 0; i < rep.size(); i++) {
			if (n == rep.get(i).getNum())
				return rep.get(i);
		}
		return null;
	}

	public String toString() {
		String s = "";
		for (int i = 0; i < rep.size(); i++) {
			s = s + "[" + i + "] Número: " + rep.get(i).getNum() + " | Saldo: " + rep.get(i).getSaldo() + "\n";
		}
		return s;
	}

}