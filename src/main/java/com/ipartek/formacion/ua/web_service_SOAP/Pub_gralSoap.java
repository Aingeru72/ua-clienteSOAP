/**
 * Pub_gralSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipartek.formacion.ua.web_service_SOAP;

public interface Pub_gralSoap extends java.rmi.Remote {
    public com.ipartek.formacion.ua.web_service_SOAP.ClaseNoticias[] wsnoticias(java.lang.String plengua, java.lang.String pfechaini) throws java.rmi.RemoteException;
    public com.ipartek.formacion.ua.web_service_SOAP.ClaseDiasFestivos[] wsdiasfestivos(java.lang.String plengua, java.lang.String pcurso) throws java.rmi.RemoteException;
    public com.ipartek.formacion.ua.web_service_SOAP.ClaseX500[] wsx500(java.lang.String plengua, java.lang.String ptexto) throws java.rmi.RemoteException;
    public com.ipartek.formacion.ua.web_service_SOAP.ClaseAlojamiento[] wsalojamientos() throws java.rmi.RemoteException;
    public com.ipartek.formacion.ua.web_service_SOAP.ClaseVideo[] wsvideo(java.lang.String plengua, java.lang.String pfechadesde) throws java.rmi.RemoteException;
}
