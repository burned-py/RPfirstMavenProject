import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {


    @Test
        //3 - fizz
    void whenDividableBy3AndNotBy5_ThenReturnFizz() {
        //GIVEN
        int i = 12;

        //WHEN
        String say = Fizzbuzz.fizzBuzz(i);

        //THEN
        assertEquals("fizz", say);
    }

    @Test
        //5 - buzz
    void whenDividableBy5AndNotBy3_ThenReturnBuzz() {
        //GIVEN
        int i = 10;

        //WHEN
        String say = Fizzbuzz.fizzBuzz(i);

        //THEN
        assertEquals("buzz", say);

    }

    @Test
        //3 & 5 - fizzbuzz
    void whenDividableBy3And5_ThenReturnFizzbuzz() {
        //GIVEN
        int i = 15;

        //WHEN
        String say = Fizzbuzz.fizzBuzz(i);

        //THEN
        assertEquals("fizzbuzz", say);

    }
    @Test
        // weder noch - i string
    void whenDividableBy3And5_ThenReturnNumberString() {
        //GIVEN
        int i = 4;

        //WHEN
        String say = Fizzbuzz.fizzBuzz(i);

        //THEN
        assertEquals(Integer.toString(i), say);
        // oder "4" hard coden

    }

}
