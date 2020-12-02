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
@Table (name = "pelicula")

public class Pelicula {
    
    @Id
    @Column(name = "idpelicula")
    Long idPelicula;
    
    @Column(name = "titulopelicula")
    String tituloPelicula;
    
    @Column(name = "resumenpel")
    String resumenPel;
    
    @Column(name = "yearpel")
    Integer yearPel;
    
    @Column (name= "nombredirector")
    String nombreDirector;

    public Long getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(Long idPelicula) {
        this.idPelicula = idPelicula;
    }

    public String getTituloPelicula() {
        return tituloPelicula;
    }

    public void setTituloPelicula(String tituloPelicula) {
        this.tituloPelicula = tituloPelicula;
    }

    public String getResumenPel() {
        return resumenPel;
    }

    public void setResumenPel(String resumenPel) {
        this.resumenPel = resumenPel;
    }

    public Integer getYearPel() {
        return yearPel;
    }

    public void setYearPel(Integer yearPel) {
        this.yearPel = yearPel;
    }

    public String getNombreDirector() {
        return nombreDirector;
    }

    public void setNombreDirector(String nombreDirector) {
        this.nombreDirector = nombreDirector;
    }

    @Override
    public String toString() {
        return "Pelicula{" + "idPelicula=" + idPelicula + ", tituloPelicula=" + tituloPelicula + ", resumenPel=" + resumenPel + ", yearPel=" + yearPel + ", nombreDirector=" + nombreDirector + '}';
    }
    
    
    
}
