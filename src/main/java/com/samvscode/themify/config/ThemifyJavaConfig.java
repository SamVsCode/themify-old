package com.samvscode.themify.config;

import com.samvscode.themify.api.ThemifyComponent;
import com.samvscode.themify.impl.ThemifyComponentImpl;
import com.atlassian.plugins.osgi.javaconfig.configs.beans.ModuleFactoryBean;
import com.atlassian.plugins.osgi.javaconfig.configs.beans.PluginAccessorBean;
import com.atlassian.sal.api.ApplicationProperties;
import com.atlassian.templaterenderer.TemplateRenderer;

import org.osgi.framework.ServiceRegistration;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import static com.atlassian.plugins.osgi.javaconfig.OsgiServices.exportOsgiService;
import static com.atlassian.plugins.osgi.javaconfig.OsgiServices.importOsgiService;

@Configuration
@Import({
        ModuleFactoryBean.class,
        PluginAccessorBean.class
})
public class ThemifyJavaConfig {


    // imports ApplicationProperties from OSGi
    @Bean
    public ApplicationProperties applicationProperties() {
        return importOsgiService(ApplicationProperties.class);
    }

    @Bean
    public ThemifyComponent themifyComponent(ApplicationProperties applicationProperties) {
        return new ThemifyComponentImpl(applicationProperties);
    }

    @Bean
    public TemplateRenderer templateRenderer(){
        return importOsgiService(TemplateRenderer.class);
    }

    // Exports ThemifyComponent as an OSGi service
    @Bean
    public FactoryBean<ServiceRegistration> registerMyDelegatingService(
            final ThemifyComponent themifyComponent) {
        return exportOsgiService(themifyComponent, null, ThemifyComponent.class);
    }
}