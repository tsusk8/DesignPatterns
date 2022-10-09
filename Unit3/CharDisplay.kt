open class CharDisplay(var ch: Char) : AbstractDisplay() {
    override fun open(){
        print("<<")
    }
    override fun print(){
        print(ch)
    }
    override fun close(){
        print(">>")
    }
}