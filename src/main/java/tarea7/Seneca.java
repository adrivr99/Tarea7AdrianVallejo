/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea7;

import java.util.Date;

/**
 *
 * @author Usuario
 */
public class Seneca {
    private String empleado;
    private String DNI;
    private String puesto;
    private Date fechaPosesion;
    private Date fechaCese;
    private int telefono;
    private boolean evaluador;
    private boolean coordinador;

    public Seneca() {
    }

    public Seneca(String empleado, String DNI, String puesto, Date fechaPosesion, Date fechaCese, int telefono, boolean evaluador, boolean coordinador) {
        this.empleado = empleado;
        this.DNI = DNI;
        this.puesto = puesto;
        this.fechaPosesion = fechaPosesion;
        this.fechaCese = fechaCese;
        this.telefono = telefono;
        this.evaluador = evaluador;
        this.coordinador = coordinador;
    }

    public String getEmpleado() {
        return empleado;
    }

    public void setEmpleado(String empleado) {
        this.empleado = empleado;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public Date getFechaPosesion() {
        return fechaPosesion;
    }

    public void setFechaPosesion(Date fechaPosesion) {
        this.fechaPosesion = fechaPosesion;
    }

    public Date getFechaCese() {
        return fechaCese;
    }

    public void setFechaCese(Date fechaCese) {
        this.fechaCese = fechaCese;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public boolean isEvaluador() {
        return evaluador;
    }

    public void setEvaluador(boolean evaluador) {
        this.evaluador = evaluador;
    }

    public boolean isCoordinador() {
        return coordinador;
    }

    public void setCoordinador(boolean coordinador) {
        this.coordinador = coordinador;
    }

    @Override
    public String toString() {
        return "Seneca{" + "empleado=" + empleado + ", DNI=" + DNI + ", puesto=" + puesto + ", fechaPosesion=" + fechaPosesion + ", fechaCese=" + fechaCese + ", telefono=" + telefono + ", evaluador=" + evaluador + ", coordinador=" + coordinador + '}';
    }
    
    
}
