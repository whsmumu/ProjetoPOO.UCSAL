/*Criação da classe "Base" que implementa os metodos da interface iBase. @author Caio e @author Murilo/

package Base_Dados;

import java.util.ArrayList;
import java.util.List;

import Classes_Modelos.Alunos;
import Classes_Modelos.Departamentos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;

public class Base implements iBase {

    private final Integer QNTD_DEPARTAMENTOS = 3;
    private final Integer QNTD_PROFESSORES = 15;
    private final Integer QNTD_LABORATORIOS = 12;

    /*Metodo cujo o mesmo é uma sobrescrita do metodo que possui na interface IBase, que cria uma lista da classse Laboratorios e faz o set de todos os seus atributos utilizando também o tratamento de erro @author Murilo/
    @Override
public List<Laboratorios> getLaboratorios() {
    List<Laboratorios> listaLaboratorio = new ArrayList<>();
    try {
        for (int i = 1; i <= QNTD_LABORATORIOS; i++) {
            Laboratorios laboratorios = new Laboratorios();
            laboratorios.setDescricao("LAB" + i);

            switch (laboratorios.getDescricao()) {
                case "LAB2":
                case "LAB3":
                case "LAB4":
                case "LAB5":
                case "LAB6":
                case "LAB7":
                    laboratorios.setCapacidade(20);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                    break;
                case "LAB8":
                case "LAB9":
                case "LAB11":
                case "LAB12":
                    laboratorios.setCapacidade(15);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                    break;
                case "LAB1":
                case "LAB10":
                    laboratorios.setCapacidade(30);
                    laboratorios.setId(i);
                    laboratorios.setStatus(true);
                    break;
                default:
                    laboratorios.setStatus(false);
                    break;
            }
            listaLaboratorio.add(laboratorios);
        }
    } catch (Exception e) {
        e.printStackTrace();
        return null;
    }

    return listaLaboratorio;
}

    /** */
    @Override
    public List<Departamentos> getDepartamentos() {
        List <Departamentos> listaDepartamentos = new ArrayList<>();
        try {
            for (int i = 1; i <=QNTD_DEPARTAMENTOS; i++){
                Departamentos departamentos = new Departamentos();
                
                switch (i) {
                    case 1:
                        departamentos.setId(i);
                        departamentos.setDescricao("Engenharia de Software");
                        departamentos.setSigla("ES");
                        
                        break;

                    case 2:

                        departamentos.setId(i);
                        departamentos.setDescricao("Computação de Alto Desempenho");
                        departamentos.setSigla("CAD");
                
                        break;

                    case 3:
                        departamentos.setId(i);
                        departamentos.setDescricao("Infraestrutura Computacional");
                        departamentos.setSigla("IC");

                }
                
            listaDepartamentos.add(departamentos);

            }
            
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listaDepartamentos;
    }

    @Override
    public List<Professores> getProfessores() {
        List <Professores> listaProfessores = new ArrayList<>();

        try {
            for (int i = 1; i <= QNTD_PROFESSORES; i++){
            Professores professor = new Professores();
            professor.setNome("Professor0" + i);

            switch (professor.getNome()) {
                case "Professor01":
                case "Professor02":
                case "Professor03":
                case "Professor04":
                case "Professor05":
                case "Professor06":
                case "Professor07":
                case "Professor08":
                case "Professor09":
                case "Professor010":

                professor.setId(i);
                professor.setDepartamento(getDepartamentos().get(0));
                //professor.setStatus(); APAGUEM ISSO DPS
                    // precisa fazer o getDisciplinas primeiro (está no metodo abaixo) -> professor.setConjuntoDisciplina(); APAGUEM ISSO DPS
                
                    
                    break;

                case "Professor011":
                case "Professor012":
                case "Professor013":
                case "Professor014":

                    professor.setId(i);
                    professor.setDepartamento(getDepartamentos().get(1));
                    //professor.setStatus(); APAGUEM ISSO DPS
                    // precisa fazer o getDisciplinas primeiro (está no metodo abaixo) -> professor.setConjuntoDisciplina(); APAGUEM ISSO DPS
                
                    break;

                case "Professor015":
                professor.setId(i);
                professor.setDepartamento(getDepartamentos().get(2));
                professor.setStatus(true); 
                professor.setConjuntoDisciplina(null);
            }
            
            listaProfessores.add(professor);
        }

        
        } catch (Exception e) {

        }
        
        return listaProfessores;
    }

    @Override
    public List<Disciplinas> getDisciplinas() {
       return null;
    }

    @Override
    public List<Alunos> getAlunos(int qtden, int inicio) {
        return null;
    }
    
   
}