package com.Challenge.Challenge.Foro.Hub;

import jakarta.validation.Valid;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
public class ChallengeForoHubApplication {

	public static void main(String[] args) {
		SpringApplication.run(ChallengeForoHubApplication.class, args);
	}

@SpringBootApplication
@RequestMapping("/tópicos")
@Valid()
public class foro {

		@PostMapping
		public void solicitud(@RequestBody String parametro){
			System.out.println("La solicitud llega correctamente");
			System.out.println(parametro);
		}
	}

  		  @GetMapping
          protected void datosTopicos(String titulo, String mensaje, String fecha,
									  String estado, String autor, String curso) {

    }

}
