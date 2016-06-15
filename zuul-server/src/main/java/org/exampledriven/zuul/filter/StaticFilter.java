package org.exampledriven.zuul.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;

/**
 * Created by Peter_Szanto on 6/14/2016.
 */
@Component
public class StaticFilter extends ZuulFilter {

    @Override
    public String filterType() {
        return "pre";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
        return "/api/static".equals(path);
    }

    @Override
    public Object run() {

        RequestContext ctx = RequestContext.getCurrentContext();
        // Set the default response code for static filters to be 200
        ctx.setResponseStatusCode(HttpServletResponse.SC_OK);
        // first StaticResponseFilter instance to match wins, others do not set body and/or status
        if (ctx.getResponseBody() == null) {
            ctx.setResponseBody("static content");
            ctx.setSendZuulResponse(false);
        }
        return null;
    }
}
