<%@ page import="java.io.*,java.util.*,java.sql.*"%>
<%
    int id = 0;
    if (request.getParameter("id") != null && request.getParameter("id") != "")
    {
        id = Integer.parseInt(request.getParameter("id").toString());
    }

    String connectionURL = "jdbc:oracle:thin:@//localhost:1521/xe";
   // String url = request.getParameter("WEB_URL");
    String Content = new String("");
    Statement stmt = null;
    Connection con = null;

    try
    {
        String filename = "file" + id + ".pdf";
        Class.forName("oracle.jdbc.driver.OracleDriver").newInstance();
        con = DriverManager.getConnection(connectionURL, "admin", "admin");
        stmt = con.createStatement();
        String qry = "SELECT USERNAME,PASSWORD,MOBILE,EMAIL,ADDRESS,OTP FROM EMPLOYEE";
        ResultSet rst = stmt.executeQuery(qry);
        if (rst.next())
        {
            Content=rst.getString("USERNAME");
           // Content=rst.getArray();
           // Content = rst.getString("Paper_Data");
        }
        out.println(Content);
        byte requestBytes[] = Content.getBytes();
        ByteArrayInputStream bis = new ByteArrayInputStream(requestBytes);
        response.reset();
        response.setContentType("application/pdf");
        response.setHeader("cache-control", "no-cache");
        response.setHeader("Content-disposition", "attachment; filename=" + filename);

        byte[] buf = new byte[1024];
        int len;
        while ((len = bis.read(buf)) > 0)
        {
            response.getOutputStream().write(buf, 0, len);
        }
        bis.close();
        response.getOutputStream().flush();
    }
    catch (Exception e)
    {
        e.printStackTrace();
    }
%>
