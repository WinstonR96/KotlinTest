package Core

import Core.Interfaces.IVista

class Entorno {



    lateinit var Vista : IVista

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