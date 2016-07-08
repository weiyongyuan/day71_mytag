package com.atguigu.tag;

import java.io.IOException;

import javax.servlet.jsp.JspContext;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class IfTag extends SimpleTagSupport {

	private boolean test;
	public void setTest(boolean test) {
		this.test = test;
	}
	@Override
	public void doTag() throws JspException, IOException {
		if (test) {
			PageContext context = (PageContext) getJspContext();
			context.getRequest().setAttribute("true", true);
			JspWriter out = context.getOut();
			getJspBody().invoke(out);
		}
	}
}
