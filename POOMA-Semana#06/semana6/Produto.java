package semana6;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Produto {
private int id;
private int Classificacao;
private String nomeProduto;
private double PrecoProduto;



public Produto() throws CloneNotSupportedException{
	ArrayList<Object> produto = new ArrayList<>();
   Produto Construtor = new Produto(13, 2, "Feijão", 200);

	int decisao = 0;
	
	do {
		decisao = Integer.parseInt(JOptionPane.showInputDialog("Você deseja: \n"
				+ "[1] Cadastrar um novo produto \n"
				+ "[2] Visualizar um produto \n"
				+ "[3] Remover um produto \n"
				+ "[4] Alterar um produto \n"
				+ "[5] Ver toda a lista \n"
				+ "[0] Encerrar o programa"));
		
		switch(decisao) {
		case 1:
			Produto novo;
			try {
				novo = (Produto) Construtor.clone();
				novo.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID")));
				novo.setClassificacao(Integer.parseInt(JOptionPane.showInputDialog("Informe a classificação")));
				novo.setNomeProduto(JOptionPane.showInputDialog("Informe o nome"));
				novo.setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço")));
				produto.add(novo);
			} catch (CloneNotSupportedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
			break;

case 2:
	int ID = Integer.parseInt(JOptionPane.showInputDialog("Digite o id do produto"))-1;
	System.out.println("o id se refere a: " + Construtor.getNomeProduto());
	
break;

case 3:
	int remover = Integer.parseInt(JOptionPane.showInputDialog("Informe o indice do produto"))- 1;
	if(remover > produto.size()) {
		System.out.println("Valor inválido");
		System.out.println();
	}else {
	produto.remove(remover);
	System.out.println();
	System.out.println("Produto removido \n" );
	}
	break;
case 4:
	int i = Integer.parseInt(JOptionPane.showInputDialog("Informe o indice do item a ser alterado")) -1;
	if(i > produto.size()) {
		System.out.println("Valor inválido");
		System.out.println();
	}else {
	Produto alterar;
	try {
		alterar = (Produto) Construtor.clone();
		alterar.setId(Integer.parseInt(JOptionPane.showInputDialog("Informe o ID")));
		alterar.setClassificacao(Integer.parseInt(JOptionPane.showInputDialog("Informe a classificação")));
		alterar.setNomeProduto(JOptionPane.showInputDialog("Informe o nome"));
		alterar.setPrecoProduto(Double.parseDouble(JOptionPane.showInputDialog("Informe o preço")));
		produto.set(i, alterar);
	} catch (CloneNotSupportedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	break;

case 5:
	System.out.println("Lista: \n");
	for (int j = 0; j < produto.size(); j++) {
		System.out.println(produto.get(j));
	}
	
	break;
case 0:
	System.out.println("Fim do programa");
	break;
default:
	System.out.println("Opção inválida");
	break;
}
}while(decisao != 0);


}




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getClassificacao() {
	return Classificacao;
}
public void setClassificacao(int classificação) {
	Classificacao = classificação;
}
public String getNomeProduto() {
	return nomeProduto;
}
public void setNomeProduto(String nomeProduto) {
	this.nomeProduto = nomeProduto;
}
public double getPrecoProduto() {
	return PrecoProduto;
}
public void setPrecoProduto(double precoProduto) {
	PrecoProduto = precoProduto;
}


@Override
protected Object clone() throws CloneNotSupportedException {
	// TODO Auto-generated method stub
	return super.clone();
}

	public Produto(int id, int Classificacao, String nomeProduto, double PrecoProduto) {
		super();
		this.id = id;
		this.Classificacao = Classificacao;
		this.nomeProduto = nomeProduto;
		this.PrecoProduto = PrecoProduto;
	}

	@Override
	public String toString() {
		return "Produto " +"\nNome do produto= " + nomeProduto + "\nID= " + id + "\nClassificacao= " + Classificacao
				+ "\nPreço do produto= R$" + PrecoProduto+ "\n" + "\n";
	}
}

