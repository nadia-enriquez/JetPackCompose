package com.example.gestionempleados

class EmpleadoPorHoras (
    nombre: String,
    id: Int,
    tipo: String,
    private val horasTrabajadas: Double,
    private val tarifaPorHora: Double,

) : Empleado (nombre, id, tipo = "Por Horas") {

        override fun calcularSalario(): Double {
             var salario: Double
            if (horasTrabajadas > 40) {
                val horasExtras = horasTrabajadas - 40
                salario = (40 * tarifaPorHora) + (horasExtras * (tarifaPorHora * 1.5))
                return salario
            } else {
                salario = horasTrabajadas * tarifaPorHora
                return salario
            }

        }
}