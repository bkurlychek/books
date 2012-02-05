package books

class BooksService {
    boolean transactional = false
    
    def getStaticBooks() {
        return new Books (author: "Eric Carle", 
            title: "The Hungry Caterpillar",
        )
    }
    
    def getRandomBooks(){
        def allBooks = Books.list()
        def randomBooks = null
        if(allBooks.size() > 0){
            def randomIdx = new Random().nextInt(allBooks.size())
            randomBooks = allBooks[randomIdx]
        }else{
            randomBooks = getStaticBooks()
        }
        return randomBooks
    }
}
