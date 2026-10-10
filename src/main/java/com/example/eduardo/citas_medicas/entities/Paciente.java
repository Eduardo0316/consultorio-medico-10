package com.example.eduardo.citas_medicas.entities;

import com.example.eduardo.citas_medicas.enums.EstadoRegistro;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity 
@Table(name = "PACIENTES")
@AllArgsConstructor 
@NoArgsConstructor 
@Builder @Getter 
public class Paciente {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PACIENTE")
    private Long id;
    
    @Column(name = "NOMBRE")
    private String nombre;
    
    @Column(name = "APELLIDO_PATERNO")
    private String apellidoPaterno;
    
    @Column(name = "APELLIDO_MATERNO")
    private String apellidoMaterno;
    
    @Column(name = "EDAD")
    private Integer edad;
    
    @Column(name = "PESO")
    private Double peso;
    
    @Column(name = "ESTATURA")
    private Double estatura;
    
    @Column(name = "IMC")
    private Double imc;
    
    @Column(name = "EMAIL")
    private String email;
    
    @Column(name = "NUM_EXPEDIENTE")
    private String numExpediente;
    
    @Column(name = "TELEFONO")
    private String telefono;
    
    @Column(name = "DIRECCION")
    private String direccion;
    
    @Column(name = "ESTADO_REGISTRO")
    private EstadoRegistro estadoRegistro;

    // public static Paciente crear(){}
}
