package ut.com.samvscode.themify;

import org.junit.Test;
import com.samvscode.themify.api.MyPluginComponent;
import com.samvscode.themify.impl.MyPluginComponentImpl;

import static org.junit.Assert.assertEquals;

public class MyComponentUnitTest {
    @Test
    public void testMyName() {
        MyPluginComponent component = new MyPluginComponentImpl(null);
        assertEquals("names do not match!", "myComponent", component.getName());
    }
}