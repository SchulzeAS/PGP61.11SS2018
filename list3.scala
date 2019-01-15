
object list3 {

  //returns list with tuples of name and hash of the name
  def hashAndZip(nameList: List[String]): List[(String, String)] = nameList.map(x => (x,x.hashCode.toHexString))

  def main(args: Array[String]) {
    // beliebteste Vornamen des Jahres 1904
    val names: List[String] = List("Gertrud", "Wilhelm", "Anna", "Walter", "Erna", "Hans", "Martha", "Carl", "Elisabeth", "Hermann")
    val zippedList = hashAndZip(names)
    println(zippedList)
    //List((Gertrud,6c541ac8), (Wilhelm,42e223f0), (Anna,816e1189), (Walter,8092c0d4), (Erna,1b30dcca), (Hans,4836876), (Martha,a309fe16), (Carl,b8fdbfdf), (Elisabeth,158bac6d), (Hermann,e08e4d99))
  }
}
