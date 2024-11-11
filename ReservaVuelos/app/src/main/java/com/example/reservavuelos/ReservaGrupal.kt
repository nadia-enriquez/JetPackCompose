package com.example.reservavuelos

class ReservaGrupal : Reserva {
    private val reservas: MutableList<Reserva> = mutableListOf()
    private var descuento: Double = 0.0

    fun agregarReserva(reserva: Reserva) {
        reservas.add(reserva)
    }

    fun aplicarDescuento(descuento: Double) {
        this.descuento = descuento
        }

    override fun calcularCosto(): Double {
        val costoTotal = reservas.sumOf { it.calcularCosto() }
        return costoTotal - (costoTotal * descuento)
    }

}

