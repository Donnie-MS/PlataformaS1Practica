package ar.edu.unahur.obj2.wtoj.plataforma;

import java.util.List;

import ar.edu.unahur.obj2.wtoj.PlanesDeSubscripcion.PlanDeSubscripcion;
import ar.edu.unahur.obj2.wtoj.contenido.Contenido;

import java.util.ArrayList;
import java.util.Collections;

public class Usuario {
    private final List<Contenido> contenidos = new ArrayList<>();
    private PlanDeSubscripcion planDeSubscripcion;
    
    public Usuario(PlanDeSubscripcion planDeSubscripcion) {
        this.planDeSubscripcion = planDeSubscripcion;
    }

    public void cambiarPlanDeSubscripcion(PlanDeSubscripcion nuevoPlanDeSubscripcion) {
        planDeSubscripcion = nuevoPlanDeSubscripcion;
    }

    public void verContenido(Contenido contenido) {
        contenidos.add(contenido);
    }

    public List<Contenido> getContenidos() {
        return Collections.unmodifiableList(contenidos);
    }

    public int cantidadDeContenidos() {
        return contenidos.size();
    }
}

