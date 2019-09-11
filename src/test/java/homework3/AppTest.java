/*
 * This Java source file was generated by the Gradle 'init' task.аа
 */
package homework3;
import org.junit.Assert;
import org.junit.Test;
import java.util.Arrays;

public class AppTest {

    int[] input = new int[]{1, 2, 3, 4, 5, 3, 2, 5, 7, 9, 0, 2, 3, 4, 1};
    int[] output = new int[]{2, 4, 2, 0, 2, 4, 1, 3, 5, 3, 5, 7, 9, 3, 1};

    int OUTPUTSUM = 51;
    ArrTransformFromEvenToOddByArrs objectOfAnotherClass = new ArrTransformFromEvenToOddByArrs();
    SumElemsOfArr objectOfAnotherClassToSum = new SumElemsOfArr();

    @Test
    public void transformTest() {
        Assert.assertEquals(Arrays.toString(objectOfAnotherClass.transformOfAray(input)), Arrays.toString(output));
    }

    @Test
    public void SumTest() {
        Assert.assertEquals(objectOfAnotherClassToSum.sum(input), OUTPUTSUM);
    }
}
