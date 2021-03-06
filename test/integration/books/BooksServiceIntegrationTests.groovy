package books

import grails.test.*
import books.*
import org.junit.*
import static.org.junit.Assert.*

class BooksServiceIntegrationTests extends GrailsUnitTestCase{
    
    def booksService
    @Test
    void testStaticBooks() {
        
		def staticBooks = booksService.getStaticBooks()
		
		assertEquals("Eric Carle", staticBooks.author)
                assertEquals("The Hungry Caterpillar", staticBooks.title)
    }
    @Test
    void tryAnotherTest(){
        
        def testBook = booksService.getRandomBooks()
        assertTrue testBook != null
        
    }
    @Test
    void tryAThirdTest(){
        def book = new Books(title: "testTitle", author: "testAuthor", description: "testDescription", ISBN: "900-123456789", minimumGradeLevel: "testMin", maximumGradeLevel: "testMax",language: "English",category: "Reading Skills")
        book.save()
        assertEquals 1, Books.list().size()
    }
  
}
