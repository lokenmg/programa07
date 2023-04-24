/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.programa07;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Rodrigo Mencías
 */
@Entity
@Table(name="detalleventa")
public class DetalleVenta {
    
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="clavepro")
    private long claveproducto;
    
    @Column(name="precio")
    private double precio;
    @Column(name="cantidad")
    private double cantidad;
    @Column(name="subtotal")
    private double subtotal;
    
    @ManyToOne
    @JoinColumn(name="venta_clave", nullable=false)
    private Venta venta;

    public Venta getVenta() {
        return venta;
    }

    public void setVenta(Venta venta) {
        this.venta = venta;
    }

    public long getClaveproducto() {
        return claveproducto;
    }

    public void setClaveproducto(long claveproducto) {
        this.claveproducto = claveproducto;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }
}
