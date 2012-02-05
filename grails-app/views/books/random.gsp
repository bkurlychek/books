

<html>
  <head>
     <g:javascript library="jquery" plugin="jquery"/>
	<r:require module="jquery"/>
     <r:layoutResources />
  </head>
  
  <body>
    <ul id="menu">
<li>
<g:remoteLink action="ajaxRandom" update="books">
Next Book
</g:remoteLink>
</li>
<li>
<g:link action="list">
Admin
</g:link>
</li>
</ul>
    
    
    
    <div id="books">
    <w>Title: ${books.title}</w>
    
   
    <p>Author: ${books.author}</p>
    <p>Description: ${books.description}</p>
    <p>ISBN: ${books.ISBN}</p>
    <p>Minimum Grade level (0-6): ${books.minimumGradeLevel}</p>
    <p>Maximum Grade level (0-6): ${books.maximumGradeLevel}</p>
    <p>Language: ${books.language}</p>
    <p>Category: ${books.category}</p>
    
    </div>
    
    
  </body>
</html>

