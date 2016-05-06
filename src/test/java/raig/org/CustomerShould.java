package raig.org;

import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;




public class CustomerShould {

  Customer customer;

  @Before
  public void setUp() {
    customer = new Customer("Oscar");
  }

  @Test
  public void whenChildrenMovieIsRentedOneDayAmountIs1_5() {

    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,1);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 1.5"));
  }

  @Test
  public void whenRegularMovieIsRentedOneDayAmountIs2() {

    Movie movie = new Movie("regular",Movie.REGULAR);
    Rental rental = new Rental(movie,1);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 2.0"));
  }

  @Test
  public void whenRegularMovieIsRentedTwoDaysAmountIs2() {

    Movie movie = new Movie("regular",Movie.REGULAR);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 2.0"));
  }

  @Test
  public void whenRegularMovieIsRentedMoreThanTwoDaysExtraMoneyIsPayed() {

    Movie movie = new Movie("regular",Movie.REGULAR);
    Rental rental = new Rental(movie,4);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 5.0"));
  }



  @Test
  public void whenChildrenMovieIsRentedTwoDaysAmountIs1_5() {

    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 1.5"));
  }

  @Test
  public void whenChildrenMovieIsRentedMoreThanThreeDaysExtraMoneyIsPayed() {

    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,5);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 4.5"));
  }


  @Test
  public void whenChildrenMovieIsRentedTwiceOneDayAmountIs3() {


    Movie movieOne = new Movie("children one ",Movie.CHILDREN);
    Rental rentalOne = new Rental(movieOne,1);
    customer.addRental(rentalOne);

    Movie movieTwo = new Movie("children two",Movie.CHILDREN);
    Rental rentalTwo = new Rental(movieTwo,1);
    customer.addRental(rentalTwo);

    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 3.0"));
  }


  @Test
  public void whenNewReleaseMovieIsRentedYouPayForEachDayRented() {

    Movie movie = new Movie("new release",Movie.NEW_RELEASE);
    Rental rental = new Rental(movie,4);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("Amount owed is 12.0"));
  }


  @Test
    public void whenChildrenMovieIsRentedOneDayShouldGetOneFrequentPoint() {
    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,1);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("1 frequent"));
  }

  @Test
  public void whenChildrenMovieIsRentedTwoDaysShouldGetOneFrequentPoint() {
    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("1 frequent"));
  }

  @Test
  public void whenChildrenMovieIsRentedTwiceOneDayShouldGetTwoFrequentPoint() {
    Movie movie = new Movie("children",Movie.CHILDREN);
    Rental rental = new Rental(movie,1);
    Rental rentalTwo = new Rental(movie,1);
    customer.addRental(rental);
    customer.addRental(rentalTwo);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("2 frequent"));
  }

  @Test
  public void whenNewReleaseMovieIsRentedOneDayShouldGetOneFrequentPoint() {
    Movie movie = new Movie("new release",Movie.NEW_RELEASE);
    Rental rental = new Rental(movie,1);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("1 frequent"));
  }

  @Test
  public void whenNewReleaseMovieIsRentedMoreThanOneDayShouldGetTwoFrequentPoint() {
    Movie movie = new Movie("new release",Movie.NEW_RELEASE);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("2 frequent"));
  }

  @Test
  public void whenRegularMovieIsRentedTwoDaysShouldGetOneFrequentPoint() {
    Movie movie = new Movie("regular",Movie.REGULAR);
    Rental rental = new Rental(movie,2);
    customer.addRental(rental);
    String result = customer.statement();
    System.out.print(result);
    assertTrue(result.contains("1 frequent"));
  }



}
