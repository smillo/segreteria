package segreteria;

import java.util.*;

public class CorsoEsame extends Corso{

private LinkedList<Esame> listaEsami;
		
public CorsoEsame(Docente prof, String nomecorso, String desc, double durata, int crediti, int semestre){
	super(prof,  nomecorso,  desc,  durata,  crediti,  semestre);
	
}

public void aggiungiEsame(Esame exam){
	
}

public LinkedList<Esame> getListaEsami() {
	return listaEsami;
}

public void setListaEsami(LinkedList<Esame> listaEsami) {
	this.listaEsami = listaEsami;
}












}