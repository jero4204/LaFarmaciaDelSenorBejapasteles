package com.example.lafarmaciadelsenorbejapasteles.modelentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.Getter;
import lombok.Setter;
import lombok.Data;
import java.util.*;

@Data()
@Entity()
@Table(name="productos")
public class Producto {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column()
    @Getter()
    @Setter()
    @Size(min=3,max=50,
            message = "El tamaño del nombre debe estar entre 3 y 50 caracteres")
    private String nombre;

    @Column()
    @Getter()
    @Setter()
    @Size(min=3,max=50,
            message = "El tamaño de la descripcion debe estar entre 3 y 50 caracteres")
    private String descripcion;

    @Column()
    @Getter()
    @Setter()
    @Min(1)
    private Double precio;

    @Column()
    @Getter()
    @Setter()
    @Min(0)
    private Integer cantidadStock;

    @OneToMany(mappedBy="producto")
    private List<Compra> compras;
}
