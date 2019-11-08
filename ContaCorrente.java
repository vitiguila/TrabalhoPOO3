public class ContaCorrente {
	private int numero;
	private double saldo;
	
	public ContaCorrente(int numero,double saldo){
		this.numero = numero;
		this.saldo = saldo;
	}
	public void depositar(double valor) {
		saldo += valor;
	}
	public void sacar(double valor) {
		if(saldo > valor) {
			saldo -= valor;
		}
		else {
			System.out.println("Não é possivel efetuar a retirada, Saldo insuficiente");
		}
	}
	public void imprimir_dados () {
		System.out.println("Numero da conta: " + numero);
		System.out.println("Saldo da conta " + saldo);
	}
}
