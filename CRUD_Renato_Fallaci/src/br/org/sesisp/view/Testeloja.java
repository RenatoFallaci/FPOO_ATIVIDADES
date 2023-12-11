package br.org.sesisp.view;

import br.org.sesisp.dao.Preco;
import br.org.sesisp.model.Produto;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Testeloja {



	    public static void main(String[] args) {
	        // Instanciar um objeto da classe CrudDAO
	        Preco inserirProduto = new Preco();
	        // Instanciar um objeto aluno
	        Produto pro1 = new Produto();
	        Scanner entrada = new Scanner(System.in);

	        JOptionPane.showMessageDialog(null, "Bem Vindo(a) a nossa loja");

	        int opcaoDados;
	        do {
	            String opcao = JOptionPane.showInputDialog("O que você quer fazer?\n1 -Ver roupas \n2 - Saber tamanho  \n3 - escolher cor \n4 - Concluir\n0 - Encerrar");
	            opcaoDados = Integer.parseInt(opcao);

	            switch (opcaoDados) {
	                case 1:
	                   pro1.setCor(JOptionPane.showInputDialog("Informe a cor "));
	                   pro1.setTamanho((JOptionPane.showInputDialog("Informe o tamanho : ")));
	                    inserirProduto.create(pro1);
	                    JOptionPane.showMessageDialog(null, "informaçoes adicionadas");
	                    break;
	                case 2:
	                    // Atualizar Valores
	                    JOptionPane.showMessageDialog(null, "Lista de Produtos disponiveis : ");
	                    for (Produto vassoura : inserirProduto.read()) {
	                        JOptionPane.showMessageDialog(null, "Dados do Produto\n" + "Id - " + vassoura.getCor() + "\ncor- " + vassoura.getCor() + "\nTamanho - " + vassoura.getTamanho());
	                    }
	                    
	                    pro1.setId(  Integer.parseInt(JOptionPane.showInputDialog("Qual produto voce quer atualizar ")));
	                    pro1.setCor(JOptionPane.showInputDialog("Informe a nova cor : "));
	                    pro1.setPreco(Integer.parseInt(JOptionPane.showInputDialog("preco do novo produto : ")));

	                    inserirProduto.update(pro1);
	                    JOptionPane.showMessageDialog(null, "Produto atualizado!\ncor: " + pro1.getCor() + "\nTamanho: " + pro1.getTamanho());
	                    break;
	                case 3:
	                    // Excluir dados
	                    JOptionPane.showMessageDialog(null, "Lista de produtos disponiveis na loja : ");
	                    for (Produto vassoura : inserirProduto.read()) {
	                        JOptionPane.showMessageDialog(null, "Dados do produto :\n" + "Id- " + vassoura.getId() + "\nCor - " + vassoura.getCor() + "\nTamanho - " + vassoura.getTamanho());
	                    }
	                    int raExcluir = Integer.parseInt(JOptionPane.showInputDialog("Insira o RA do Aluno que deseja excluir: "));
	                    Preco remover_aluno = new Preco();
	                    remover_aluno.delete(raExcluir);
	                    break;
	                case 4:
	                    // Ler tabela alunos do BD
	                    JOptionPane.showMessageDialog(null, "Lista de Produto :");
	                    for (Produto vassoura : inserirProduto.read()) {
	                        JOptionPane.showMessageDialog(null, "Dados do Produto:\n" + "Id- " + vassoura.getId() + "\nCor - " + vassoura.getCor() + "\nTamanho - " + vassoura.getTamanho());
	                    }
	                    break;
	                case 0:
	                    JOptionPane.showMessageDialog(null, "O programa encerrou!");
	                    break;
	            }
	        } while (opcaoDados != 0);
	    }
}
	
