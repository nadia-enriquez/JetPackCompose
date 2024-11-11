package com.example.reservavuelos

fun main(){

    //Creación de RESERVAS INDIVIDUALES
    val reserva1 = ReservaIndividual(ReservaIndividual.TipoVuelo.ECONOMICA, 200.0)
    val reserva2 = ReservaIndividual(ReservaIndividual.TipoVuelo.EJECUTIVA, 300.0)

    //Creación de RESERVAS GRUPALES
    val reservaGrupal1 = ReservaGrupal()
    reservaGrupal1.agregarReserva(reserva1)
    reservaGrupal1.agregarReserva(reserva2)

    //Aplicar un descuento del 10% a las reserva grupal
    reservaGrupal1.aplicarDescuento(0.10)

    //Crear otra reserva individual y otra grupal
    val reserva3 = ReservaIndividual(ReservaIndividual.TipoVuelo.ECONOMICA, 150.0)
    val reservaGrupal2 = ReservaGrupal()
    reservaGrupal2.agregarReserva(reserva3)
    reservaGrupal2.agregarReserva(reservaGrupal1) //Agregar reserva grupal a otra reserva grupal

    //calcular y mostrar los costos
    println("Costo de la reserva1: ${reserva1.calcularCosto()}")
    println("Costo de la reserva2: ${reserva2.calcularCosto()}")
    println("Costo de la reserva grupal 1 (con descuento): ${reservaGrupal1.calcularCosto()}")
    println("Costo de la reserva grupal 3: ${reserva3.calcularCosto()}")
    println("Costo de la reserva grupal 2 (con reserva grupal añadida): ${reservaGrupal2.calcularCosto()}")


}