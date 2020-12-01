
package com.g3m3e6.reto5;

import com.g3m3e6.reto5.entidades.Usuario;
import com.g3m3e6.reto5.repositorios.UsuarioRepositorio;
import java.util.Optional;
import javax.swing.JOptionPane;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MainSpring implements CommandLineRunner{
    
    @Autowired
    UsuarioRepositorio usuarioRepositorio;
    @Override
    public void run(String... args) throws Exception {
        
    }
    
}
