/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package maquinaexpendedora;


/**
 *
 * @author Suplente
 */
public class Producto {
    //Total de productos que tenemos
    static int total_codigo = 1;
    //El codigo de este prodcto en especifico
    public int codigo;
    //El precio del producto
    public float precio;
    //El nombre del producto
    public String Nombre;
    //Constructor de la clase producto
    //Necesita un nombre y precio de argumento
    Producto(String name, float prec)
    {
        //Se le asigna un codigo 
        codigo = total_codigo++;
        Nombre = name;
        precio = prec*1.21f;
    }
}
