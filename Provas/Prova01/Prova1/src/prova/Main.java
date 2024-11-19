package prova;

public class Main {

	public static void main(String[] args) {
		LULASistema s = new LULASistema();
		s.cadastraComitiva(1, "Professores", 5, "(83) 99999-0000");
		System.out.println(s.exibeComitiva(1));
		//s.cadastraLocal("BG", "HALL DAS PLACAS", "1131");
		//System.out.println(s.exibeLocal("g"));
	}

}