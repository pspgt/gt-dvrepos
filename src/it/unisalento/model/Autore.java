package it.unisalento.model;

public class Autore {
	
	private String nome;
	private String cognome;
	private int id;
	
	public Autore(String nome, String cognome, int id) {
		this.nome = nome;
		this.cognome = cognome;
		this.id = id;
	}
	
	public Autore(){
		this.id=-1;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
