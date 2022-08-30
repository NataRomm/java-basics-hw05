import java.util.List;

public class Zoo {


  public static void feed(List <Bird> list) {

    System.out.println("Feeding birds");
    for (int i = 0; i< list.size(); i++) {
      list.get(i).eat();
    }

  }


  public static void acceptBird(FlyingBird<? super Bird> bird, List list) {


    if (bird.isFlying())
    {
      list.add(bird);
      System.out.println("Accepting " + bird + " to the list!");


    }

  }


  public static void registerBird(List list, Bird newBird) {

    System.out.println("Adding a bird to the birds list");

    list.add(newBird);

      System.out.println(list);
  }
}