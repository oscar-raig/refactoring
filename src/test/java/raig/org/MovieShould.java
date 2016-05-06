package raig.org;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


import org.junit.Test;


public class MovieShould {
  @Test
  public void constructorShouldInitializeNameAndPrice() {
    Movie movie = new Movie("title1",Movie.CHILDREN);

    assertThat(movie.getTitle(),is("title1"));
    assertThat(movie.getPriceCode(),is(Movie.CHILDREN));
  }

}
