package pamestudos.heranca;

public abstract class Veiculo {

	private String cor;
	private Integer quantidadeRodas;
	
	public abstract String barulho();

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public Integer getQuantidadeRodas() {
		return quantidadeRodas;
	}

	public void setQuantidadeRodas(Integer quantidadeRodas) {
		this.quantidadeRodas = quantidadeRodas;
	}
	
}
