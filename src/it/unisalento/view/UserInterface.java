package it.unisalento.view;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

import it.unisalento.actionListener.UIListener;
import it.unisalento.model.Utente;

public class UserInterface extends JFrame {
	private Utente u;
	private JTabbedPane schede;
	private Carrello carrello;
	private Catalogo catalogo;
	private GestioneLibreria gestionelibreria;
	private RegistroVendite registrovendite;
	private GestioneAddetti gestioneaddetti;
	
	
	public UserInterface(Utente u){
		super("Benvenuto: "+u.getNome()+" "+u.getCognome());
		this.u=u;
		schede= new JTabbedPane();
		catalogo= new Catalogo();
		carrello=new Carrello();
		registrovendite= new RegistroVendite();
		gestionelibreria=new GestioneLibreria();
		gestioneaddetti=new GestioneAddetti();
		add(schede);
		if(u.getTipo()==0)
		{
			//Cliente
			schede.addTab("Catalogo", catalogo);
			schede.addTab("Carrello", carrello);
		}
		else if(u.getTipo()==1)
		{
			//Addetto Libreria
			schede.addTab("Catalogo", catalogo);
			schede.addTab("Carrello", carrello);
			schede.addTab("Gestione Libreria", gestionelibreria);
			schede.addTab("Registro Vendite", registrovendite);
		}
		else if(u.getTipo()==2)
			{
			//Addetto Vendite
			schede.addTab("Catalogo", catalogo);
			schede.addTab("Carrello", carrello);
			schede.addTab("Registro Vendite", registrovendite);
			schede.addTab("Richieste D'ordine", new RichiesteDOrdine());
			}
		else if(u.getTipo()==3)
		{
			//Amministratore
			schede.addTab("Catalogo", catalogo);
			schede.addTab("Carrello", carrello);
			schede.addTab("Registro Vendite", registrovendite);
			schede.addTab("Gestione Addetti", gestioneaddetti);
			schede.addTab("Gestione Libreria", gestionelibreria);
			schede.addTab("Richieste D'ordine", new RichiesteDOrdine());
		}
		this.pack();
		this.addWindowListener(new UIListener());
	}
}
