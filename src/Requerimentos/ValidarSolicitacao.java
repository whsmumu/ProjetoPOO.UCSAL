package Requerimentos;

public class ValidarSolicitacao implements IReservas {
    public void validaReserva() {

    }
    public void validaDiaReserva(Date diaReserva, Date diaReservado) throws DominioExcessoes {
        Date diaUser = new Date();
        if (diaReserva.before(diaUser))
            throw new DominioExcessoes("data reserva deve ser futura");


        if (diaReservado.compareTo(diaReserva) <= 0)
            throw new DominioExcessoes("laboratorio em uso");

    }
    public void validaReservaLaboratorio(Integer capacidadeLaboratorio, Boolean statusLaboratorio, TreeSet<Alunos> grupoAlunos) throws DominioExcessoes {
        if (!statusLaboratorio) {
            throw new DominioExcessoes("Laboratorio Indisponivel");

        }
        if (grupoAlunos.size() > capacidadeLaboratorio) {
            throw new DominioExcessoes("Capacidade laboratorio insuficiente");
        }
    }
    public void validaDisciplina(Boolean statusDisciplina) throws DominioExcessoes {
        if (!statusDisciplina) {
            throw new DominioExcessoes("Disciplina Indisponivel");
        }

    }
    public void validaProfessor(Boolean statusProfessor) {
        if (!statusProfessor) {
            throw new DominioExcessoes("Professor Indisponivel");
        }

    }
    public void validaAlunos(Boolean statusAlunos, TreeSet<Alunos> grupoAlunos) {
        if (!statusAlunos) {
            throw new DominioExcessoes("Alunos Indisponiveis");
        }
    }
}
