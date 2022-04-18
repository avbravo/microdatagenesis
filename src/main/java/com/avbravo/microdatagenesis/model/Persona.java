/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.avbravo.microdatagenesis.model;



import com.avbravo.jmoordbbase.anotation.Entity;
import com.avbravo.jmoordbbase.anotation.Id;
import lombok.Builder;
import lombok.Data;

/**
 *
 * @author avbravo
 */
@Entity(collecction = "persona")
@Data
@Builder
public class Persona {
    @Id
    private String id;
    private String username;
    
}
