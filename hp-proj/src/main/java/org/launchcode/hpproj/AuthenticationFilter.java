//package org.launchcode.hpproj;
//
//import org.launchcode.hpproj.controllers.AuthenticationController;
//import org.launchcode.hpproj.models.User;
//import org.launchcode.hpproj.models.data.UserRepository;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import javax.servlet.http.HttpSession;
//import java.io.IOException;
//import java.util.Arrays;
//import java.util.List;
//
//public class AuthenticationFilter extends HandlerInterceptorAdapter {
//
//    @Autowired
//    UserRepository userRepository;
//
//    @Autowired
//    AuthenticationController authenticationController;
//
//    private static final List<String> whitelist = Arrays.asList("/home", "/login", "/signup", "/logout", "/css", "/images");
//
//    @Override
//    public boolean preHandle(HttpServletRequest request,
//                             HttpServletResponse response,
//                             Object handler) throws IOException {
//
//        if(isWhitelisted(request.getRequestURI())){
//            return true;
//        }
//
//        HttpSession session = request.getSession();
//        User user = authenticationController.getFromUserSession(session);
//
//        if (user != null) {
//            return true;
//        }
//
//        response.sendRedirect("/login");
//        return false;
//    }
//
//    private static boolean isWhitelisted(String path) {
//        for (String pathRoot : whitelist) {
//            if (path.startsWith(pathRoot)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//}
