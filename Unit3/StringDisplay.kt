open class StringDisplay(var string: String) : AbstractDisplay() {
    private var width : Int = string.length
    
    override fun open(){
        printLine()
    }
    override fun print(){
        println("|" + string + "|")
    }
    override fun close(){
        printLine()
    }
    private fun printLine(){
        print("+")
        for (i in 0 until width) {
            print("-")
        }
        println("+")
    }
}