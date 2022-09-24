class Banner(private var string: String){    
    fun showWithParen() {
        println("(" + this.string + ")");
    }
    fun showWithAster() {
        println("*" + this.string + "*");
    }
}