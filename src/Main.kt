import days.Day01
import days.Day02
import days.Day03
import days.Day04

fun main() {

    val days = listOf(Day01(), Day02(), Day03(), Day04())
    days.forEach { day -> day.exec() }

}