/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.natabares.redflixApp2.modelos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author natabares
 */

@Entity
@Table (name = "usuario")

public class Usuario {
   
    @Id
    @Column (name = "aliasuser")
    String aliasUser;
    
    @Column (name = "nombreuser")
    String nombreUser;

    public String getAliasUser() {
        return aliasUser;
    }

    public void setAliasUser(String aliasUser) {
        this.aliasUser = aliasUser;
    }

    public String getNombreUser() {
        return nombreUser;
    }

    public void setNombreUser(String nombreUser) {
        this.nombreUser = nombreUser;
    }

    @Override
    public String toString() {
        return "Usuario{" + "aliasUser=" + aliasUser + ", nombreUser=" + nombreUser + '}';
    }
    
    
    
}
