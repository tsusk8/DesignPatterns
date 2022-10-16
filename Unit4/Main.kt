fun main() {    
    var factory:Factory = IDCardFactory()
    var card1:Product = factory.create("Hiroshi Yuki")
    card1.use()
}