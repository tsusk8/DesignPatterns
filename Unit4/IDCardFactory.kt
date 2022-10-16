open class IDCardFactory() : Factory(){
    override fun createProduct(owner: String): IDCard{
        return IDCard(owner)
    }
    override fun registerProduct(product: Product){
        product as IDCard
        println(product.getOwner() + "を登録しました。")
    }
}