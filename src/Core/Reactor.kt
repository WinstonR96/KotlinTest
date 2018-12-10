package Core

class Reactor {

    constructor()

    companion object {
        @Volatile
        private var INSTANCE: Reactor?= null
        fun getInstance() =
            INSTANCE ?: synchronized(this){
                INSTANCE ?: Reactor()
            }
    }
}