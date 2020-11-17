package org.rizosdb.presentacion.ejemplomvvm.model

class Alumno {

    var nombre : String = ""
    var matricula : String = ""
    var correo : String = ""

    override fun toString(): String {
        return "Alumno(nombre='$nombre', matricula='$matricula', correo='$correo')"
    }


}