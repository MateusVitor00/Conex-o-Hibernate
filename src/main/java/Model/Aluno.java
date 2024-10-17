package Model;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "ALUNO")
public class Aluno implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "MATRICULA")
    private int matricula;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "TELEFONE")
    private int telefone;

    @ManyToMany
    @JoinTable(name = "alunosMatriculados", joinColumns = @JoinColumn(name = "aluno_id"), inverseJoinColumns = @JoinColumn(name = "Disciplina_id"))
    Set<Disciplinas> disciplina;

    public Aluno() {

    }

    public int getMatricula() {return matricula;}
    public void setMatricula(int matricula) {this.matricula = matricula;}

    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public int getTelefone() {return telefone;}
    public void setTelefone(int telefone) {this.telefone = telefone;}

    public Set<Disciplinas> getDisciplina() {return disciplina;}
    public void setDisciplina(Set<Disciplinas> disciplina) {this.disciplina = disciplina;}

    @Override
    public String toString() {
        return "Aluno{" +
                "matricula=" + matricula +
                ", nome='" + nome + '\'' +
                ", telefone=" + telefone +
                ", disciplina=" + disciplina +
                '}';
    }
}
