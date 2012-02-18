package books

class Books {
    //comments about things go here for test purposes
    String Title
    String Author
    String Description
    String ISBN
    int MinimumGradeLevel
    int MaximumGradeLevel
    String Language
    String Category
    

    static constraints = {
        title(blank:false)
        author(blank:false)
        description(maxSize:1000)
        ISBN(blank:false, unique: true, matches:("\\d{3}-\\d{10}"))
        minimumGradeLevel(inList:[0,1,2,3,4,5,6])
        maximumGradeLevel(inList:[0,1,2,3,4,5,6])
        language(inList: ["English", "German", "French","Spanish"])
        category inList:["General Leisure Reading","Reading skills","Math skills","Health","Science"]
        
    }
}
