/**
  * Created by Administrator on 05/06/2017.
  */
object Main extends App {
  def createString(stringed: String, style: String, loop: Int): String = {
    if(stringed.charAt(0) != '-'){
      if(stringed.length > 3){
        val substringed = stringed.substring(stringed.length-3, stringed.length)
        val toPrint = createString(stringed.substring(0, stringed.length-3), style, loop +1) + " " + returnScale(loop, substringed, style)
        toPrint
      }else{
        val toPrint = returnScale(loop, stringed, style)
        toPrint
      }
    }else{
      "Negative"
    }
  }
//
  def returnScale(index: Int, message: String, scaleType: String): String = {
    val list = List("", "Thousand", "Million", "Billion", "Trillion", "Quadrillion", "Quintillion", "Sextillion",
      "", "Thousand", "Million", "Milliard", "Billion", "Billiard", "Trillion", "Trilliard")
    if(scaleType == "long"){
      message + " " + list(index +8)
    }else{
      message + " " + list(index)
    }
  }
}




