import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.CsvSource
import kotlin.test.assertEquals

internal class MainTest {

    @ParameterizedTest
    @CsvSource("0,1,1","2,2,4")
    fun addTest(a:Int, b:Int, expected:Int) {
        assertEquals(add(a,b), expected)
    }
}