package Core

import Core.Interfaces.IVista
import Main.Model.ModelVista

class Entorno {
    var Vista : IVista? = ModelVista.getInstance()

    constructor()

    companion object {
        @Volatile
        private var INSTANCE: Entorno?= null
        fun getInstance() =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: Entorno()
            }
    }

}