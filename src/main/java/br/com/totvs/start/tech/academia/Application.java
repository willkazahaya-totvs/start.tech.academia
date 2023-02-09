package br.com.totvs.start.tech.academia;

import br.com.totvs.start.tech.academia.entity.Academia;
import br.com.totvs.start.tech.academia.entity.Plano;
import br.com.totvs.start.tech.academia.service.AcademiaServiceImpl;
import br.com.totvs.start.tech.academia.service.PlanoServiceImpl;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		List<Academia> listAcademia = new ArrayList<Academia>();
		List<Plano> listPlano = new ArrayList<Plano>();

		SpringApplication.run(Application.class, args);

		AcademiaServiceImpl academiaService = new AcademiaServiceImpl();
		PlanoServiceImpl planoService = new PlanoServiceImpl();

	}

}
