package com.example.actividad2010

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*
import android.widget.AdapterView

class MainActivity : AppCompatActivity() {

        private lateinit var etNombre: EditText
        private lateinit var etApellido: EditText
        private lateinit var espDepartamento: Spinner
        private lateinit var espMunicipio: Spinner
        private lateinit var rgGender: RadioGroup
        private lateinit var rbMale: RadioButton
        private lateinit var rbFemale: RadioButton
        private lateinit var etTelefono: EditText
        private lateinit var btGuardar: Button
        private lateinit var tvMostrar: TextView

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            etNombre = findViewById(R.id.etNombre)
            etApellido = findViewById(R.id.etApellido)
            espDepartamento = findViewById(R.id.spinnerDep)
            espMunicipio = findViewById(R.id.spinnerMunicipio)
            rgGender = findViewById(R.id.rgsexp)
            rbFemale = findViewById(R.id.rbFem)
            rbMale = findViewById(R.id.rbMas)
            etTelefono= findViewById(R.id.etTel)
            btGuardar= findViewById(R.id.btGuardar)
            tvMostrar = findViewById(R.id.tvMostrar)


            val opciones = arrayOf(
                "Ahuachapan",
                "Santa Ana",
                "Sonsonate",
                "Chalatenango",
                "Cuscatlan",
                "San Salvador",
                "La Libertad",
                "San Vicente",
                "Cabañas",
                "La Paz",
                "Usulutan",
                "San Miguel",
                "Morazan",
                "La Union"
            )
            val adaptador = ArrayAdapter(this, android.R.layout.simple_spinner_item, opciones)
            espDepartamento.adapter =  adaptador


            fun getMunicipios(depto:String):ArrayList<String>{
                val municipios= arrayListOf<String>()
                when(depto){
                    "Ahuachapan"->municipios.addAll(listOf("Ahuachapán","Apaneca","Atiquizaya","Concepción de Ataco","El Refugio","Guaymango","Jujutla",
                        "San Francisco Menéndez","San Lorenzo","San Pedro Puxtla","Tacuba","Turín"))
                    "Santa Ana"->municipios.addAll(listOf("Candelaria de la Frontera","Chalchuapa","Coatepeque","El Congo","El Porvenir","Masahuat","Metapán",
                        "San Antonio Pajonal","San Sebastián Salitrillo","Santa Ana","Santa Rosa Guachipilín","Santiago de la Frontera","Texistepeque"))
                    "Sonsonate"->municipios.addAll(listOf("Acajutla","Armenia","Caluco","Cuisnahuat","Izalco","Juayúa","Nahuizalco","Nahulingo","Salcoatitán",
                        "San Antonio del Monte","San Julián","Santa Catarina Masahuat","Santa Isabel Ishuatán","Santo Domingo de Guzmán","Sonsonate",
                        "Sonzacate"))
                    "Chalatenango"->municipios.addAll(listOf("Agua Caliente","Arcatao","Azacualpa","Chalatenango","Citalá","Comalapa","Concepción Quezaltepeque",
                        "Dulce Nombre de María","El Carrizal","El Paraíso","La Laguna","La Palma","La Reina","Las Vueltas","Nombre de Jesús","Nueva Concepción",
                        "Nueva Trinidad","Ojos de Agua","Potonico","San Antonio de la Cruz","San Antonio Los Ranchos","San Fernando","San Francisco Lempa",
                        "San Francisco Morazán","San Ignacio","San Isidro Labrador","San José Cancasque (Cancasque)","San José Las Flores","San Luis del Carmen",
                        "San Miguel de Mercedes","San Rafael","Santa Rita","Tejutla"))
                    "Cuscatlan"->municipios.addAll(listOf("Candelaria","Cojutepeque","El Carmen","El Rosario","Monte San Juan","Oratorio de Concepción","San Bartolomé Perulapía",
                        "San Cristóbal","San José Guayabal","San Pedro Perulapán","San Rafael Cedros","San Ramón","Santa Cruz Analquito","Santa Cruz Michapa",
                        "Suchitoto","Tenancingo"))
                    "Cabañas"->municipios.addAll(listOf("Cinquera","Dolores (Villa Doleres)","Guacotecti","Ilobasco","Jutiapa","San Isidro",
                        "Sensuntepeque","Tejutepeque","Victoria"))
                    "San Salvador"->municipios.addAll(listOf("Aguilares","Apopa","Ayutuxtepeque","Ciuddad Delgado","Cuscatancingo","El Paisnal","Guazapa","Ilopango",
                        "Mejicanos","Nejapa","Panchimalco","Rosario de Mora","San Marcos","San Martín","San Salvador","Santiago Texacuangos","Santo Tomás",
                        "Soyapango","Tonacatepeque"))
                    "La Libertad"->municipios.addAll(listOf("Antiguo Cuscatlán","Chiltiupán","Ciudad Arce","Colón","Comasagua","Huizúcar","Jayaque","Jicalapa",
                        "La Libertad","Santa Tecla (Nueva San Salvador)","Nuevo Cuscatlán","San Juan Opico","Quezaltepeque","Sacacoyo",
                        "San José Villanueva","San Matías","San Pablo Tacachico","Talnique","Tamanique","Teotepeque","Tepecoyo","Zaragoza"))
                    "San Vicente"->municipios.addAll(listOf("Apastepeque","Guadalupe","San Cayetano Istepeque","San Esteban Catarina","San Ildefonso","San Lorenzo",
                        "San Sebastián","San Vicente","Santa Clara","Santo Domingo","Tecoluca","Tepetitán","Verapaz"))
                    "La Paz"->municipios.addAll(listOf("Cuyultitán","El Rosario (Rosario de La Paz)","Jerusalén","Mercedes La Ceiba","Olocuilta","Paraíso de Osorio",
                        "San Antonio Masahuat","San Emigdio","San Francisco Chinameca","San Juan Nonualco","San Juan Talpa","San Juan Tepezontes",
                        "San Luis La Herradura","San Luis Talpa","San Miguel Tepezontes","San Pedro Masahuat","San Pedro Nonualco","San Rafael Obrajuelo",
                        "Santa María Ostuma","Santiago Nonualco","Tapalhuaca","Zacatecoluca"))
                    "Usulutan"->municipios.addAll(listOf("Alegría","Berlín","California","Concepción Batres","El Triunfo","Ereguayquín","Estanzuelas","Jiquilisco",
                        "Jucuapa","Jucuarán","Mercedes Umaña","Nueva Granada","Ozatlán","Puerto El Triunfo","San Agustín","San Buenaventura",
                        "San Dionisio","San Francisco Javier","Santa Elena","Santa María","Santiago de María","Tecapán","Usulután"))
                    "San Miguel"->municipios.addAll(listOf("Carolina","Chapeltique","Chinameca","Chirilagua","Ciudad Barrios","Comacarán","El Tránsito","Lolotique",
                        "Moncagua","Nueva Guadalupe","Nuevo Edén de San Juan","Quelepa","San Antonio del Mosco","San Gerardo","San Jorge",
                        "San Luis de la Reina","San Miguel","San Rafael Oriente","Sesori","Uluazapa"))
                    "Morazan"->municipios.addAll(listOf("Arambala","Cacaopera","Chilanga","Corinto","Delicias de Concepción","El Divisadero","El Rosario","Gualococti",
                        "Guatajiagua","Joateca","Jocoaitique","Jocoro","Lolotiquillo","Meanguera","Osicala","Perquín","San Carlos","San Fernando",
                        "San Francisco Gotera","San Isidro","San Simón","Sensembra","Sociedad","Torola","Yamabal","Yoloaiquín"))
                    "La Unión"->municipios.addAll(listOf("Anamorós","Bolívar","Concepción de Oriente","Conchagua","El Carmen","El Sauce","Intipucá","La Unión","Lilisque",
                        "Meanguera del Golfo","Nueva Esparta","Pasaquina","Polorós","San Alejo","San José","Santa Rosa de Lima","Yayantique","Yucuaiquín"))
                }
                return municipios
            }
            espDepartamento?.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
                override fun onNothingSelected(parent: AdapterView<*>?) {}

