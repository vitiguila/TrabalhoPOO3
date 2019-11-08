public class Cliente {
	private String nome;
	private ContaCorrente contacorrente;
	
	public Cliente (String nome) {
		this.nome = nome;
	}
	public void ligar_conta (ContaCorrente contacorrente) {
		this.contacorrente = contacorrente;
		System.out.println("A conta de " + nome +" esta devidamente ligada");
		System.out.println();
	}
	public void depositada(double valor) {
		contacorrente.depositar(valor);
		System.out.println("Foi depositado na conta de " + nome + " o valor de R$" + valor );
	}
	public void retirada (double valor) {
		contacorrente.sacar(valor);
		
	}
	public void imprimir() {
		System.out.println(nome);
		contacorrente.imprimir_dados();
		System.out.println();
	}
}


