package com.example.lafarmaciadelsenorbejapasteles.modelentity;

import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import lombok.*;
import java.io.Serializable;

@Data
@Entity
@Table(name="compras")
public class Compra implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column()
    @Getter()
    @Setter()
    private String fecha;

    @Column()
    @Getter()
    @Setter()
    @Min(1)
    private Integer cantidad;

    @ManyToOne()
    @JoinColumn(name="id_cliente")
    private Cliente cliente;

    @ManyToOne()
    @JoinColumn(name="id_producto")
    private Producto producto;
}
