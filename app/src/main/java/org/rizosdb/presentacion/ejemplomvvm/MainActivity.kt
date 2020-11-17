package org.rizosdb.presentacion.ejemplomvvm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import org.rizosdb.presentacion.ejemplomvvm.model.Alumno
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<Button>(R.id.btnGuardar).setOnClickListener { view ->
            guardarAlumno()
         }

        }
    fun guardarAlumno(){
        val alumnoList = arrayListOf<Alumno>()
        val alumno = Alumno()
            alumno.nombre = findViewById<EditText>(R.id.txtNombre).text.toString()
            alumno.matricula = findViewById<EditText>(R.id.txtMatricula).text.toString()
            alumno.correo = findViewById<EditText>(R.id.txtCorreo).text.toString()


        if(alumno.correo.length > 0 && alumno.matricula.length > 0 && alumno.nombre.length > 0){
            Toast.makeText(this, "Nombre del alumno: "+alumno.nombre+
                                            "\nMatricula: "+alumno.matricula+
                                            "\nCorreo institucional: "+alumno.correo
                , Toast.LENGTH_LONG).show()
            alumnoList.add(alumno)
            findViewById<TextView>(R.id.txtListaAlumnos).text = alumnoList.toString()
            print(alumnoList.toString())
        }else{
            Toast.makeText(this, "No se haga el gracioso, llene los campos correctamente"
                , Toast.LENGTH_SHORT).show()
        }

    }

    }



//Toast.makeText(this, "Notificación corta", Toast.LENGTH_SHORT).show()
