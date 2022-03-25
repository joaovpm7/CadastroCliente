/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controle;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import modelo.Cliente;

/**
 *
 * @author JoaoVictor
 */
@WebServlet(name = "ClienteServlet", urlPatterns = {"/ClienteServlet"})
public class ClienteServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

        String nome = request.getParameter("nome");
        String doc = request.getParameter("documento");
        String doc1 = request.getParameter("documento1");
        Date data = Date.valueOf(request.getParameter("datanascimento"));
        String sex = request.getParameter("sexo");
        String esco = request.getParameter("escolaridade");
        String tele = request.getParameter("telefone");
        String email = request.getParameter("email");
        //String cep = request.getParameter("cep");
        //String logra = request.getParameter("logra");
        //String numero = request.getParameter("numero");
        //String bairro = request.getParameter("bairro");
        //String cidade = request.getParameter("cidade");
        //String estado = request.getParameter("estado");

        Cliente cli = new Cliente();
        cli.setNome(nome);
        cli.setDocumento(doc);
        cli.setTipoDocumento(doc1);
        cli.setEmail(email);
        cli.setSexo(sex);
        cli.setEscolaridade(esco);
        cli.setDataNascimento(data);

        String dddTelLimpo = tele.replace(" ", " ")//limpar a mascara
                .replace("-", "")
                .replace("(", "")
                .replace(")", "");

        String ddd = dddTelLimpo.substring(0, 2);//2799239446 de 0 até 2 então ele só pega os numeros 2 e 7 que é o DDD. (O 9 não pegaria, para no 2)

        //telefone fixo ou celular
        String telefone = dddTelLimpo.length() == 10
                ? dddTelLimpo.substring(2, 6)
                + "-" + dddTelLimpo.substring(6)
                : dddTelLimpo.substring(2, 7)
                + "-" + dddTelLimpo.substring(7);

        cli.setDdd(ddd);
        cli.setTelefone(telefone);

        long novoid = cli.Cadastrar();

        if (novoid > 0) {

            String mensagem
                    = "<h1>Cadastro Efetuado com Sucesso</h1><br>";
            response.getWriter().print(mensagem);

            String conteudo = "<b><label>Nome Completo:</label>";
            String conteudo2 = "<scan style='color:blue;'>" + nome + "</scan>";
            String tabela = "<table border='1' cellspacing='0' cellpadding='5'>";
            String conteudo3 = "<b><label>Documento:</label>";
            String conteudo4 = "<scan style='color:blue;'>" + doc + "</scan>";
            String conteudo5 = "<scan style='color:blue;'>" + doc1 + "</scan>";
            String conteudo6 = "<b><label>Data de Nascimento:</label>";
            String conteudo7 = "<scan style='color:blue;'>" + data + "</scan>";
            String conteudo8 = "<b><label>Sexo:</label>";
            String conteudo9 = "<scan style='color:blue;'>" + sex + "</scan>";
            String conteudo10 = "<b><label>Escolaridade:</label>";
            String conteudo11 = "<scan style='color:blue;'>" + esco + "</scan>";
            //------------------------------------------------------------------------
            tabela += "<tr>";
            tabela += "<td colspan='2'>";
            tabela += conteudo;
            tabela += "</td>";
            tabela += "<td>";
            tabela += conteudo2;
            tabela += "</td>";
            tabela += "</tr>";
            tabela += "<tr>";
            tabela += "<td colspan='2'>";
            tabela += conteudo3;
            tabela += "</td>";
            tabela += "<td>";
            tabela += conteudo5 + ": " + conteudo4;
            tabela += "</td>";
            tabela += "</tr>";
            tabela += "<tr>";
            tabela += "<td colspan='2'>";
            tabela += conteudo6;
            tabela += "</td>";
            tabela += "<td>";
            tabela += conteudo7;
            tabela += "</td>";
            tabela += "</tr>";
            tabela += "<tr>";
            tabela += "<td colspan='2'>";
            tabela += conteudo8;
            tabela += "</td>";
            tabela += "<td>";
            tabela += conteudo9;
            tabela += "</td>";
            tabela += "<tr>";
            tabela += "<td colspan='2'>";
            tabela += conteudo10;
            tabela += "</td>";
            tabela += "<td>";
            tabela += conteudo11;
            tabela += "</td>";
            tabela += "</tr>";
            tabela += "</table>";

            response.getWriter().print(tabela);         
        } else {
            String mensagem
                    = "<h1>Cadastro não Efetuado com Sucesso</h1>";
            response.getWriter().print(mensagem);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
