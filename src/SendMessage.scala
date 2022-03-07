object SendMessage {
  def main(args:Array[String]):Unit = {
    if (args.length > 0){
      println("Hello." + args(0))
    }
    else{
      println("Hello, World")
    }
    import java.util.Calendar
    println("Current time is: "+Calendar.getInstance().getTime())
  }
}