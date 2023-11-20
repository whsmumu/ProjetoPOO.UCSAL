/**Criação da classe Professor com atributos (identificador, nome, status e departamento da classe Departamentos)
 * juntamento com getters, setters e o metodo tooString 
 * @author murilo*/

package Classes_Modelos;
import java.util.Set;
public class Professores {
	
	private Integer identificador;
	private String nome;
	private boolean status;
	private Departamentos departamento;
	private Set <Disciplinas> ConjuntoDisciplina;

	
	public Set<Disciplinas> getConjuntoDisciplina() {
		return ConjuntoDisciplina;
	}
	public void setConjuntoDisciplina(Set<Disciplinas> conjuntoDisciplina) {
		ConjuntoDisciplina = conjuntoDisciplina;
	}
	public Integer getIdentificador() {
		return identificador;
	}
	public void setIdentificador(Integer identificador) {
		this.identificador = identificador;
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
	public Departamentos getDepartamento() {
		return departamento;
	}
	public void setDepartamento(Departamentos departamento) {
		this.departamento = departamento;
	}
	@Override
	public String toString() {
		return "Professores [identificador=" + identificador + ", nome=" + nome + ", status=" + status
				+ ", departamento=" + departamento + ", ConjuntoDisciplina=" + ConjuntoDisciplina + "]";
	}
}
