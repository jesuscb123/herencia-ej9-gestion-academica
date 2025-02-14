class Profesor(nombre: String, edad: Int, id: String, val departamento: String, val aniosExperiencia: Int) : Persona(nombre,edad,id) {

    fun mostrarExperiencia(){
        println("Años de experiencia: $aniosExperiencia")
    }

    override fun mostrarRol() {
        println("Rol: Profesor")
    }
}