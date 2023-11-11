package builderpattern.builder

import builderpattern.PattyType

class Burger {
    var pattyCount = 0
    lateinit var pattyType : PattyType
    var salad = false
    var tomato = false
}
