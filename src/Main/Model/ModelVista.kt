package Main.Model

import Core.Interfaces.IUser
import Core.Interfaces.IVista

class ModelVista(override var usuario: IUser = ModelUser.getInstance()) : IVista {
    companion object {
        @Volatile
        private var INSTANCE: ModelVista?= null
        fun getInstance() =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: ModelVista()
            }
    }


    override fun MostrarMensaje() {
        println("Hello World!")
    }
}