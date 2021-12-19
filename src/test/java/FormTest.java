import com.demo.form.demo.Form;
import com.demo.form.demo.Login;
import com.demo.form.demo.ValidateForm;
import com.demo.form.demo.ValidateUser;
import org.junit.Test;
import org.mockito.Mockito;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FormTest extends Mockito {
    @Test
    public void testInvalidName() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid Name!!");

    }

    @Test
    public void testInvalidAddress() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address$£%^");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid Address!!");

    }
    @Test
    public void testInvalidPhone() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("fdf9999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid Phone number!!");

    }
    @Test
    public void testInvalidCity() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin$%^");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid City!!");

    }
    @Test
    public void testInvalidState() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin£$%^");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid State!!");

    }
    @Test
    public void testInvalidCountry() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Iredjfjdhfjdfhjdhfjdhfjhfjdhfjdhfjdhfjdhsfjdhfjdhsfjhsdbxcbxjcdfhjhfjdfhirueirudjvhjdhfjshfjhfjfhdjfsuhuyuyuyuyuyuyuyiyuyuyiuyiland");
        when(request.getParameter("pincode")).thenReturn("D123456");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");


        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid Country!!");

    }

    @Test
    public void testInvalidPincode() throws Exception{
        HttpServletRequest request = mock(HttpServletRequest.class);
        HttpServletResponse response = mock(HttpServletResponse.class);
        HttpSession session = mock(HttpSession.class);
        ValidateForm validateForm=mock(ValidateForm.class);

        when(request.getParameter("name")).thenReturn("Surbhi");
        when(request.getParameter("address")).thenReturn("Address");
        when(request.getParameter("phone")).thenReturn("9999999999");
        when(request.getParameter("city")).thenReturn("Dublin");
        when(request.getParameter("state")).thenReturn("Dublin");
        when(request.getParameter("country")).thenReturn("Ireland");
        when(request.getParameter("pincode")).thenReturn("D123456£$£");
        when(request.getSession()).thenReturn(session);
        when(session.getAttribute("name")).thenReturn("surbhi");

        new Form().doPost(request, response);

        verify(session).setAttribute("errorMessage", "Invalid Pincode!!");

    }
}
