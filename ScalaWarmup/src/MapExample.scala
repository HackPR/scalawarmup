
import scala.collection.immutable.HashMap

object MapExample {

  def example {
    val map = new HashMap[String,String]();
    val map2 = Map( ("Alice", 10), ("Bob", 3));
    val map3 = HashMap( "Alice" -> 10, "Bob" -> 3);
    
    val map4 = map + "Freddy" -> 12;
    println(map.equals(map4));
    val map5 = new collection.immutable.HashMap[String,String]();
    val map6 = map + "Freddy" -> 12;
    println(map5.equals(map6));
    println(map2("Alice"))
    println(map2.mkString("\n"));

  }
}