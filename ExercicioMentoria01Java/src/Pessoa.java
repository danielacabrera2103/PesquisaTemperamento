public class Pessoa {
	private int idade;
	private int sexo;
	private int temperamento;

	public Pessoa(int idade, int sexo, int temperamento) {
		this.idade = idade;
		this.sexo = sexo;
		this.temperamento = temperamento;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getSexo() {
		return sexo;
	}

	public void setSexo(int sexo) {
		this.sexo = sexo;
	}

	public int getTemperamento() {
		return temperamento;
	}

	public void setTemperamento(int temperamento) {
		this.temperamento = temperamento;
	}

}