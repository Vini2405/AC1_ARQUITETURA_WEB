package facens.arquiteturaweb.ac1.repository;

import facens.arquiteturaweb.ac1.modelo.Aluno;

import java.util.List;

public interface AlunoRepository {
    List<Aluno> findAll();
    Aluno findById(Long id);
    Aluno save(Aluno aluno);
}

