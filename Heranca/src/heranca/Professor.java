package heranca;

public class Professor extends Pessoa {

	private String cursoMinistraAula;

	public String getCursoMinistraAula() {
		return cursoMinistraAula;
	}

	public void setCursoMinistraAula(String cursoMinistraAula) {
		this.cursoMinistraAula = cursoMinistraAula;
	}
	
	void exibirOiProfessor ()
	{
	System.out.println ("Ol�, voc� est� utilizando a classe Professor.");
	}
	
}
