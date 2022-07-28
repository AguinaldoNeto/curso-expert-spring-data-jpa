package io.github.aguinaldoNeto;

import io.github.aguinaldoNeto.entity.Cidade;
import io.github.aguinaldoNeto.repository.CidadeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;

@SpringBootApplication()
public class LocalizacaoApplication implements CommandLineRunner {

	@Autowired
	private CidadeRepository cidadeRepository;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("<--------------------------------------------------------->");

		listarCidadePorNome();



		System.out.println("<--------------------------------------------------------->");

	}

	@Transactional
	void salvarCidade() {
		var cidade = new Cidade(1L, "São Paulo", 1239672L );
		cidadeRepository.save(cidade);
	}

	void listarCidade() {
		cidadeRepository
				.findAll()
				.forEach(System.out::println);
	}

	void listarCidadePorNome() {
		cidadeRepository
				.findByNomeLike("%ta%")
				.forEach(System.out::println);
	}

	void listarCidadePorHabitantes() {
		cidadeRepository
				.findByHabitantes(12396372L)
				.forEach(System.out::println);
	}

	public static void main(String[] args) {
		SpringApplication.run(LocalizacaoApplication.class, args);
	}

}
