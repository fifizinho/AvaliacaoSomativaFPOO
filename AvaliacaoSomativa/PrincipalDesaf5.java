package AvaliacaoSomativa;

public class PrincipalDesaf5 {

	public static void main(String[] args) {
		Produto prod = new Produto("Heartstopper");
		System.out.println(prod.getNome());
		
		Livro liv = new Livro("HeartStopper","Alice Osman",250);
		System.out.println(liv.getNome());
		System.out.println(liv.getAutor());
		System.out.println(liv.getPaginas());
	}

}
