package com.heroku.charizard.view;

import org.antlr.stringtemplate.StringTemplate;
import org.antlr.stringtemplate.StringTemplateGroup;
import org.springframework.core.io.Resource;
import org.springframework.web.servlet.view.InternalResourceView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.util.Map;

public class StringTemplateView extends InternalResourceView {

    @Override
    protected void renderMergedOutputModel(Map model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Resource rootResource = getApplicationContext().getResource("/WEB-INF/templates/");
        String rootDirectory = rootResource.getFile().getPath();
        StringTemplateGroup group = new StringTemplateGroup("templateGroup", rootDirectory);
        StringTemplate template = group.getInstanceOf(getBeanName());
        template.setAttributes(model);
        PrintWriter writer = response.getWriter();
        writer.print(template);
        writer.flush();
        writer.close();
    }

}
