package com.JobFinder.Joblisting;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.io.IOException;

@RestController
public class PostController
{
    @RequestMapping(value ="/" )
    public void redirect(HttpServletResponse response) throws IOException {
      response.sendRedirect("/Swagger-ui.html");
    }


}
