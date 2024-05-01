package ut.com.samvscode.themify;

import org.junit.Test;
import com.samvscode.themify.api.ThemifyComponent;
import com.samvscode.themify.impl.ThemifyComponentImpl;

import static org.junit.Assert.assertEquals;

public class ThemifyComponentUnitTest {
    @Test
    public void testMyName() {
        ThemifyComponent component = new ThemifyComponentImpl(null);
        assertEquals("names do not match!", "themifyComponent", component.getName());
    }
}