                override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                    //Codigo para cargar el otro spinner
                    var depart:String=espDepartamento.selectedItem.toString()
                    val adaptadorMuni = ArrayAdapter(applicationContext, android.R.layout.simple_spinner_item, getMunicipios(depart))
                    espMunicipio.adapter=adaptadorMuni
                }
            }

            fun limpiar(){
                etNombre.setText(" ")
                etApellido.setText(" ")
                espDepartamento.setSelection(0)
                espMunicipio.setSelection(0)
                rbFemale.isSelected=true
                rbMale.isSelected=true
                etTelefono.setText(" ").toString()

            }

            var information= arrayListOf<Array<String>>()
            btGuardar.setOnClickListener(View.OnClickListener {
                var nombre=etNombre.text.toString()
                var apellido=etApellido.text.toString()
                var dept=espDepartamento.selectedItem.toString()
                var munic=espMunicipio.selectedItem.toString()
                var genero=""
                if(rbMale.isChecked){
                    genero="Masculino"
                }else if(rbFemale.isChecked){
                    genero="Femenino"
                }
                var telef=etTelefono.text.toString()

                information.addAll(listOf(arrayOf(nombre,apellido,dept,munic,genero,telef)))
                tvMostrar.setText("")
                for(i in 0..information.size-1){
                    tvMostrar.append("Informacion: "+information[i].get(0).toString()+
                            " "+information[i].get(1).toString()+
                            " "+ information[i].get(3).toString()+
                            " "+information[i].get(2).toString()+
                            " "+information[i].get(4).toString()+
                            " "+ information[i].get(5).toString()+
                            System.getProperty("line.separator"))
                }
                limpiar()

            })
    }

}