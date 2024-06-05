import static org.assertj.core.api.Assertions.*;
public class CalculatorTest {
    public static void main(String[] args) {
        // Test for calculation method
        assertThat(Calculator.calculation(2, 6, '+')).isEqualTo(8);
        assertThat(Calculator.calculation(2, 2, '-')).isEqualTo(0);
        assertThat(Calculator.calculation(2, 7, '*')).isEqualTo(14);
        assertThat(Calculator.calculation(100, 50, '/')).isEqualTo(2);

        assertThatThrownBy(() -> Calculator.calculation(8,4,'_'))
                .isInstanceOf(IllegalStateException.class);


        // Test for calculateDiscount method
        assertThat(Calculator.calculateDiscount(1000, 10)).isEqualTo(900);
        assertThat(Calculator.calculateDiscount(200, 25)).isEqualTo(150);
        assertThat(Calculator.calculateDiscount(100, 0)).isEqualTo(100);
        assertThat(Calculator.calculateDiscount(100, 100)).isEqualTo(0);

        assertThatThrownBy(() -> Calculator.calculateDiscount(-100, 10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid discount arguments");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, -10))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid discount arguments");

        assertThatThrownBy(() -> Calculator.calculateDiscount(100, 110))
                .isInstanceOf(ArithmeticException.class)
                .hasMessage("Invalid discount arguments");
    }
}