import com.demo.form.demo.Login;
import com.demo.form.demo.ValidateUser;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginTest extends Mockito {


    @Test
    public void testSuccessLogin() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateUser validateUser=mock(ValidateUser.class);

        when(request.getParameter("username")).thenReturn("surbhi");
        when(request.getParameter("password")).thenReturn("surbhi");
        when(request.getSession()).thenReturn(session);

        new Login().doPost(request, response);

        verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        verify(request, atLeast(1)).getParameter("password"); // only if you want to verify username was called...
        verify(validateUser,atLeast(1)).checkUser("surbhi","surbhi");
    }
    @Test
    public void testFailLogin() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateUser validateUser=mock(ValidateUser.class);

        when(request.getParameter("username")).thenReturn("surbhi");
        when(request.getParameter("password")).thenReturn("wrong");
        when(request.getSession()).thenReturn(session);


        new Login().doPost(request, response);

        verify(request, atLeast(1)).getParameter("username"); // only if you want to verify username was called...
        verify(request, atLeast(1)).getParameter("password"); // only if you want to verify username was called...
        verify(response).sendRedirect("/demo_war");
        verify(session).setAttribute("errorMessage", "Invalid username or password");

    }
}
