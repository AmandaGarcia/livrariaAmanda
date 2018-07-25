<%@page import="java.util.ArrayList"%>
<%@page import="modelo.Compralivro"%>
<%@page import="java.util.List"%>
<%@page import="modelo.Livro"%>
<%@page import="dao.LivroDAO"%>
<%@include file="cabecalho.jsp" %>
<%
    if (request.getParameter("id") == null) {
        response.sendRedirect("index.jsp");
        return;
    }

    Integer id = Integer.parseInt(request.getParameter("id"));
    LivroDAO dao = new LivroDAO();
    Livro l = dao.buscarPorChavePrimaria(id);


%>
<div>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    <br/>
    
    <h4 class="mtext-105 cl2 js-name-detail p-b-14">
            <%=l.getNome()%>
        </h4>

        <span class="mtext-106 cl2">
            $<%=l.getPreco()%>
        </span>
        <p class="stext-102 cl3 p-t-23">
            Nulla eget sem vitae eros pharetra viverra. Nam vitae luctus ligula. Mauris consequat ornare feugiat.
        </p>

        <!--  -->
        <div class="p-t-33">
            <div class="flex-w flex-r-m p-b-10">
                <div class="size-203 flex-c-m respon6">
                    Size
                </div>

                <div class="size-204 respon6-next">
                    <div class="rs1-select2 bor8 bg0">
                        <select class="js-select2" name="time">
                            <option>Choose an option</option>
                            <option>Size S</option>
                            <option>Size M</option>
                            <option>Size L</option>
                            <option>Size XL</option>
                        </select>
                        <div class="dropDownSelect2"></div>
                    </div>
                </div>
            </div>


                    <button class="flex-c-m stext-101 cl0 size-101 bg1 bor1 hov-btn1 p-lr-15 trans-04 js-addcart-detail">
                        Add to cart
                    </button>
                </div>
        
        <%@include file="rodape.jsp" %>
