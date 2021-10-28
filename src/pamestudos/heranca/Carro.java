package pamestudos.heranca;

public class Carro extends Veiculo {

	public Carro(String cor) {
		setQuantidadeRodas(4);
		setCor(cor);
	}
	
	@Override
	public String barulho() {
		return "vrum";
	}
 
}
