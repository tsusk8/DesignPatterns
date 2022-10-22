fun main() {    
    var singleton1: Singleton = Singleton
    var singleton2: Singleton = Singleton
    if (singleton1 == singleton2) {
        println("同じです")
    } else {
        println("違います")
    }
}