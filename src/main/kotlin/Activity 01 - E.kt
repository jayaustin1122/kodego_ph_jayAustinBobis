fun main(){
    // Array fixed size, changeable elements
    var names1  = arrayOf<String>("john","Paul","Toledo","Cardo","Dalisay")
    // Arraylist - flexible, not fixed size, changeable components
    var names2 = arrayListOf<String>("john","Paul","Toledo","Cardo","Dalisay")
    /* set - unique values, no duplicates
       setOF() -> readonly -> fixed size, elements no changeable*/
    var names3 = setOf<String>("john","Paul","Toledo","Cardo","Dalisay")


    //change value, get value by index and get()
    names1.set(0,"Jeremiah")
    names1[1] = "Christian"
    names1.get(0)
    // add value,remove,set value
    names2.add("Pogi")
    names2.remove(names2[0])
    names2.remove("paul")
    names2.set(4,"Jack")

    names3.contains("john")
    names3.drop(3)


}