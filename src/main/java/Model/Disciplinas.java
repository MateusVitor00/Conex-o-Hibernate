package Model;

import jakarta.persistence.*;

import javax.persistence.Column;
import java.util.Set;

@Table(name = "DISCIPLINAS")
public class Disciplinas {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "ID")
    private int Id;

    @Column(name = "DISCIPLINA")
    private String disciplina;

    @ManyToMany(mappedBy = "disciplina")
    Set<Aluno> alunosMatriculados;

    public Disciplinas(int id, String disciplina, Set<Aluno> alunosMatriculados) {
        Id = id;
        this.disciplina = disciplina;
        this.alunosMatriculados = alunosMatriculados;
    }

    public int getId() {return Id;}
    public void setId(int id) {Id = id;}

    public String getDisciplina() {return disciplina;}
    public void setDisciplina(String disciplina) {this.disciplina = disciplina;}

    public Set<Aluno> getAlunosMatriculados() {return alunosMatriculados;}
    public void setAlunosMatriculados(Set<Aluno> alunosMatriculados) {this.alunosMatriculados = alunosMatriculados;}

    @Override
    public String toString() {
        return "Disciplinas{" +
                "Id=" + Id +
                ", disciplina='" + disciplina + '\'' +
                ", alunosMatriculados=" + alunosMatriculados +
                '}';
    }
}
