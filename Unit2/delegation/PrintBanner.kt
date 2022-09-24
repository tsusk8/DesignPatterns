class PrintBanner(private var string : String) : Print() {
    private val banner : Banner = Banner(string)
    
    override fun printWeak() {
        banner.showWithParen()
    }
    override fun printStrong() {
        banner.showWithAster()
    }
}