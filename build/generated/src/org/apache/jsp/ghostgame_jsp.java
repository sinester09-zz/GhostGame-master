package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ghostgame_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    \n");
      out.write("     <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("        <meta charset=UTF-8\">\n");
      out.write("    \n");
      out.write("    <title>Juega Ghost</title>\n");
      out.write("  <link rel=\"stylesheet\" href=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("<div class=\"container\">\n");
      out.write("\t<div id=\"playbox\" align=\"center\">\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<h2>\n");
      out.write("\t\t\tJuega Ghost\n");
      out.write("\t\t</h2>\n");
      out.write("\t\t\n");
      out.write("               <P>Juego de estrategia para completar palabras</P>\n");
      out.write("               \n");
      out.write("                  <div class=\"col-sm-4\" style=\"background-color:lavender;\">\n");
      out.write("                <textarea id=\"string\" disabled=\"disabled\" readonly=\"readonly\" rows=\"2\" cols=\"20\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${response.string}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</textarea>\n");
      out.write("\t\t<br>\n");
      out.write("\t\t<input id=\"playgame\" type=\"text\" maxlength=\"10\" size=\"5\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${response.playgame}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("\t\t<input id=\"playButton\" type=\"button\" class=\"btn btn-info\" value=\"Ingresa una letra y presiona Enter\" onclick=\"ajaxPost();\"/>\n");
      out.write("\t\t<br>\n");
      out.write("\t</div>\n");
      out.write("\t<br>\n");
      out.write("\t<div class=\"col-sm-4\" style=\"background-color:lavenderblush;\">\n");
      out.write("        <div id=\"gameOverMessage\" align=\"center\">\n");
      out.write("\t\t<h4 id=\"message\" align=\"center\">");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${response.message}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write("</h4>\n");
      out.write("\t\t<form id=\"playAgainForm\">\n");
      out.write("\t\t\t<input id=\"playAgain\" type=\"submit\" value=\"¿Quieres juegar de nuevo?\" />\n");
      out.write("\t\t</form>\n");
      out.write("\t</div>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("\t</div>\n");
      out.write("\t\n");
      out.write("\t<div>\n");
      out.write("\t <p>hecho por Alonso Arana\n");
      out.write("    <a href=\"mailto:alonso_arana@hotmail.com\"><span class=\"glyphicon glyphicon-envelope\"></span></a>\n");
      out.write("  </p>\n");
      out.write("\t</div>\n");
      out.write("</body>\n");
      out.write("\n");
      out.write(" <script type=\"text/javascript\" src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js\"></script>\n");
      out.write("\t<script type=\"text/javascript\">\n");
      out.write("\tfunction ajaxPost() {  \n");
      out.write("\n");
      out.write("\t\t  var playgame = $('#playgame').val();\n");
      out.write("\t\t  if (playgame ==='') {\n");
      out.write("\t\t\t  $('#playgame').focus();\n");
      out.write("\t\t\t  return;\n");
      out.write("\t\t  }\n");
      out.write("\t\t\t  \n");
      out.write("\t\t  $.ajax({  \n");
      out.write("\t\t    type: \"POST\",  \n");
      out.write("\t\t    url: \"");
      if (_jspx_meth_c_url_0(_jspx_page_context))
        return;
      out.write("\", \n");
      out.write("\t\t    dataType: 'json',\n");
      out.write("\t\t    data: \"playgame=\" + playgame ,  \n");
      out.write("\t\t    \n");
      out.write("\t\t    success: function(response){  \n");
      out.write("\n");
      out.write("\t\t      $('#string').val(response.string);\n");
      out.write("\t\t      $('#message').html(response.message);\n");
      out.write("\t\t      $('#playgame').val(response.playgame);\n");
      out.write("\t\t      if (response.message ==='') {\n");
      out.write("\t\t\t      $('#play').focus();\n");
      out.write("\t\t      } else {\n");
      out.write("\t\t    \t  $(\"#playbox\").hide();\n");
      out.write("\t\t    \t  $(\"#gameOverMessage\").show();\n");
      out.write("\t\t    \t  $('#playAgain').focus();\n");
      out.write("\t\t      }\n");
      out.write("\t\t    },  \n");
      out.write("\t\t    \n");
      out.write("\t\t    error: function(e){  \n");
      out.write("\t\t      alert('Error: ' + e.statusError);  \n");
      out.write("\t\t    }  \n");
      out.write("\t\t  });  \n");
      out.write("\t\t}  \n");
      out.write("\n");
      out.write("\t$( document ).ready(function() {\n");
      out.write("\t\t$(\"#gameOverMessage\").hide();\n");
      out.write("\t\t$('#playgame').focus();\n");
      out.write("\t\t\t$('#playgame').keypress(function(event){\n");
      out.write("\t\t\t  if(event.keyCode == 13){\n");
      out.write("\t\t\t    $('#playButton').click();\n");
      out.write("\t\t\t  }\n");
      out.write("\t\t\t});\n");
      out.write("\t\t});\n");
      out.write("\t</script>\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_c_url_0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _jspx_tagPool_c_url_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_c_url_0.setPageContext(_jspx_page_context);
    _jspx_th_c_url_0.setParent(null);
    _jspx_th_c_url_0.setValue("/ghostgame");
    int _jspx_eval_c_url_0 = _jspx_th_c_url_0.doStartTag();
    if (_jspx_th_c_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
      return true;
    }
    _jspx_tagPool_c_url_value_nobody.reuse(_jspx_th_c_url_0);
    return false;
  }
}
