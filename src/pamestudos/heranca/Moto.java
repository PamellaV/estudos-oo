package pamestudos.heranca;

public class Moto extends Veiculo {
	
	public Moto(String cor) {
		setQuantidadeRodas(2);
		setCor(cor);
	}

	@Override
	public String barulho() {
		return "ZummmmmZUUUU";
	}

}
