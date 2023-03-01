package hello.servlet.servlet.web.frontcontroller.v2.controller;

import hello.servlet.servlet.domain.member.Member;
import hello.servlet.servlet.domain.member.MemberRepository;
import hello.servlet.servlet.web.frontcontroller.MyView;
import hello.servlet.servlet.web.frontcontroller.v2.ControllerV2;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

public class MemberListControllerV2 implements ControllerV2 {
    @Override
    public MyView process(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Member> members = MemberRepository.getInstance().findAll();
        request.setAttribute("members", members);
        return new MyView("WEB-INF/views/members.jsp");
    }
}
