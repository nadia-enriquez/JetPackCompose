package com.example.gestionempleados

 open class Empleado (val nombre: String, val id: Int, val tipo: String){

    open fun calcularSalario(): Double{
        return 0.0
    }
}
