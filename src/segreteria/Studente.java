package segreteria;

import java.util.*;

public abstract class Studente {  //non voglio che venga creato un oggetto di questa classe
//campi
private String nome;
private String cognome;
private int numeroTel;
private String mail;
private int matricola;
private LinkedList<Corso> corsifreq; //lista corsi frequentati

public Studente(String nome, String cognome, int numeroTel, String mail, int matricola){
	
	//inizializza i campi dell'oggetto
}


public void aggiungiCorsoFreq(Corso corso){ //aggiunge il corso ala lista
	
}

public int numeroCorsiFreq(){
	return 0;
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


public int getNumeroTel() {
	return numeroTel;
}


public void setNumeroTel(int numeroTel) {
	this.numeroTel = numeroTel;
}


public String getMail() {
	return mail;
}


public void setMail(String mail) {
	this.mail = mail;
}


public int getMatricola() {
	return matricola;
}


public void setMatricola(int matricola) {
	this.matricola = matricola;
}


public LinkedList<Corso> getCorsifreq() {
	return corsifreq;
}


public void setCorsifreq(LinkedList<Corso> corsifreq) {
	this.corsifreq = corsifreq;
}



}
