
public class Main {

	public static void main(String[] args) {
		Cliente clienteGenerico = new Cliente();
		clienteGenerico.setNome("João");
		
		Conta cc = new ContaCorrente(clienteGenerico);
		cc.depositar(100);
		
		Conta poupanca = new ContaPoupanca(clienteGenerico);
		
		cc.transferir(50, poupanca);
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
	}

}
