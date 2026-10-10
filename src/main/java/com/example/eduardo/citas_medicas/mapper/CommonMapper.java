package com.example.eduardo.citas_medicas.mapper;

public interface CommonMapper<RQ, RS, E> {
    public E requestAEntidad(RQ request);
    
    public RS entidadAResponse(E entidad);
}
