/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSF/JSFManagedBean.java to edit this template
 */
package com.avbravo.microdatagenesis.repository;

import com.avbravo.jmoordbgenesis.repository.Repository;
import com.avbravo.microdatagenesis.model.Persona;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Named;
import java.io.Serializable;


/**
 *
 * @author avbravo
 */
@Named(value = "personaRepository")
@ApplicationScoped
//@Stateless
public class PersonaRepository extends Repository<Persona> implements Serializable{

   public PersonaRepository(){
        super(Persona.class,"genesis","persona");
    }

   
  
 
    
}
