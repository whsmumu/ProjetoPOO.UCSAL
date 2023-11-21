/** Criação da classe aluno com seus atributo (identificadormatricula, nome e status) 
 * 	juntamente com os getters, setters e o metodo toString 
 *  @author Murilo */

package Classes_Modelos;

public class Alunos extends Pessoa{
	private Integer id;
	private Integer matricula;
	private String nome;
	private boolean status;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getMatricula() {
		return matricula;
	}
	public void setMatricula(Integer matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "Alunos [identificador=" + id + ", matricula=" + matricula + ", nome=" + nome + ", status="
				+ status + "]";
	}
	
	
	

}
