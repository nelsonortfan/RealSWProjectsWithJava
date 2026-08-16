package org.example;

import java.io.IOException;

public class BankTransactionAnalyzerSimple {

    public static void main(String[] args) throws IOException {

        final BankStatementParser bankStatementParser = new BankStatementCSVParser();

        final BankStatementAnalyzer bankStatementAnalyzer = new BankStatementAnalyzer();

        bankStatementAnalyzer.analyze(args[0], bankStatementParser);

    }

}
