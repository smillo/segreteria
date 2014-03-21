package segreteria;

import java.util.*;

public abstract class StudenteLaurea extends Studente{

//campi
private double mediaAritm;
private double mediaPes;
private LinkedList<Esame> examlist;  //lista degli esami passati

public StudenteLaurea(String nome, String cognome, int numeroTel, String mail, int matricola){
	super(nome, cognome, numeroTel, mail, matricola);
	
	this.calcolaMediaAritm(examlist);
	
}

//metodi

public double calcolaMediaAritm(LinkedList<Esame> examlist){
	return 0.0;
}

public double calcolaMediaPes(LinkedList<Esame> examlist){
	return 0.0;
}


public void aggiungiEsameSuperato(Esame exam, int voto){
	
}

public int numeroEsamiSuperati(){
	return 0;
}

public double getMediaAritm() {
	return mediaAritm;
}

public void setMediaAritm(double mediaAritm) {
	this.mediaAritm = mediaAritm;
}

public double getMediaPes() {
	return mediaPes;
}

public void setMediaPes(double mediaPes) {
	this.mediaPes = mediaPes;
}

public LinkedList<Esame> getExamlist() {
	return examlist;
}

public void setExamlist(LinkedList<Esame> examlist) {
	this.examlist = examlist;
}



}
