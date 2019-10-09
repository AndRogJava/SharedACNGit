package sharedProject.accenture.model;

public class Aggiunta {
	private String modello;
	private String cilindrata;
	private String nome;
	private int cognome;
	private char sesso;
	
	public Aggiunta(String modello, String cilindrata) {
		this.modello = modello;
		this.cilindrata = cilindrata;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + cognome;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aggiunta other = (Aggiunta) obj;
		if (cognome != other.cognome)
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}

}
