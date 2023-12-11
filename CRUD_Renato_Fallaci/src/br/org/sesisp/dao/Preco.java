package br.org.sesisp.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import br.org.sesisp.controller.Conexao;
import br.org.sesisp.model.Produto;

public class Preco {
			
			private int marca;
			// CRUD C-Create R-Read D-Delete
			
			//CREATE (Inserir dados)
			public void create(Produto produto) {
				String sql = "INSERT INTO alunos(id,marca,cor,tamanho,) VALUE (?,?,?,?)";
				Connection conn = null;
				PreparedStatement p = null;
				try {
					conn = Conexao.CriandoConexao();
					p = (PreparedStatement) conn.prepareStatement(sql);
					p.setString(1, produto.getMarca());
					p.setString(2, produto.getTamanho());
					p.setString(3,produto.getCor());
					p.setInt(4,produto.preco);
							
					p.execute();
				}catch(Exception e) {
					//JOptionPane.showMessageDialog(null, "ERRO ao inserir dados! \nERRO: " + e);
				}finally {
					try {
						if(p != null);
						p.close();
					}catch(Exception e) {
						e.printStackTrace();
					}
				}
				}
				
		// fim CRIATE
		//*****************************************************************
			
		//metodo U - Update
			
		public void update(Produto produto) {
			String sql = "UPDATE produto get marca = ?,get cor = ? get tamanho = ?,get preco =?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.CriandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				p.setString(1, produto.getMarca());
				p.setString(2, produto.getCor());
				p.setString(3, produto.getTamanho());
				p.setInt(4,produto.getPreco());
				p.execute();//executa instrução para gravar dados no banco
				//JOptionPane.showMessageDialog(null, "Dados atualizados com sucesso");
				System.out.println("Dados atualizados com sucesso");
			}catch(Exception e) {
				//JOptionPane.showMessageDialog(null, "ERRO ao atualizar dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
					
		}//fim UPDATE
		//*****************************************************************
		
		//metodo R - Read
		public List<Produto> read(){
			String sql = "SELECT * FROM produtos ";
			List<Produto> produtos = new ArrayList<Produto>();
			Connection conn = null;
			PreparedStatement p = null;
			ResultSet resultado = null;
			
			try {
				conn = Conexao.CriandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				resultado = p.executeQuery();//mostra os dados da consulta sql
				while(resultado.next()) {
						Produto ver_produto = new Produto();
				
					//recuperar RA
					ver_produto.setId(resultado.getInt("id"));
					//recuperar o nome
					ver_produto.setMarca(resultado.getString("marca"));
					//recuperar idade
					ver_produto.setCor(resultado.getString("cor"));
					//adicionar na lista
					ver_produto.setTamanho(resultado.getString("tamanho"));
					
					ver_produto.setPreco(resultado.getInt("preco"));
					produtos.add(ver_produto);
					
				}
			}catch(Exception e) {
				JOptionPane.showMessageDialog(null, "ERRO ao editar dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return produtos;
		}//fim READ
		//*****************************************************************
		
		//metodo D - Delete
		
		public boolean delete(int id) {
			String sql = "DELETE FROM produtos WHERE id = ?";
			Connection conn = null;
			PreparedStatement p = null;
			try {
				conn = Conexao.CriandoConexao();
				p = (PreparedStatement) conn.prepareStatement(sql);//cast
				
				p.setInt(1,id  );
				p.execute();
				//JOptionPane.showMessageDialog(null, "Dados excluidos com sucesso!");
				System.out.println("Dados excluidos com sucesso!");
			}catch(Exception e) {
				//JOptionPane.showMessageDialog(null, "ERRO ao Excluir dados! \nERRO: " + e);
			}finally {
				try {
					if(p != null);
					p.close();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}
			return false;
		}//fim DELETE
		
			
	

	}





















