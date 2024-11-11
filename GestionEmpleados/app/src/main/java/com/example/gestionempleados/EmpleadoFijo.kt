package com.example.gestionempleados

class EmpleadoFijo(
    nombre: String,
    id: Int,
    tipo: String,
    private val salarioMensual: Double)

    : Empleado(nombre, id, tipo = "Fijo" ){
        override fun calcularSalario(): Double{
            return salarioMensual
        }

}

