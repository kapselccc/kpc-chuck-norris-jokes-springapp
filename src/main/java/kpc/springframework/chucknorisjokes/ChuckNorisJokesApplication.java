package kpc.springframework.chucknorisjokes;

import kpc.springframework.chucknorisjokes.controllers.JokesController;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class ChuckNorisJokesApplication {

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(ChuckNorisJokesApplication.class, args);
		JokesController jokesController = (JokesController) ctx.getBean("jokesController");

	}

}
