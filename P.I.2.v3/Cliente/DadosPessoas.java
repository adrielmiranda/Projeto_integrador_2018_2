package agendatelefonica;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
public class DadosPessoas
{
 // leitura do arquivo contendo dados da agenda
 public static ArrayList<Pessoa> lerDados(Connection bdConnection)
 {
 ArrayList<Pessoa> pessoas = new ArrayList<>();
 if (bdConnection == null)
 return pessoas;

 try
 {
 String sql_str = "SELECT * FROM pessoas ORDER BY nome";
 PreparedStatement stmt = bdConnection.prepareStatement(sql_str);
 ResultSet rs = stmt.executeQuery();
 int id;
 String nome, fone, fone_comercial, fone_residencial, CPF, RG, Endereco,  Complemento, Setor, Cidade, UF, Cep;
 Pessoa novaPessoa;

 // percorre conjunto de pessoas retornadas pelo banco de dados
 while (rs.next())
 {
 // obtém dados da pessoa corrente
 id = rs.getInt("id");
 nome = rs.getString("nome");
 fone = rs.getString("fone");
 fone_comercial = rs.getString("fone_comercial");
 fone_residencial = rs.getString("fone_residencial");
 CPF = rs.getString("CPF");
 RG = rs.getString("RG");
 Endereco = rs.getString("Endereco");
 Complemento = rs.getString("Complemento"); 
 Setor = rs.getString("Setor");
 Cidade = rs.getString("Cidade"); 
 UF = rs.getString("UF");
 Cep = rs.getString("Cep");
     
     
    
 
// cria nova pessoa e a adiciona na lista
 novaPessoa = new Pessoa(id, nome, fone, fone_comercial, fone_residencial, CPF, RG, Endereco,  Complemento, Setor, Cidade, UF, Cep );
 pessoas.add(novaPessoa);
 }

 stmt.close();
 rs.close();

 // retorna lista de pessoas
 return pessoas;
 } catch(SQLException ex) {
 JOptionPane.showMessageDialog(null,
 "Erro na consulta SQL\n" + ex.getMessage(),
 "Ler Dados", JOptionPane.ERROR_MESSAGE);
 return pessoas;
 }
 }

 //
 // insere nova pessoa na base de dados e retorna
 // o ID da pessoa inserida
 //
 public static int inserirPessoa(Connection bdConnection, String nome, String fone, String fone_comercial, String fone_residencial,
                  String CPF, String RG, String Endereco, String Complemento, String Setor, String Cidade, String UF, String Cep)
 {
 if (bdConnection == null)
 return -1;

 PreparedStatement stmt = null;
 try
 {
 // prepara comando a ser executado pelo BD
 stmt = bdConnection.prepareStatement(
 "INSERT INTO pessoas (nome, fone, fone_comercial, fone_residencial, CPF, RG, Endereco, Complemento, Setor, Cidade, UF, Cep) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,? )", //inserindo pessoa no  Banco de Dados
 Statement.RETURN_GENERATED_KEYS);
 stmt.setString(1, nome);
 stmt.setString(2, fone);
 stmt.setString(3, fone_comercial);
 stmt.setString(4, fone_residencial);
 stmt.setString(5, CPF);
 stmt.setString(6, RG);
 stmt.setString(7, Endereco);
 stmt.setString(8, Complemento);
 stmt.setString(9, Setor);
 stmt.setString(10, Cidade);
 stmt.setString(11, UF);
 stmt.setString(12, Cep);
 
 // executa comando
 stmt.executeUpdate();

 // obtem chave gerada para o registro inserido
 int id = -1;
 ResultSet rsID = stmt.getGeneratedKeys();
 if(rsID.next())
 id = rsID.getInt("id");

 stmt.close();
 return id;
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,
 "Erro ao inserir nova pessoa na base de dados\n" + ex.getMessage(),
 "Inserir pessoa", JOptionPane.ERROR_MESSAGE);
 return -1; //indica erro
 }
 }

 public static boolean alterarTelefone(Connection bdConnection, Pessoa p)
 {
 if (bdConnection == null)
 return false;

 PreparedStatement stmt = null;
 try
 {
 stmt = bdConnection.prepareStatement(
 "UPDATE pessoas SET fone = ?  WHERE id = ? " );
 
 stmt = bdConnection.prepareStatement(
 "UPDATE pessoas SET fone_comercial = ?  WHERE id = ? " );
 
 stmt = bdConnection.prepareStatement(
 "UPDATE pessoas SET fone_comercial = ?  WHERE id = ? " );
 
 stmt = bdConnection.prepareStatement(
 "UPDATE pessoas SET cpf = ?  WHERE id = ? " );
 
 
 
 
 stmt.setString(1, p.getFone());
 stmt.setString(3, p.getFone_Comercial());
 stmt.setString(4, p.getFone_Residencial());
 stmt.setString(5, p.getCPF());
 stmt.setString(6, p.getRG());
 stmt.setString(7, p.getEndereco());
 stmt.setString(8, p.getComplemento());
 stmt.setString(9, p.getSetor());
 stmt.setString(10, p.getCidade());
 stmt.setString(11, p.getUF());
 stmt.setString(12, p.getCep());

 
 stmt.setInt(2, p.getId());
 stmt.executeUpdate();
 stmt.close();
 return true;
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,
 "Erro ao gravar arquivo de dados\n" + ex.getMessage(),
 "Gravar dados", JOptionPane.ERROR_MESSAGE);
 return false;
 }
 }

 public static boolean eliminarPessoa(Connection bdConnection, Pessoa p)
 {
 if (bdConnection == null)
 return false;

 PreparedStatement stmt;
 try
 {
 stmt = bdConnection.prepareStatement("DELETE FROM pessoas WHERE id = ?");
 stmt.setInt(1, p.getId());
 stmt.executeUpdate();
 stmt.close();
 return true;
 } catch (SQLException ex) {
 JOptionPane.showMessageDialog(null,
 "Erro ao gravar arquivo de dados\n" + ex.getMessage(),
 "Gravar dados", JOptionPane.ERROR_MESSAGE);
 return false;
 }
 }
}