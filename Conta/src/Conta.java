import java.util.Scanner;;
public class Conta {
	int numero;
	String dono;
	double Saldo;
	double Limite;
	double juros = 0.25;
	private Scanner sc;

			
public void Saca(double quantidade){
	sc = new Scanner(System.in);
	if (this.Saldo<quantidade) {
		double limitetx = this.Saldo * juros;
		this.Saldo = this.Saldo+limitetx;
		System.out.println("Valor impossivel de ser sacado" + quantidade+ "porque excede o calculo de saldo + limite"  );
		System.out.println("Valor maximo utilizando o limite disponivel para saque é" + this.Saldo );
		
		System.out.println("Qual a sua opção de parcelamento de limite, para verificar os juros [1,2] ");
		int op = sc.nextInt();
		System.out.println("opção escolhia" + op);
		if(op == 1){
			 limitetx = limitetx * 0.25;
			 this.Saldo = this.Saldo + limitetx;
			 System.out.println("Valor total a ser pago "+ this.Saldo);
		}else if (op ==2){
			 limitetx = limitetx * 0.50;
			 this.Saldo = this.Saldo + limitetx;
			 System.out.println("Valor total a ser pago "+ this.Saldo);
		 		}
	}
	}*/
        
		public void transfere(Conta destino, double valor) {
			this.Saldo = this.Saldo - valor;
			destino.Saldo = destino.Saldo + valor;
			System.out.println("Saldo da conta que foi depositada --------> " + destino.Saldo);
			System.out.println("Saldo da conta que foi retirada --------> "+this.Saldo);
			// TODO Auto-generated method stub				
				
				//System.out.println("quanto saira: " + Limite + "Valor com os juros: "+taxa);
	   	    //}else{
	    	//double novoSaldo = this.Saldo - quantidade;
	    	///this.Saldo = novoSaldo;   
	    	//System.out.println();
	    	//System.out.println("saldo suficiente" + this.Saldo);
	
	}
}




	
	

	