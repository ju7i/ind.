
class Programa {
	double Salario;
public static void main(String[] args) {
// TODO Auto-generated method stub
	Conta minhaConta;
	minhaConta = new Conta();
	minhaConta.Saldo = 1800;
	//minhaConta.Saca(6000);
	//System.out.println("Objeto Minha Conta ------>" +minhaConta.Saldo);

	//segundo objeto referenciado
	Conta Continha;
	Continha = new Conta();
	//Continha.Saca(200);
	//-------------------------------------------------------------------
	minhaConta.transfere(Continha,700);
	minhaConta.transfere(Continha,100);
	}
}
	//System.out.println (Objeto C2 -------->"+C2.Saldo);