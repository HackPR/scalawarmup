

import scala.collection.mutable.ListBuffer

object ListExample {

	def example {
		val list =  List(3,4,5,6);
		val list2 = new ListBuffer[Int]();
		list2 += (3,4,5,6);
		//list.addAll(new int[]{3,4,5,6});
		val list3 = new ListBuffer[Int]();
		list3 ++= 3 to 6 toList;
		val list4 = 3 to 6 toList;
		println(list);
		list.foreach(x => println(x));
		//    for(int x: list) {
		//      println(x);
		//    }
		println(list.forall(x => x < 5));
		//    boolean bool = true;
		//    for(int x: list) {
		//      bool &= (x < 5);
		//    }
		println(list.forall(x => x > 0));

		println(list.filter(x => x % 2 == 0))
		//    List<Integer> newList = new ArrayList<Integer>();
		//    for(int x: list) {
		//      if(x %2 == 0)
		//			newList.add(x);
		//    }
		println(list );
		val (front, back) = list.splitAt(2);

	}
}