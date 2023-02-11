package com.h2.h2api.modelo;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long Id;
    @Column(nullable = false)

    private Long idCliente;
    private String nombreCliente;
    @Column(nullable = false)

    private String fechaNaciminetoCliente;
    @Column(nullable = false)

    private String ciudadResidenciaClente;
    @Column(nullable = false)

    private String direccionCliente;
    private Long idPoliza;
    @Column(nullable = false)

    private String nombrePlanPoliza;
    private String fechaExpedicionPoliza;
    private String coberturasPoliza;
    private String valorMaxCubiertoPoliza;
    private String placaAuto;
    private String modeloAuto;
    @Column(nullable = false)

    private String inspeccion;


}
