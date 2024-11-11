package com.example.gestionempleados

class EmpleadoPorComision (
    nombre: String, id: Int,
    tipo: String,
    private val salarioBase: Double,
    private val porcentajeComision: Double,
    private val totalVentasGeneradas: Double

) : Empleado(nombre, id, tipo= "Por Comision") {
    override fun calcularSalario(): Double {
        val porcentaje = porcentajeComision * 0.01
        val salario: Double = salarioBase + (totalVentasGeneradas * porcentaje)
        return  salario
    }


}