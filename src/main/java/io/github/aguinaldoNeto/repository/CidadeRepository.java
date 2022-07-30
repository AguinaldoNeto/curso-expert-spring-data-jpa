package io.github.aguinaldoNeto.repository;

import io.github.aguinaldoNeto.entity.Cidade;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {

    //Listar cidades que tenham exatamente esse pedaço
    List<Cidade> findByNome(String nome);

    //Listar cidades que tenham exatamente esse pedaço
    List<Cidade> findByNomeStartingWith(String nome);

    //Listar cidades que terminem exatamente por esse pedaço
    List<Cidade> findByNomeEndingWith(String nome);

    //Listar cidades que contenham esse pedaço
    List<Cidade> findByNomeContaining(String nome);

    //Listar cidades que comecem, terminem ou contenham um pedaço
    List<Cidade> findByNomeLike(String nome, Sort sort);

    //Listar número de habitantes que tenham exatamente esse valor
    Page<Cidade> findByHabitantes(Long habitantes, Pageable page);

    //Listar cidades que tenha um número de habitantes MENOR que X valor
    List<Cidade> findByHabitantesLessThan(Long habitantes);

    //Listar cidades que tenha um número de habitantes MAIOR que X valor
    List<Cidade> findByHabitantesGreaterThan(Long habitantes);

    //Listar cidades que tenha um número de habitantes MAIOR ou IGUAL a X valor
    List<Cidade> findByHabitantesGreaterThanEqual(Long habitantes);

    //Listar cidades que tenha um número de habitantes MAIOR ou IGUAL a X valor
    List<Cidade> findByHabitantesGreaterThanEqualAndNomeLike(Long habitantes, String nome);

    //Listar cidades que comecem, terminem ou contenham um pedaço e que trabalhar o lower ou uppercase
    @Query(value = "select c from Cidade c "
            + "           where upper(c.nome) like upper(?1) ")
    List<Cidade> findByNomeLikeQuery(String nome);






}
