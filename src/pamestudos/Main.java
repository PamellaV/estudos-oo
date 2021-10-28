package pamestudos;

import pamestudos.heranca.Carro;
import pamestudos.heranca.Moto;

public class Main {

	public static void main(String[] args) {
		
		Carro primeiroCarro = new Carro();
		primeiroCarro.setQuantidadeRodas(4);
		primeiroCarro.setCor("Preto");
		System.out.println(primeiroCarro.getQuantidadeRodas());
		System.out.println(primeiroCarro.getCor());
		System.out.println(primeiroCarro.barulho());
		
		Moto primeiraMoto = new Moto();
		primeiraMoto.setQuantidadeRodas(2);
		primeiraMoto.setCor("Rosa");
		System.out.println(primeiraMoto.getQuantidadeRodas());
		System.out.println(primeiraMoto.getCor());
		System.out.println(primeiraMoto.barulho());
		
	}
	
}
