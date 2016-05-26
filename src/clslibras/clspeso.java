/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package clslibras;

/**
 *
 * @author FRANKLIN
 */
public class clspeso {

   
    enum unid{litros,libras,metros}
    private int _id;
    private String _nombre;
    private float _valor;
    private unid _unidad;

    public clspeso() {
    }

    public clspeso(int _id, String _nombre, float _valor, unid _unidad) {
        this._id = _id;
        this._nombre = _nombre;
        this._valor = _valor;
        this._unidad = _unidad;
    }
    
     public int Id() {
        return _id;
    }

    public void Id(int _id) {
        this._id = _id;
    }

    public String Nombre() {
        return _nombre;
    }

    public void Nombre(String _nombre) {
        this._nombre = _nombre;
    }

    public float Valor() {
        return _valor;
    }

    public void Valor(float _valor) {
        this._valor = _valor;
    }

    public unid Unidad() {
        return _unidad;
    }

    public void Unidad(unid _unidad) {
        this._unidad = _unidad;
    }
    
}
