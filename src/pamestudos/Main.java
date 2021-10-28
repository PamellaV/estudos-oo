package pamestudos;

import pamestudos.heranca.Carro;
import pamestudos.heranca.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro primeiroCarro = new Carro("Preto");
		System.out.println(primeiroCarro.getQuantidadeRodas());
		System.out.println(primeiroCarro.getCor());
		System.out.println(primeiroCarro.barulho());
		
		Moto primeiraMoto = new Moto("amarela");
		System.out.println(primeiraMoto.getQuantidadeRodas());
		System.out.println(primeiraMoto.getCor());
		System.out.println(primeiraMoto.barulho());
		primeiraMoto.setCor("Vermelha");
		System.out.println(primeiraMoto.getCor());
		
	}
	
}
