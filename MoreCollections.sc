object MoreCollections {
  println("More Collections:  http://twitter.github.io/scala_school/coll2.html")
                                                  //> More Collections:  http://twitter.github.io/scala_school/coll2.html

  List(1, 2, 3)                                   //> res0: List[Int] = List(1, 2, 3)
  1 :: 2 :: 3 :: Nil                              //> res1: List[Int] = List(1, 2, 3)

  val oneTwoSet = Set(1, 2, 1, 2)                 //> oneTwoSet  : scala.collection.immutable.Set[Int] = Set(1, 2)
  Seq(1, 2, 1, 2)                                 //> res2: Seq[Int] = List(1, 2, 1, 2)

  val letterToInt = Map('a' -> 1, 'b' -> 2)       //> letterToInt  : scala.collection.immutable.Map[Char,Int] = Map(a -> 1, b -> 2
                                                  //| )
  letterToInt.toArray                             //> res3: Array[(Char, Int)] = Array((a,1), (b,2))

  oneTwoSet + 3                                   //> res4: scala.collection.immutable.Set[Int] = Set(1, 2, 3)

  val map = Map("a" -> 1, "b" -> 2, ("c", 3))     //> map  : scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c ->
                                                  //|  3)
  "d" -> 4                                        //> res5: (String, Int) = (d,4)
  ("e", 5)                                        //> res6: (String, Int) = (e,5)
  Map.empty ++ List(("a", 1), ("b", 2), ("c", 3)) //> res7: scala.collection.immutable.Map[String,Int] = Map(a -> 1, b -> 2, c -> 
                                                  //| 3)
  for (i <- 1 to 3) { println(i) }                //> 1
                                                  //| 2
                                                  //| 3
  val r1 = 0 until 10                             //> r1  : scala.collection.immutable.Range = Range(0, 1, 2, 3, 4, 5, 6, 7, 8, 9)
                                                  //| 
  val r2 = r1.start until r1.end by r1.step + 1   //> r2  : scala.collection.immutable.Range = Range(0, 2, 4, 6, 8)

  val r3 = -1 to 1                                //> r3  : scala.collection.immutable.Range.Inclusive = Range(-1, 0, 1)

  for (j <- r3) { println(j) }                    //> -1
                                                  //| 0
                                                  //| 1
  r1.map { i => i }                               //> res8: scala.collection.immutable.IndexedSeq[Int] = Vector(0, 1, 2, 3, 4, 5, 
                                                  //| 6, 7, 8, 9)
  Iterable(1, 2)                                  //> res9: Iterable[Int] = List(1, 2)
  Set(3, 4)                                       //> res10: scala.collection.immutable.Set[Int] = Set(3, 4)
  val numbers = collection.mutable.Map(1 -> 2)    //> numbers  : scala.collection.mutable.Map[Int,Int] = Map(1 -> 2)
  numbers.get(1)                                  //> res11: Option[Int] = Some(2)
  numbers.getOrElseUpdate(2, 3)                   //> res12: Int = 3
  numbers                                         //> res13: scala.collection.mutable.Map[Int,Int] = Map(2 -> 3, 1 -> 2)
  // Note how 2nd does not put 2 -> 4 into the Map
  numbers.getOrElseUpdate(2, 4)                   //> res14: Int = 3
  numbers                                         //> res15: scala.collection.mutable.Map[Int,Int] = Map(2 -> 3, 1 -> 2)
  
  
}