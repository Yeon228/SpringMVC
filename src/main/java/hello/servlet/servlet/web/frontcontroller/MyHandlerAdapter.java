package hello.servlet.servlet.web.frontcontroller;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public interface MyHandlerAdapter {
    boolean supports(Object member);

    ModelView handle(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException;
}
