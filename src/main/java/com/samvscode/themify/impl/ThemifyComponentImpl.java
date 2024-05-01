package com.samvscode.themify.impl;

import com.atlassian.sal.api.ApplicationProperties;
import com.samvscode.themify.api.ThemifyComponent;


public class ThemifyComponentImpl implements ThemifyComponent
{
        private final ApplicationProperties applicationProperties;

    
    public ThemifyComponentImpl(final ApplicationProperties applicationProperties) {
        this.applicationProperties = applicationProperties;
        
    }

    public String getName() {
        if (null != applicationProperties) {
            return "themifyComponent:" + applicationProperties.getDisplayName();
        }

        return "themifyComponent";
    }
}