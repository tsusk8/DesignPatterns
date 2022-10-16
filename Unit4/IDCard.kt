open class IDCard(var string: String) : Product(){
    private var owner:String = string
    
    init{
        println(owner + "のカードを作ります。")
    }
    
    override fun use(){
        println(toString() + "のカードを作ります。")
    }
    
    override fun toString(): String {
        return "[IDCard:" + owner + "]"
    }
    
    fun getOwner(): String {
         return owner
    }
}