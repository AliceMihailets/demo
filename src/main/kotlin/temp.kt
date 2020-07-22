fun main() {
    print("Введите город: ")
    var city = readLine()
    print("В городе $city сейчас снова жарко\n")
    print("Теперь введите температуру в формате 0.0: ")
    var temp = readLine()
    var condition = ""
    if (temp != null) {
        when(temp.toDouble()) {
            in -50.0..15.0 -> condition = "холодно"
            in 15.1..25.0 -> condition = "нормально"
            in 25.1..50.0 -> condition = "жарко"
            else -> condition = "КАТАСТРОФА"
        }
        print("А теперь в городе $city $condition")
    }
}