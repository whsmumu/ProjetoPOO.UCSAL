/**Criação da classe "Base" que implementa os metodos da interface iBase. @author Caio e @author Murilo */

package Base_Dados;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

import java.util.Set;

import Classes_Modelos.Alunos;
import Classes_Modelos.Departamentos;
import Classes_Modelos.Disciplinas;
import Classes_Modelos.Laboratorios;
import Classes_Modelos.Professores;

public class Base implements IBase {

    private final Integer QNTD_DEPARTAMENTOS = 3;
    private final Integer QNTD_PROFESSORES = 15;
    private final Integer QNTD_LABORATORIOS = 12;

    /**
     * Implementação do metodo que é da interface IBase, metodo que retorna uma List
     * da classe laboratorio, usa-se o tratamento de erro (try e catch), usa-se uma
     * estrutura de repetição para todo o preenchimento da List. Uso do switch case
     * que auxilia ao o que o usuario ira digitar e se for correspondente com as
     * opções ele ira setar de acordo com cada laboratorio especifico. @author
     * Murilo
     */
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
                }
                listaLaboratorio.add(laboratorios);
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return listaLaboratorio;
    }

    /**
     * Este metodo cria um List do tipo Departamentos e dentro de uma estrutura de
     * repetição ele adiciona dentro dessa List a chamada de um metodo que faz todo
     * o set da classe Departamento, tudo dentro de um tratamento de erro (try
     * catch) e no final retornando uma List. @author Murilo & @author Caio
     */
    @Override
    public List<Departamentos> getDepartamentos() {
        List<Departamentos> listaDepartamentos = new ArrayList<>();
        try {
            for (int i = 0; i < QNTD_DEPARTAMENTOS; i++) {
                listaDepartamentos.add(criarDepartamentos(i));
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listaDepartamentos;
    }

    /** @author Caio */
    @Override
    public List<Professores> getProfessores() {
        List<Professores> listaProfessores = new ArrayList<>();

        try {
            for (int i = 1; i <= QNTD_PROFESSORES; i++) {
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
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(1, 3));
                        break;
                    case "Professor011":
                    case "Professor012":
                    case "Professor013":
                    case "Professor014":
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(1));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(4, 4));
                        break;
                    case "Professor015":
                        professor.setId(i);
                        professor.setDepartamento(getDepartamentos().get(2));
                        professor.setStatus(true);
                        professor.setConjuntoDisciplina(disciplinasDoProfessor(8, 3));
                        break;
                }

                listaProfessores.add(professor);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;

        }

        return listaProfessores;
    }

    /**
     * Metodo que tem como retorno uma List de disciplinas, nesse metodo todos os
     * atributos da classe Disciplinas sao setados atraves de uma estrutura de
     * repetição for e atraves do switch case para setar especificamente cada
     * posição pois em cada posição possui um id, sigla, status e descrição
     * diferente dos demais, logos após adicionamos todos os atributos dentro de uma
     * List e todo esse controle é feito dentro de um tratamento de erro (try
     * catch) @author Murilo
     */
    @Override
    public List<Disciplinas> getDisciplinas() {
        List<Disciplinas> listaDisciplinas = new ArrayList<>();
        try {
            for (int i = 1; i <= 10; i++) {
                Disciplinas disciplinas = new Disciplinas();
                switch (i) {
                    case 1:
                        disciplinas.setDescricao("LOGICA DE PROGRAMAÇÃO");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES005");
                        disciplinas.setStatus(true);
                        break;

                    case 2:
                        disciplinas.setDescricao("ESTRUTURA DE DADOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES006");
                        disciplinas.setStatus(true);
                        break;

                    case 3:
                        disciplinas.setDescricao("PROGRAMAÇÃO ORIENTADA A OBJETOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES008");
                        disciplinas.setStatus(false);
                        break;

                    case 4:
                        disciplinas.setDescricao("BANCO DE DADOS");
                        disciplinas.setSigla("BES011");
                        disciplinas.setId(i);
                        disciplinas.setStatus(true);
                        ;
                        break;

                    case 5:
                        disciplinas.setDescricao("ENGENHARIA DE REQUISITOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES012");
                        disciplinas.setStatus(true);
                        break;

                    case 6:
                        disciplinas.setDescricao("PROGRAMAÇAO PARA DISPOSITIVOS MOVEIS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES020");
                        disciplinas.setStatus(true);
                        break;

                    case 7:
                        disciplinas.setDescricao("SISTEMAS DISTRIBUIDOS");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES026");
                        disciplinas.setStatus(true);
                        break;

                    case 8:
                        disciplinas.setDescricao("INTELIGENCIA ARTIFICIAL");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES038");
                        disciplinas.setStatus(true);
                        break;

                    case 9:
                        disciplinas.setDescricao("PROGRAMAÇÃO WEB");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES049");
                        disciplinas.setStatus(true);
                        break;

                    case 10:
                        disciplinas.setDescricao("PROGRAMAÇÃO FRONT-END");
                        disciplinas.setId(i);
                        disciplinas.setSigla("BES048");
                        disciplinas.setStatus(true);
                        break;

                }
                listaDisciplinas.add(disciplinas);
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

        return listaDisciplinas;
    }

    /**
     * Metodo que retorna um List de alunos e recebe como parametro inicio e
     * quantidade que é definada por quem chamar esse metodo. Dentro do metodo posui
     * um tratamento de erro(try catch) logo apos chamamos nosso metado
     * criarAlunos() passando como parametro o inicio, quantidade e a listAlunos e
     * no final retornamos essa lista @author Murilo
     */
    @Override
    public List<Alunos> getAlunos(int inicio, int quantidade) {
        List<Alunos> listAlunos = new ArrayList<>();
        try {
            criarAlunos(listAlunos, inicio, quantidade);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return listAlunos;
    }

    /**
     * Metodo que cria um conjunto do tipo Set de alunos, ira receber como parametro
     * a lista de Alunos, inicio e quantidade que sao valores definidos por aquele
     * que chama o metodo que serve para definir a partir de qual aluno ira começar
     * e a quantidade, cria uma condição if:
     * 
     * - inicio deve ser maior ou igual a 1
     * - quantidade deve se maior que 0
     * 
     * iniciamos uma estrutura de repetição for que possui o i como variavel de
     * controle, i deve ser maior que o inicio + a quantidade ou seja, enquanto o i
     * for maior que os dois juntos ele ira continuar no looping garantindo o
     * tamanho exato da diferença entre o inicio e a quantidade e logo apos ele
     * incrementa i++ a cada loop, dentro do for a gente cria uma instancia da
     * classe Alunos, faz o set de todos os atributos, atribuimos para a lista que
     * recebe como parametro e logo apos atribuimos ao nosso conjunto Set e depois
     * retornamos o conjunto set @author Murilo
     */
    private Set<Alunos> criarAlunos(List<Alunos> listAlunos, int inicio, int quantidade) {
        Set<Alunos> AlunosSet = new HashSet<>();
        if (inicio >= 1 && quantidade > 0) {
            for (int i = inicio; i < inicio + quantidade; i++) {
                Alunos al = new Alunos();
                al.setId(i);
                al.setMatricula(2023200 + i);
                al.setNome("Aluno" + i);
                al.setStatus(true);
                listAlunos.add(al);
                AlunosSet.add(al);
            }
        }
        return AlunosSet;
    }

    /**
     * Metodo que recebe como parametro (inicio e quantidade) que sera definida por
     * quem chamar esse metodo e retorna um conjunto do tipo Set. primeiro o metodo
     * cria um conjunto HashSet, guarda toda a lista de disciplinas que esta no
     * metodo getDisciplinas dentro da List (disciplinasList) para poder acessar
     * cada disciplina dessa List. no if ele faz a seginte condição:
     * 
     * - inicio tem que ser maior ou igual a 1
     * - inicio tem que ser menor ou igual a quantidade de disciplinas dentro da
     * List
     * - quantidade tem que ser maior que 0
     * - quantidade tem que ser menor ou igual a quantidade de disciplinas dentro da
     * List
     * 
     * no for o i recebe como valor de inicio -1 pois indica o index, o i tem que
     * ser
     * inicio -1 + a quantidade de disciplinas e o i precisa ser menor que a
     * qunatidade de disciplinas que a List possui, esta é a condição para manter a
     * estrutura de repetição e percorrer a List, ele incrementa o i++ e
     * dentro do for adicionamos o List de disciplinas dentro do conjunto Set e logo
     * após a finalização retornamos esse conjunto Set @author Murilo
     */
    private Set<Disciplinas> disciplinasDoProfessor(Integer inicio, Integer quantidade) {

        Set<Disciplinas> disciplinasSet = new HashSet<Disciplinas>();
        List<Disciplinas> disciplinasList = getDisciplinas();

        if (inicio >= 1 && inicio <= disciplinasList.size() && quantidade > 0 && quantidade <= disciplinasList.size()) {
            for (int i = inicio - 1; i < inicio - 1 + quantidade && i < disciplinasList.size(); i++) {
                disciplinasSet.add(disciplinasList.get(i));
            }
        }
        return disciplinasSet;
    }

    /**
     * Metodo que ira receber como parametro o id e de acordo com esse id ele ira
     * retorna atributos atraves do construtor da classe Departamentos, por exemplo:
     * caso o id for 1 ele ira retornar um objeto do tipo Departamento que é setado
     * pelo construtor, caso nao seja nenhuma das opções, ira retornar null @author
     * Murilo
     */
    private Departamentos criarDepartamentos(int id) {
        switch (id) {
            case 0:
                return new Departamentos(1, "Engenharia de Software", "ES");

            case 1:
                return new Departamentos(2, "Computação de Alto Nivel", "CA");

            case 2:
                return new Departamentos(3, "Computação de Alto Nivel", "CA");

            default:
                return null;
        }

    }
}