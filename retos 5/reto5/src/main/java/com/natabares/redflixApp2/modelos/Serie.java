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
@Table (name = "serie")

public class Serie {
    
    @Id
    @Column (name = "idserie")
    Long idSerie;
    
    @Column (name = "tituloserie")
    String tituloSerie;
    
    @Column (name = "temporadasserie")
    Integer temporadasSerie;
    
    @Column (name = "capitulosserie")
    Integer capitulosSerie;

    public Long getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Long idSerie) {
        this.idSerie = idSerie;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public Integer getTemporadasSerie() {
        return temporadasSerie;
    }

    public void setTemporadasSerie(Integer temporadasSerie) {
        this.temporadasSerie = temporadasSerie;
    }

    public Integer getCapitulosSerie() {
        return capitulosSerie;
    }

    public void setCapitulosSerie(Integer capitulosSerie) {
        this.capitulosSerie = capitulosSerie;
    }

    @Override
    public String toString() {
        return "Serie{" + "idSerie=" + idSerie + ", tituloSerie=" + tituloSerie + ", temporadasSerie=" + temporadasSerie + ", capitulosSerie=" + capitulosSerie + '}';
    }
    
    
    
}
