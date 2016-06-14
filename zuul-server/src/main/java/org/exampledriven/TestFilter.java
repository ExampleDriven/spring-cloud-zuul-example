package org.exampledriven;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import org.springframework.stereotype.Component;

/**
 * Created by Peter_Szanto on 6/14/2016.
 */
@Component
class StaticFilter extends ZuulFilter {


    @Override
    public String filterType() {
        return "static";
    }

    @Override
    public int filterOrder() {
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        String path = RequestContext.getCurrentContext().getRequest().getRequestURI();
        return "static".equals(path);
    }

    @Override
    public Object run() {
        return "Hello";
    }
}
