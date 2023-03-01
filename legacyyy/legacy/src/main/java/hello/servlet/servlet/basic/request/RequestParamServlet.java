package hello.servlet.servlet.basic.request;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "requestParamServlet", urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("전체 파라미터 조회");
        request.getParameterNames().asIterator().
                forEachRemaining(paramName -> System.out.println(paramName + "=" + request.getParameter(paramName)));
        System.out.println("전체 파라미터 조회 종료");
        System.out.println();

        System.out.println("단일 파라미터 조회");
        String username = request.getParameter("username");
        System.out.println("username = " + username);
        String age = request.getParameter("age");
        System.out.println("age = " + age);
        System.out.println();

        System.out.println("이름이 같은 복수 파라미터 조회");
        String[] usernames = request.getParameterValues("username");
        for (String name : usernames) {
            System.out.println("usernames = " + name);
        }

        /**
         * 복수 파라미터일 시 getParameter()을 사용하면 첫번째 Parameter를 반환한다
         * 중복일 시 getParameterValues()를 사용해야 한다.
         **/
    }
}
