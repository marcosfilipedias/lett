package model;

public abstract class Animal {

	private int idade;
	private float tamanho;
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getTamanho() {
		return tamanho;
	}
	public void setTamanho(float tamanho) {
		this.tamanho = tamanho;
	}
	
	public abstract void somEmitido();
	
	public Animal(int idade, float tamanho) {
		this.setIdade(idade);
		this.setTamanho(tamanho);
	}
}
