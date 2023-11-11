package state

interface Mario {
    val game : Game
    fun canHighJump(): Boolean
    fun canFloat(): Boolean
    fun canShootFireBall(): Boolean
    fun isSuper(): Boolean
    fun eatPowerUp(p: PowerUp)
    fun getIdentity()
}