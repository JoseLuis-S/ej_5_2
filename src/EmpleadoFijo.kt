class EmpleadoFijo(override val id: Int,
                   private var pagoHora: Double = 10.0,
                   override val nombre: String = "Desconocido"
): Empleado(nombre, id) {

    companion object {
        val HORAS_POR_MES: Int = 160
    }

    init {
        require(id.toString().length == 4) { "El id deben ser 4 digitos numericos" }
        pagoHora = (String.format("%.2f", pagoHora).replace(',', '.')).toDouble()
    }

    override fun calcularSalario(): Double = HORAS_POR_MES * pagoHora
}