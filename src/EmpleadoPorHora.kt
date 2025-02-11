class EmpleadoPorHora(override val id: Int,
                      private var pagoHora: Double = 10.0,
                      override val nombre: String = "Desconocido"
): Empleado(nombre, id) {

    companion object {
        private fun preguntarNumHoras(): Int {
            return try {
                println("Introduce el numero de horas trabajadas: ")
                val numHoras = readln().toInt()
                if (numHoras < 0) throw Exception("El numero de horas trabajadas no es valido.")
                numHoras
            } catch (e: Exception) {
                println(e.message)
                0
            }
        }
    }

    init {
        require(id.toString().length == 4) { "El id deben ser 4 digitos numericos" }
        pagoHora = (String.format("%.2f", pagoHora).replace(',', '.')).toDouble()
    }

    override fun calcularSalario(): Double {
        val numHoras = preguntarNumHoras()
        return numHoras * pagoHora
    }
}