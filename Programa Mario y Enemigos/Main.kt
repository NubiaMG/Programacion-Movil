//esta es la main class


import Clases.Goomba
import Clases.Koopa
import Clases.Mario

fun main(){
        var mario = Mario()
        
        mario.collision("star")
        /*val enemy = Enemy("Un enemigo",2)
        enemy.collision("Enemy")
        enemy.collision("Weapon")*/
        val enemy = Goomba()
        enemy.collision("Enemy")
        enemy.collision("Weapon")
        val koopa = Koopa()
        koopa.collision("Weapon")
}

