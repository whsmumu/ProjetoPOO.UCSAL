/**Criação da classe "Base" que implementa os metodos da interface iBase.
 * @author Caio
 * @author Murilo*/

package Base_Dados;

import java.util.ArrayList;
import java.util.List;

import Classes_Modelos.Alunos;
import Classes_Modelos.Departamentos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;

public class Base implements IBase {

    @Override
    public List<Laboratorios> getLaboratorios() {
        List<Laboratorios> listaLaboratorio = new ArrayList<>();
        try {
            Laboratorios laboratorio;
            for (int i = 0; i < listaLaboratorio.size(); i++) {
                laboratorio = new Laboratorios();
                laboratorio.setDescricao("LAB"+i+1);
                laboratorio.setStatus(true);
                
                for (int j = 2; j <= 7 ; j++) {
                    if (laboratorio.getDescricao() == "LAB"+j) {
                        laboratorio.setCapacidade(20);
                        laboratorio.setId(j);
                        
                    } else if (laboratorio.getDescricao().equals("LAB8")){
                        laboratorio.setId(8);
                    }else if(laboratorio.getDescricao().equals("LAB9")){
                        laboratorio.setId(9);
                    }
                    else if(laboratorio.getDescricao().equals("LAB11")){
                        laboratorio.setId(11);
                    }
                    else if(laboratorio.getDescricao().equals("LAB12")){
                        laboratorio.setId(12);
                    }else {
                        laboratorio.setCapacidade(30);
                    }
                }
                listaLaboratorio.add(laboratorio);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listaLaboratorio;
    }

    @Override
    public List<Departamentos> getDepartamentos() {
        return null;
    }

    @Override
    public List<Professores> getProfessores() {
        return null;
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
