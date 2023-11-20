
/** Criação da classe aluno com seus atributos(identificador, matricula, nome e status)
 * 	juntamente com os getters, setters e o metodo toString 
 * 	@author murilo */

package Classes_Modelos;
public class Alunos {
	private Integer identificador;
	private Integer matricula;
	private String nome;
	private boolean status;
	
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
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
		return "Alunos [identificador=" + identificador + ", matricula=" + matricula + ", nome=" + nome + ", status="
				+ status + "]";
	}
	
	
	

}
