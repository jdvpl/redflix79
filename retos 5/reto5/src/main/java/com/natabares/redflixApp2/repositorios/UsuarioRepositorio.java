/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natabares.redflixApp2.repositorios;

import com.natabares.redflixApp2.modelos.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author natabares
 */

@Repository
public interface UsuarioRepositorio extends JpaRepository <Usuario,String>{
    
}
