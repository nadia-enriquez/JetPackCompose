package com.example.gestionempleados

fun main() {
    val empleadoFijo = EmpleadoFijo("Juan", 1234, "",2000.0, )
    val empleadoPorHoras = EmpleadoPorHoras("Maria", 5678, "",50.0, 100.0)
    val empleadoPorComision = EmpleadoPorComision("Pedro", 9012,"", 3000.0, 10.0, 5000.0)


    val empleados = listOf(empleadoFijo, empleadoPorHoras, empleadoPorComision)

    for (empleado in empleados) {
        println("Empleado ${empleado.tipo}: ${empleado.nombre}, ID: ${empleado.id}, Salario: ${empleado.calcularSalario()}")
    }

}
