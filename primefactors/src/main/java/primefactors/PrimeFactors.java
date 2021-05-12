package primefactors;

import java.util.ArrayList;
import java.util.List;

public class PrimeFactors {

  public List<Integer> of(int number) {
    List<Integer> primeFactors = new ArrayList<Integer>();
    int factor = 2;
    while (number>1) {
      if(number%factor ==0) {
        primeFactors.add(factor);
        number = number/factor;
      } else {
        factor ++;
      }
    }
    return primeFactors;
  }

}
