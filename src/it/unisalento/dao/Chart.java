package it.unisalento.dao;

import it.unisalento.model.Libro;
import java.util.Vector;

public class Chart {
	
	private static Chart istance;
	private static Vector<Libro> carrello;
	
	public static Chart getIstance(){
		if(istance==null){
			istance=new Chart();
		}
		return istance;
	}
	
	public Chart(){
		carrello=new Vector<Libro>();
	}
	public void add(Libro l){
		carrello.addElement(l);
	}
	public Libro getItem(int index){
		return carrello.elementAt(index);
	}
	public int getDim(){
		return carrello.size();
	}
	public void rimuoviLibro(int i){
		carrello.removeElementAt(i);
	}
	public float getTotale(){
		float tot=0;
		for (int i=0;i<carrello.size();i++)
			tot+=carrello.elementAt(i).getCosto();
		return tot;
	}
}
