package br.com.cotiinformatica.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@Entity
@Table(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy =  GenerationType.UUID)
    @Column(name = "id")
    private UUID id;

    @Column(name = "nome", length = 150, nullable = false, unique = true)
    private String nome;

    @Column(name= "email", length = 50, nullable = false, unique = true)
    private String email;

    @Column(name = "senha", length = 100, nullable = false)
    private String senha;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name = "data_hora_criacao", nullable = false)
    private LocalDateTime dataHoraCriacao;

    @ManyToOne
    @JoinColumn(name = "perfil_id", nullable = false)
    private Perfil perfil;


}
