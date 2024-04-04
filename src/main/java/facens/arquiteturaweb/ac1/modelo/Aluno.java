package facens.arquiteturaweb.ac1.modelo;

public class Aluno {
    private Long id;
    private String nome;
    private String curso;
    private String estadocivil;
    private String pronome;
    private String documento;

    public Aluno(Long id, String nome, String curso, String estadocivil, String pronome, String documento) {
        this.id = id;
        this.nome = nome;
        this.curso = curso;
        this.estadocivil = estadocivil;
        this.pronome = pronome;
        this.documento = documento;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getEstadoCivil() {
        return estadocivil;
    }

    public void setEstadoCivil(String estadocivil) {
        this.estadocivil = estadocivil;
    }

    public String getPronome() {
        return pronome;
    }

    public void setPronome(String pronome) {
        this.pronome = pronome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }
}

