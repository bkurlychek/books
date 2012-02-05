package books

import grails.test.*
import books.*
import org.junit.*

class BooksServiceIntegrationTests extends GrailsUnitTestCase{
    
    def booksService
    
    void testStaticBooks() {
        
		def staticBooks = booksService.getStaticBooks()
		
		assertEquals("Eric Carle", staticBooks.author)
                assertEquals("The Hungry Caterpillar", staticBooks.title)
	}
  
}
