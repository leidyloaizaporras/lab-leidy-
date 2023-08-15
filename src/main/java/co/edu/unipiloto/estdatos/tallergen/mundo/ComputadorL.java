/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.estdatos.tallergen.mundo;

/**
 *
 * @author USUARIO
 */
public class ComputadorL extends Electronico {

    public enum SistemaOL {
        MacOS, Linux, Windows, Solaris, Unix, FreeBSD

    }
    private SistemaOL sistemaOperativo;

    public ComputadorL(SistemaOL sistemOp,double pPrecio,Gama pGama   ) {
        super(pGama, pPrecio);
        sistemaOperativo = sistemOp;
    }
}
 