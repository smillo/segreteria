package segreteria;

import java.util.Date;

public class EsameStud extends Esame{ //sono gli esami che hanno fatto gli studenti
	
private boolean superato;
private int voto;


public EsameStud(Date data, Corso corso){
	super( data,  corso);
	
}


public boolean isSuperato() {
	return superato;
}


public void setSuperato(boolean superato) {
	this.superato = superato;
}


public int getVoto() {
	return voto;
}


public void setVoto(int voto) {
	this.voto = voto;
}






}
