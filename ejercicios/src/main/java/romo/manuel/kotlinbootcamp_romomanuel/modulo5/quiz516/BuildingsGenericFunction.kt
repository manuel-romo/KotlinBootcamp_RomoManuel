package romo.manuel.kotlinbootcamp_romomanuel.modulo5.quiz516

fun main(args: Array<String>) {
    isSmallBuilding(Building(Wood()))
    isSmallBuilding(Building(Brick()))
}

open class BaseBuildingMaterial(){
    open val numberNeeded : Int = 1
}

class Wood() : BaseBuildingMaterial(){
    override val numberNeeded : Int = 4
}

class Brick() : BaseBuildingMaterial(){
    override val numberNeeded : Int = 8
}

class Building<out T : BaseBuildingMaterial>(val buildingMaterial : T){

    val baseMaterialsNeeded : Int = 100
    val actualMaterialsNeeded = buildingMaterial.numberNeeded * baseMaterialsNeeded

    fun build() {
        println(" $actualMaterialsNeeded ${buildingMaterial::class.simpleName} required")
    }

}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>){

    if (building.actualMaterialsNeeded < 500) println("small building") else println("large building")

}