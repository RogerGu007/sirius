package com.sirius.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import static com.sirius.entity.ResponseGson.render;

@Path("/health")
public class SiriusCheck {
    private static final Logger logger = LoggerFactory.getLogger(SiriusCheck.class);

    @GET
    @Path("/check")
    @Produces(MediaType.APPLICATION_JSON)
    public String healthCheck(@QueryParam("id") String id) {
        logger.info("=========== Server Health Check！");
        return render("0", "success");
    }
}
