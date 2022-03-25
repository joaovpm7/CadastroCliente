<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cadastro</title>
    </head>
    <body>
        <form action="exibir.jsp" method="GET">
            <h1>
                Cadastro
            </h1>
            <hr size="5">
            <table border="1" cellspacing="0" cellpadding="5">
                <tr>
                    <td colspan="2">
                        <label for="txtAluno">Nome Completo:<br></label>
                        <input size="45" 
                               type="text"
                               id="txtNome"
                               placeholder="Digite seu nome..."
                               name="nome" />
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="txtDocumento">Documento:<br></label>
                        <input size="20" 
                               type="text"
                               id="txtDocumento"
                               placeholder="Digite seu documento..."
                               name="documento" />
                    </td>
                    <td>
                        <table border="1" cellspacing="0" cellpadding="0">
                            <tr>
                                <td colspan="3">
                                    <label for="">Tipo de Documento:</label>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input name="documento1" 
                                           type="radio" 
                                           id="rdbCPF" 
                                           value="CPF" />
                                    <label for="rdbCPF">CPF</label>
                                </td>
                                <td>
                                    <input name="documento1" 
                                           type="radio" 
                                           id="rdbCNH" 
                                           value="CNH" />
                                    <label for="rdbCNH">CNH</label>
                                </td>
                                <td>
                                    <input name="documento1" 
                                           type="radio" 
                                           id="rdbRG" 
                                           value="RG" />
                                    <label for="rdbRG">RG</label>
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td>
                        <label for="txtdtnascimento">Data de Nascimento:<br></label>
                        <input type="date" id="txtdtnascimento" name="dtnascimento"/>
                    </td>
                    <td>
                        <table border="1" cellspacing="0" cellpadding="0">
                            <tr>
                                <td colspan="3">
                                    <label>Sexo:</label>
                                </td>
                            </tr>
                            <tr>
                                <td>
                                    <input name="sexo" type="radio" id="rdbMasculino" value="Masculino" />
                                    <label for="rdbMasculino">Masculino</label>
                                </td>
                                <td>
                                    <input name="sexo" type="radio" id="rdbFeminino" value="Feminino" />
                                    <label for="rdbFeminino">Feminino</label>
                                </td>
                                <td>
                                    <input name="sexo" type="radio" id="rdbOutro" value="Outros" />
                                    <label for="rdbOutro">Outros</label>
                                </td>
                            </tr>
                        </table>
                </tr>
                <tr>
                    <td>
                        <label for="sltEscolaridade">Escolaridade:</label><br>
                        <select id="sltEscolaridade" name="escolaridade">
                            <option value="Ensino Medio">Ensino Medio</option>
                            <option value="Ensino Tecnico">Ensino Técnico</option>
                            <option value="Ensino Superior">Ensino Superior</option>
                            <option value="Pos Graduacao">Pós Graduação</option>
                        </select>
                    </td>
                    <td>
                        <table>
                            <tr>
                                <td>
                                    <label for="txtDDD">ddd/telefone:</label><br>
                                    <input size="20" 
                                           type="text"
                                           id="txtDDD"
                                           placeholder="Digite seu telefone..."
                                           name="telefone" />
                                </td>
                            </tr>
                        </table>
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <label for="sltEmail">Email:</label><br>
                        <input size="55" 
                               type="text"
                               id="txtEmail"
                               placeholder="Digite seu email..."
                               name="email" />
                    </td>
                </tr>
                <tr>
                    <td colspan="3">
                        <fieldset>
                            <legend>Endereço Completo</legend>
                            <label for="txtcep">CEP:</label><br>
                            <input type="number" id="txtcep" name="cep"/>
                            <br>
                            <label for="txtlogra">Logradouro:</label><br>
                            <input type="text" id="txtlogra" name="logra"/>
                            <br>
                            <label for="txtnume">Numero:</label><br>
                            <input type="number" id="txtnume" name="numero"/>
                            <br>
                            <label for="txtBairro">Bairro:</label><br>
                            <input type="text" id="txtBairro" name="bairro"/>
                            <br>
                            <label for="txtCidade">Cidade:</label><br>
                            <input type="text" id="txtCidade" name="cidade"/>
                            <br>
                            <label for="sltUF">UF:</label><br>
                            <select id="sltUF" name="estado">
                                <option value="AC">AC</option>
                                <option value="AL">ACL</option>
                                <option value="AP">AP</option>
                                <option value="AM">AM</option>
                                <option value="BA">BA</option>
                                <option value="CE">CE</option>
                                <option value="DF">DF</option>
                                <option value="ES">ES</option>
                                <option value="GO">GO</option>
                                <option value="MA">MA</option>
                                <option value="MT">MT</option>
                                <option value="MS">MS</option>
                                <option value="MG">MG</option>
                                <option value="PA">PA</option>
                                <option value="PB">PB</option>
                                <option value="PR">PR</option>
                                <option value="PE">PE</option>
                                <option value="PI">PI</option>
                                <option value="RJ">RJ</option>
                                <option value="RN">RN</option>
                                <option value="RS">RS</option>
                                <option value="RO">RO</option>
                                <option value="RR">RR</option>
                                <option value="SC">SC</option>
                                <option value="SP">SP</option>
                                <option value="SE">SE</option>
                                <option value="TO">TO</option>
                            </select>
                        </fieldset>
                    </td>
                </tr>
                <tr>
                    <td colspan="4" style="text-align: center;">
                        <input type="submit" value="Cadastrar"/>
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
