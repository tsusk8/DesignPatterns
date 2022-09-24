fun main() {    
    val bookShelf : BookShelf = BookShelf(4)
    bookShelf.appendBook(Book("Around the World in 80 Days"))
    bookShelf.appendBook(Book("Bible"))
    bookShelf.appendBook(Book("Cinderella"))
    bookShelf.appendBook(Book("Daddy-Long-Legs"))

    val iterator : Iterator = bookShelf.iterator()
    while (iterator.hasNext()) {
        val book : Book = iterator.next()
        println(book.name)
    }
}