package com.jhonny.recyclerview

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.GridLayoutManager
import android.widget.GridLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var persona: ArrayList<Persona> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        persona.add(Persona("Jhonny", "https://www.psicoactiva.com/blog/wp-content/uploads/2017/07/hombre-soltero-feliz.jpg", "Masculino"))
        persona.add(Persona("Jhonny1", "https://parabuenosaires.com/wp-content/uploads/2016/10/personas-distraidas.jpg", "Masculino"))
        persona.add(Persona("Jhonny2", "https://st-listas.20minutos.es/images/2009-02/85113/998478_640px.jpg?1241958734", "Masculino"))

        recyclerPersonas.layoutManager = GridLayoutManager(this, 1)!!//spantCoun numero de columnas
        recyclerPersonas.setHasFixedSize(true)
        recyclerPersonas.adapter = PersonasAdapter(persona, this)
    }
    //data class Persona(var nombre:String, var foto:String, var genero:String)
}
