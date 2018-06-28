package me.ataur.bdlaws.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.SynchronousQueue;
import java.util.regex.Pattern;

/**
 * Created by ataur on 11/10/17.
 */
public class CustomeTag extends SimpleTagSupport {
    private String text;
    private String output;

    private static final Logger logger = LoggerFactory.getLogger(CustomeTag.class);
    @Override
    public void doTag() throws JspException, IOException {

     /*  if(output=="" || output==null){
            getJspContext().getOut().println(text);
        }else {
            getJspContext().setAttribute(output,text);
        }*/
        getJspContext().getOut().println(text);

    }


    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
        System.out.print(this.text);
    }

}
