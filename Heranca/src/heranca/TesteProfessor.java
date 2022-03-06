package heranca;

public class TesteProfessor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Professor rafael;
		rafael = new Professor();

		rafael.setNome("Rafael Ronqui");
		rafael.setCpf("35155932840");
		rafael.setSalario(3000);
		rafael.setCursoMinistraAula("Desenvolvimento de sistemas");


		System.out.println("Nome: " + rafael.getNome() + " CPF: " + rafael.getCpf() + "Salário: " 
		+ rafael.getSalario() + "\n" + "Curso que ministra aula: " + rafael.getCursoMinistraAula());
	}

}
