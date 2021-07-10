/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package visitor;

/**
 *
 * @author samuk159
 */
public class VisitanteExportacaoXML implements Visitante {
    
    public String exportar(Forma... formas) {
        StringBuilder sb = new StringBuilder();
        for (Forma forma : formas) {
            sb.append(forma.aceitar(this)).append("\n");
        }
        return sb.toString();
    }

    @Override
    public String visitarCirculo(Circulo circulo) {
        return "<circulo>\n"
            +  "    <id>" + circulo.id + "</id>\n"
            +  "    <x>" + circulo.x + "</y>\n"
            +  "    <y>" + circulo.y + "</y>\n"
            +  "    <raio>" + circulo.raio + "</raio>\n"
            +  "</circulo>";
    }

    @Override
    public String visitarRetangulo(Retangulo retangulo) {
        return "<retangulo>\n"
            +  "    <id>" + retangulo.id + "</id>\n"
            +  "    <x>" + retangulo.x + "</y>\n"
            +  "    <y>" + retangulo.y + "</y>\n"
            +  "    <largura>" + retangulo.largura + "</largura>\n"
            +  "    <altura>" + retangulo.altura + "</altura>\n"
            +  "</retangulo>";
    }

    @Override
    public String visitarFormaComposta(FormaComposta formaComposta) {
        return "<forma_composta>\n"
            +  "    <id>" + formaComposta.id + "</id>\n"
            +  _visitarFormaComposta(formaComposta)
            +  "</forma_composta>";
    }

    private String _visitarFormaComposta(FormaComposta formaComposta) {
        StringBuilder sb = new StringBuilder();
        for (Forma forma : formaComposta.filhos) {
            String valor = forma.aceitar(this);
            //Identação
            valor = "   " + valor.replace("\n", "\n    ") + "\n";
            sb.append(valor);
        }
        return sb.toString();
    }

}
