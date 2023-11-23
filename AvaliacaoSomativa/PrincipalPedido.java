package AvaliacaoSomativa;

public class PrincipalPedido {

	public static void main(String[] args) {
		Pedido ped = new Pedido (1,"Iphone 15",100);
		System.out.println(ped.getId());
		System.out.println(ped.getProduto());
		System.out.println(ped.getQuantidade());
	}

}
