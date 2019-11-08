public class Banco {

	public static void main(String[] args) {
		Cliente jandira = new Cliente ("Jandira Silva");
		ContaCorrente conta_jandira = new ContaCorrente (84037,2500);
		jandira.ligar_conta(conta_jandira);
		
		Cliente sandra = new Cliente ("Sandra Rodrigues");
		ContaCorrente conta_sandra = new ContaCorrente (70662,1800);
		sandra.ligar_conta(conta_sandra);
		
		Cliente luciana = new Cliente ("Luciana Teixeira");
		ContaCorrente conta_luciana = new ContaCorrente (20718,5000);
		luciana.ligar_conta(conta_luciana);
		
		jandira.imprimir();
		sandra.imprimir();
		luciana.imprimir();
		
		System.out.println();
		
		jandira.retirada(1000);
		jandira.imprimir();
		System.out.println();
		sandra.retirada(2000);
		sandra.depositada(500);
		sandra.imprimir();
		sandra.retirada(2000);
		sandra.imprimir();
		System.out.println();
		luciana.depositada(1000);
		luciana.imprimir();
	}

}
