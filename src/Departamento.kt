class Departamento() {
    val listaEmpleados: MutableList<Empleado> = mutableListOf()

    fun agregarEmpleados(empleados: List<Empleado>) = empleados.forEach { listaEmpleados.add(it) }
    fun calcularSalarioTotal(): Double {
        var salarioTotal = 0.0
        listaEmpleados.forEach { salarioTotal += it.calcularSalario() }
        return salarioTotal
    }
}