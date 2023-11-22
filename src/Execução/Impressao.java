/**Criação da classe impressão que vai conter a interação do usuario com o sistema e tera um outro metodo que vai chamar todos os metodos para imprimir o resultado  com intuito de otimizar e tonar o codigo mais legivel criando metodos e classes para separar cada elemento @author Murilo*/

package Execução;

import java.util.List;
import java.util.Scanner;
import Base_Dados.Base;
import Classes_Modelos.Alunos;
import Classes_Modelos.Departamentos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;

public class Impressao {
    /**Metodo  Usuario que serve para guarda toda a interação do usuario com o sistema dentro de variaveis que ira interagir totalmente com o sistema alem de chamar o metodo imprimir @author Murilo*/
    public void Usuario(){
        Scanner scan = new Scanner(System.in);

		System.out.print("Informe qual o laboratorio deseja reservar? ");
		String laboratorioUser = scan.nextLine();

        System.out.print("Informe o nome do professor:");
        String professorUser = scan.nextLine();

        System.out.print("Informe a sigla da disciplina :");
        String disciplinaUser = scan.nextLine();

        System.out.print("Informe a data dd/mm/yyyy inicial de uso do laboratorio? "); 
        String dataUser = scan.nextLine();

        System.out.print("Informe a hora HH:mm inicial de uso do laboratorio? ");
        String horaUser = scan.nextLine();

        System.out.print("Informe os minutos que deseja usar o laboratorio ?");
        String minutoUser = scan.nextLine();

        Imprimir(laboratorioUser, professorUser, disciplinaUser, dataUser, horaUser, minutoUser);
    }   
     
    /**Metodo imprimir que ira chamar todos os metodos da classe Base atraves de uma variavel do tipo List pois o metodo tambem é uma List e mostrar todo o resultado atraves de um forEach @author Murilo*/  
    public void Imprimir(String laboratorioUser, String professorUser, String disciplinaUser, String dataUser, String horaUser, String minutoUser){

        Base base = new Base();

		List<Laboratorios> listaLaboratorios = base.getLaboratorios();
        List<Professores> listaProfessores = base.getProfessores();
        List<Departamentos> listaDepartamento = base.getDepartamentos();
        List<Disciplinas> listaDisicDisciplinas = base.getDisciplinas();
        List<Alunos> listaAlunos = base.getAlunos(0, 0);
        

		for (Laboratorios ClasseLab : listaLaboratorios) {
			if (ClasseLab.getDescricao().equals(laboratorioUser) ) {
				System.out.println(ClasseLab.toString());

            }
        }
    }
}
