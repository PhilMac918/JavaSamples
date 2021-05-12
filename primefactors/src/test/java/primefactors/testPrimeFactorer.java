package primefactors;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.Test;

public class testPrimeFactorer {
  private PrimeFactors primeFactorer= new PrimeFactors();

  @Test
  public void of_WhenOneIsPassed_ReturnsEmptyList() {
    primeFactorer.of(1);
  }

  @Test
  public void of_WhenTwoIsPassed_ReturnsNumberTwo() {
    assertThat(primeFactorer.of(2)).containsExactly(2);
  }

  @Test
  public void of_WhenThreeIsPassed_ReturnsNumberThree() {
    assertThat(primeFactorer.of(3)).containsExactly(3);
  }

  @Test
  public void of_WhenFourIsPassed_ReturnsTwoAndTwo() {
    List<Integer> expectedFactors = Arrays.asList(2,2);
    assertThat(primeFactorer.of(4)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenFiveIsPassed_ReturnsFIve() {
    List<Integer> expectedFactors = Arrays.asList(5);
    assertThat(primeFactorer.of(5)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenSixIsPassed_ReturnsTwoThree() {
    List<Integer> expectedFactors = Arrays.asList(2,3);
    assertThat(primeFactorer.of(6)).containsExactlyElementsOf(expectedFactors);
  }
  @Test
  public void of_WhenSevenIsPassed_ReturnsSeven() {
    List<Integer> expectedFactors = Arrays.asList(7);
    assertThat(primeFactorer.of(7)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenEightIsPassed_ReturnsTwoTwoTwo() {
    List<Integer> expectedFactors = Arrays.asList(2,2,2);
    assertThat(primeFactorer.of(8)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenNineIsPassed_ReturnsThreeThree() {
    List<Integer> expectedFactors = Arrays.asList(3,3);
    assertThat(primeFactorer.of(9)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenTenIsPassed_ReturnsTwoFive() {
    List<Integer> expectedFactors = Arrays.asList(2,5);
    assertThat(primeFactorer.of(10)).containsExactlyElementsOf(expectedFactors);
  }

  @Test
  public void of_WhenMaxIsPassed_ReturnsMax() {
    List<Integer> expectedFactors = Arrays.asList(2,3,3,7,11, 31, 151, 331);
    assertThat(primeFactorer.of(Integer.MAX_VALUE-1)).containsExactlyElementsOf(expectedFactors);
  }

}
