package it.unisalento.model;

public class Genere {
	
	int id;
	String nome;
	
	public Genere(int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	public Genere(){
		this.id=-1;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
