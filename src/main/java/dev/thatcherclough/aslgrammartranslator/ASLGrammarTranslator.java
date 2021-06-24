package dev.thatcherclough.aslgrammartranslator;

import dev.thatcherclough.aslgrammartranslator.translator.base.ASLResponse;
import dev.thatcherclough.aslgrammartranslator.translator.service.ASLConversionService;

public class ASLGrammarTranslator {

    private static String toTranslate = null;
    final private static String help = "ASLGrammarTranslator: An English to American Sign Language grammar translator (1.0.0)\n\nUsage:\n\tjava -jar aslgrammartranslator.jar [-h] [-v] [-i INPUT]\n\nArguments:\n\t-h, --help\t\t\tDisplay this message.\n\t-v, --version\t\t\tDisplay current version.\n\t-i, --input\t\t\tSpecify input sentence (Surround with quotes).";

    public static void main(String[] args) {
        try {
            if (args.length == 0)
                throw new Exception();
            for (int k = 0; k < args.length; k++)
                if (args[k].equals("-h") || args[k].equals("--help")) {
                    throw new Exception();
                } else if (args[k].equals("-v") || args[k].equals("--version")) {
                    System.out.println(help.substring(0, help.indexOf("\n")));
                    System.exit(0);
                } else if (args[k].equals("-i") || args[k].equals("--input"))
                    toTranslate = args[++k];

            if (toTranslate == null)
                throw new Exception();
            try {
                ASLConversionService alsConversionService = new ASLConversionService();
                ASLResponse result = alsConversionService.getASLSentence(toTranslate);
                System.out.println("\nTranslation:\n" + result.getSentence());
                System.exit(0);
            } catch (Exception e) {
                System.out.println("\nError:\n" + e.getMessage());
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println(help);
            System.exit(0);
        }
    }
}
