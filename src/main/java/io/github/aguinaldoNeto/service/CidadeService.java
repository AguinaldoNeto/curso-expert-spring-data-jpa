package io.github.aguinaldoNeto.service;

import io.github.aguinaldoNeto.entity.Cidade;
import io.github.aguinaldoNeto.repository.CidadeRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CidadeService {

    public CidadeRepository repository;

    public CidadeService( CidadeRepository repository) {
        this.repository = repository;
    }

    public List<Cidade> findByNome(String nome) {
        return repository.findByNome(nome);
    }

    public List<Cidade> findByNomeStartingWith(String nome) {
        return repository.findByNomeStartingWith(nome);
    }

    public List<Cidade> findByNomeEndingWith(String nome) {
        return repository.findByNomeEndingWith(nome);
    }

    public List<Cidade> findByNomeContaining(String nome) {
        return repository.findByNomeContaining(nome);
    }

    public void findByNomeLike(String nome, Sort sort) {
        repository
                .findByNomeLike(nome, sort);
    }

    public void findByHabitantes() {
        Pageable page = PageRequest.of(0, 10);

        repository
                .findByHabitantes(1000000L, page)
                .forEach(System.out::println);
    }

    public List<Cidade> findByHabitantesLessThan(Long habitantes) {
        return repository.findByHabitantesLessThan(habitantes);
    }

    public List<Cidade> findByHabitantesGreaterThan(Long habitantes) {
        return repository.findByHabitantesGreaterThan(habitantes);
    }


    public List<Cidade> findByHabitantesGreaterThanEqual(Long habitantes) {
        return repository.findByHabitantesGreaterThanEqual(habitantes);
    }

    public List<Cidade> findByHabitantesGreaterThanEqualAndNomeLike(Long habitantes, String nome) {
        return repository.findByHabitantesGreaterThanEqualAndNomeLike(habitantes, nome);
    }

    public List<Cidade> findByNomeLikeQuery(String nome) {
        return repository.findByNomeLikeQuery(nome);
    }








}
