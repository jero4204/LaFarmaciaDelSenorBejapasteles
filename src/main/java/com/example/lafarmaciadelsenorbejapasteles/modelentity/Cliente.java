package com.example.lafarmaciadelsenorbejapasteles.modelentity;

import jakarta.persistence.*;
import lombok.*;
import jakarta.validation.constraints.*;
import java.util.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="clientes")
public class Cliente implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    @Getter()
    @Setter()
    @Size(min=3,max=50,
            message = "El tamaño del nombre debe estar entre 3 y 50 caracteres")
    private String nombre;

    @Column()
    @Getter()
    @Setter()
    @Email(message = "Debe tener formato de email")
    @Size(min=10,max=100,
            message = "El tamaño del email debe estar entre 10 y 100 caracteres")
    private String email;

    @Column()
    @Getter()
    @Setter()
    @Size(min=3,max=50,
            message = "El tamaño de la direccion debe estar entre 3 y 50 caracteres")
    private String direccion;

    @Column()
    @Getter()
    @Setter()
    @Min(999999999)
    private int telefono;

    @OneToMany(mappedBy = "cliente")
    private List<Compra> compras;
}
