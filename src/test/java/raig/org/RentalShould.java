package raig.org;


import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Test;

public class RentalShould {

  @Test
  public void constructorShouldInitializeDaysRented() {
    Movie movie = new Movie("title1",Movie.CHILDREN);
    Rental rental = new Rental(movie,2);
    assertThat(rental.getDaysRented(),is(2));
    assertThat(rental.getMovie().getTitle(),is("title1"));
  }

}
