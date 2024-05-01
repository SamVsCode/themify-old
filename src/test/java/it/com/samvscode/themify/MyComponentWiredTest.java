package it.com.samvscode.themify;

import org.junit.Test;
import org.junit.runner.RunWith;
import com.atlassian.plugins.osgi.test.AtlassianPluginsTestRunner;
import com.samvscode.themify.api.ThemifyComponent;
import com.atlassian.sal.api.ApplicationProperties;

import static org.junit.Assert.assertEquals;

@RunWith(AtlassianPluginsTestRunner.class)
public class MyComponentWiredTest {
    private final ApplicationProperties applicationProperties;
    private final ThemifyComponent themifyComponent;

    public MyComponentWiredTest(ApplicationProperties applicationProperties, ThemifyComponent themifyComponent) {
        this.applicationProperties = applicationProperties;
        this.themifyComponent = themifyComponent;
    }

    @Test
    public void testMyName() {
        assertEquals("names do not match!", "myComponent:" + applicationProperties.getDisplayName(), themifyComponent.getName());
    }
}