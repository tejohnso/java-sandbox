package tejohnso;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

public class AppTest {
  @Test
  public void addTest() {
    assertThat(App.add(1, 1), is(2));
  }
}
