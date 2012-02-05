package books

class BooksController {
    def scaffold = true
    
    def booksService
    
    def index() { redirect (action:random)}
    
    def random = {
        def randomBooks = booksService.getRandomBooks()
        
        [ books: randomBooks]
    }
    
    def ajaxRandom = {
        def randomBooks = booksService.getRandomBooks()
        render "<w>Title: ${randomBooks.title}</w>" + 
        "<p> Author: ${randomBooks.author}</p>"+ 
        "<p>Description: ${randomBooks.description}</p>"+ 
        "<p>ISBN: ${randomBooks.ISBN}</p>"+ 
        "<p>Minimum Grade level (0-6): ${randomBooks.minimumGradeLevel}</p>"+ 
        "<p>Maximum Grade level (0-6): ${randomBooks.maximumGradeLevel}</p>"+ 
        "<p>Language: ${randomBooks.language}</p>"+ 
        "<p>Category: ${randomBooks.category}</p>"
    }
}
