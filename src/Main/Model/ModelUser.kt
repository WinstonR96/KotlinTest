package Main.Model

import Core.Interfaces.IUser
import Core.Reactor
import Entity.Usuario

class ModelUser : IUser {
    override var user: Usuario?= Usuario("Yureisy",23)


    override fun Edad() {
        println("Tengo tantos años: "+ this.user!!.nombre)
    }

    companion object {
        @Volatile
        private var INSTANCE: ModelUser?= null
        fun getInstance() =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: ModelUser()
            }
    }
}