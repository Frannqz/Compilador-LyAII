package Compilador;


import jflex.exceptions.SilentExit;

/**
 *
 * @author yisus
 */
public class ExecuteJFlex {

    public static void main(String omega[]) {
        String lexerFile = System.getProperty("user.dir") + "/src/compilador/Lexer.flex";
//                lexerFileColor = System.getProperty("user.dir") + "/src/compilador/LexerColor.flex";
        try {
//            jflex.Main.generate(new String[]{lexerFile, lexerFileColor});
              jflex.Main.generate(new String[]{lexerFile});
        } catch (SilentExit ex) {
            System.out.println("Error al compilar/generar el archivo flex: " + ex);
        }
    }
}
