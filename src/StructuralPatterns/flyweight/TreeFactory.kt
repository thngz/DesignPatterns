package flyweight

class TreeFactory {
    private val treeTypes = HashSet<TreeType>()

    fun getTreeType(name: String, color: String, texture: String): TreeType {
        val type = treeTypes.find { it.name == name && it.color == color && it.texture == texture }
        return (type ?: run {
            val newType = TreeType(name, color, texture)
            treeTypes.add(newType)
            return newType
        })
    }
}