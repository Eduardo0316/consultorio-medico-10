package com.example.eduardo.citas_medicas.enums;

import com.example.eduardo.citas_medicas.exceptions.DatoInvalidoException;
import com.example.eduardo.citas_medicas.utils.StringCustomUtils;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum EstadoRegistro {
    ACTIVO("Activo"), ELIMINADO("Eliminado");

    private final String descripcion;

    public static EstadoRegistro obtenerPorDescripcion(String descripcion) {
        StringCustomUtils.validarNoVacio(descripcion, "El día es requerido");

        String normalizada = StringCustomUtils.normalizarTexto(descripcion.trim());

        for (EstadoRegistro estado : values()) {
            if (StringCustomUtils.normalizarTexto(estado.descripcion).equalsIgnoreCase(normalizada))
                return estado;
        }

        throw new DatoInvalidoException("No existe un día con la descripción: " + descripcion);
    }

}