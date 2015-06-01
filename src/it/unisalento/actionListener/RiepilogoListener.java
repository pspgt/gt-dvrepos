package it.unisalento.actionListener;

import it.unisalento.businesslogic.AcquistoManager;
import it.unisalento.businesslogic.RegistroManager;
import it.unisalento.dbinterface.DBManager;
import it.unisalento.view.RegistroVendite;
import it.unisalento.view.Riepilogo;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class RiepilogoListener implements ActionListener {

	public static final String ACTION_CONFIRM="gesu�unbravoragazzo";
	public static final String ACTION_CANCEL="seeculuculu!!!!";
	
	private Riepilogo r;
	private RegistroManager reg;

	public RiepilogoListener(Riepilogo r){
		this.r=r;
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String command=arg0.getActionCommand();
		if(command.equals(ACTION_CONFIRM)){
			AcquistoManager a=new AcquistoManager();
			RegistroManager reg=new RegistroManager();
			r.setVisible(false);
			JOptionPane.showMessageDialog(null,"Acquisto Effettuato con successo!");
			
		}
		else if (command.equals(ACTION_CANCEL)){
			r.setVisible(false);
		}
	}

}
