abstract class Factory(){
    fun create(owner: String) : Product{
        var p = createProduct(owner)
        registerProduct(p)
        return p
    }
    abstract fun createProduct(owner: String): Product
    abstract fun registerProduct(product: Product)
}