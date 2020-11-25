package appbanco;

import java.util.LinkedList;


public class Config implements Interface {

	LinkedList<Conta> conta = new LinkedList<Conta>(); 
	@Override
	public void depositar() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void saldo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void transferir() {
		// TODO Auto-generated method stub
		
	}

	

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void cadastro(String nome, int num, double saldo) {
		Conta a = new Conta();
		a.nome = nome;
		a.num = num;
		a.saldo = saldo;
		conta.add(a);
		
	}

	@Override
	public String relatorio(String nome, int num, double saldo) {
		Conta a = new Conta();
		for(Conta list : conta) {
			System.out.println(list.nome);
		}
		
		return null;
	}

	
	
}
