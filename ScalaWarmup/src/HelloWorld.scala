

object HelloWorld {

  def func2 {
    println("Hola");
    Thread.sleep(5000);
    println("Adios");
  }
  def func3 {
    println("Adios");
    println("Hola");
  }
  
  def anotherFunction(funcParam: Unit ) {
    println("Saludos");
    funcParam;
  }

}

case class Person(name: String, var age: Int, address: String) {
  override def toString = {
    "Name: " + name + " Age: " + age + " Address: " + address;
  }
  def func {
    println("Hola");
  }
}