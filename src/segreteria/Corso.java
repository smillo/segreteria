package segreteria;

public abstract class Corso { //non voglio che venga creato un oggetto di questa classe

private Docente prof;
private String nomeCorso;
private String desc;
private double durata;
private int nCrediti;
private int semestre;

public Corso(Docente prof, String nomecorso, String desc, double durata, int crediti, int semestre){
	//inizializza campi
}

public Docente getProf() {
	return prof;
}

public void setProf(Docente prof) {
	this.prof = prof;
}

public String getDesc() {
	return desc;
}

public void setDesc(String desc) {
	this.desc = desc;
}

public double getDurata() {
	return durata;
}

public void setDurata(double durata) {
	this.durata = durata;
}

public int getnCrediti() {
	return nCrediti;
}

public void setnCrediti(int nCrediti) {
	this.nCrediti = nCrediti;
}

public int getSemestre() {
	return semestre;
}

public void setSemestre(int semestre) {
	this.semestre = semestre;
}

public String getNomeCorso() {
	return nomeCorso;
}

public void setNomeCorso(String nomeCorso) {
	this.nomeCorso = nomeCorso;
}


}
