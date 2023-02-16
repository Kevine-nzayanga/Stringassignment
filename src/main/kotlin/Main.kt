fun main() {
schlname("akirachix")
var n=introduction("Micah",20)
    println(n)
    println(title("Best"))
word("James")

}
fun schlname (name:String){
    val orgname = "akirachix"
println(orgname[0]+ ""+ orgname[2]+ orgname[3])

}
fun introduction (name:String, age:Int): String{

    var sentence= ("Hi my name is $name and I am $age years old")
    return sentence


}
fun title(heading:String):String {
    return ("The length of the heading string is:"+heading.length)

}
fun word (called:String){
    var firstname = "James"
    if(called==firstname){
       println("That`s me!")
    }
    else { println("I don`t know who that is")

    }

}