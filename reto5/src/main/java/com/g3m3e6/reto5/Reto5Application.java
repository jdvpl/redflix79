package com.g3m3e6.reto5;

import com.g3m3e6.reto5.vistas.VentanaPrincipal;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.g3m3e6.reto5")
public class Reto5Application {
    
    
        public static void main(String[] args) {
            new VentanaPrincipal().setVisible(true);
        }

	public static void IniciarSpring(){
		SpringApplication.run(Reto5Application.class);
	}

}
