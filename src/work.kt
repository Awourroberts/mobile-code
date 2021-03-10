fun main(){
 compus("akirachix")
    intro("sophy",32)
    s()
    statement("Sophy")
    statement("Lucy")
}

fun compus(name:String){
    val x=name
    print(x[0])
    print(x[2])
    println(x[3])

}
fun intro(name:String,age:Int){
    val sentence="Hi,my name is $name and i am $age year old"
    println(sentence)
}
fun s(){
    var me="Sophy"
    println(me.length)

}

fun statement(name2:String){
    if (name2=="Sophy"){
        println("That is me")
    }   else{
        println("I don't know who that is")

    }
}



