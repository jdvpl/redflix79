/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.g3m3e6.reto5.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Lenovo
 */
@Entity
@Table(name="serie")

public class Serie {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name="id_serie")
  Integer idSerie;
  
  @Column(name="titulo_serie")
  String tituloSerie;
  
  @Column(name="num_temporadas")
  Integer numTemporadas;
  
  @Column(name="numCapitulos")
  Integer numCapitulos;

    public Integer getIdSerie() {
        return idSerie;
    }

    public void setIdSerie(Integer idSerie) {
        this.idSerie = idSerie;
    }

    public String getTituloSerie() {
        return tituloSerie;
    }

    public void setTituloSerie(String tituloSerie) {
        this.tituloSerie = tituloSerie;
    }

    public Integer getNumTemporadas() {
        return numTemporadas;
    }

    public void setNumTemporadas(Integer numTemporadas) {
        this.numTemporadas = numTemporadas;
    }

    public Integer getNumCapitulos() {
        return numCapitulos;
    }

    public void setNumCapitulos(Integer numCapitulos) {
        this.numCapitulos = numCapitulos;
    }

    @Override
    public String toString() {
        return "Serie{" + "idSerie=" + idSerie + ", tituloSerie=" + tituloSerie + ", numTemporadas=" + numTemporadas + ", numCapitulos=" + numCapitulos + '}';
    }
  
     
    
}
