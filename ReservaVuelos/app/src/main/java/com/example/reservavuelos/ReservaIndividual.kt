package com.example.reservavuelos

class ReservaIndividual(
    private val tarifa: TipoVuelo,
    private val costoBase: Double
) : Reserva{
    enum class TipoVuelo {
        ECONOMICA,EJECUTIVA
    }

    override fun calcularCosto(): Double {
        return when (tarifa) {
            TipoVuelo.ECONOMICA -> costoBase
            TipoVuelo.EJECUTIVA -> costoBase * 1.5
        }
    }

}