package com.natabares.redflixApp2;

import com.natabares.redflixApp2.vistas.VentanaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.natabares.redflixApp2")

public class RedflixApp2Application {

	public static void main(String[] args) {
            new VentanaPrincipal().setVisible(true);
        }
		
	public static void runSpringServer(String[] args){
            SpringApplication.run(RedflixApp2Application.class, args);
        }

}
