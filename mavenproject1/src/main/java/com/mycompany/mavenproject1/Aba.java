/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

public class Aba {
    String marca;
    String proveedor;
    float precio;
    String idAbarrote;
    String idCategoria;
    
    public Aba(){

    }

    public Aba(String marca, String proveedor, float precio, String idAbarrote, String idCategoria) {
        this.marca = marca;
        this.proveedor = proveedor;
        this.precio = precio;
        this.idAbarrote = idAbarrote;
        this.idCategoria = idCategoria;
    }
    
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getidAbarrote() {
        return idAbarrote;
    }

    public void setidAbarrote(String idAbarrote) {
        this.idAbarrote = idAbarrote;
    }

    public String getidCategoria() {
        return idCategoria;
    }

    public void setidCategoria(String idCategoria) {
        this.idCategoria = idCategoria;
    }

    @Override
    public String toString() {
        return "Abarrote{" + "marca=" + marca + ", proveedor=" + proveedor + ", precio=" + precio + ", semestre=" + idAbarrote + ", promedio=" + idCategoria + '}';
    }
    
}
    
