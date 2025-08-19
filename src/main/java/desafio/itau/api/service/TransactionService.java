package desafio.itau.api.service;

import java.time.OffsetDateTime;
import java.util.DoubleSummaryStatistics;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.springframework.stereotype.Service;

import desafio.itau.api.model.Transaction;

@Service
public class TransactionService {
    
    private final Queue<Transaction> transactions = new ConcurrentLinkedQueue<>(); // Guarda as transações em memória (fila)
    //Concurrent... Segura os dados da fila para não perder dados e embolar

    public void addTransaction(Transaction transaction) {
        transactions.add(transaction);
    }

    public void clearTransaction() {
        transactions.clear();
    }

    public DoubleSummaryStatistics getStatistics() {
        OffsetDateTime now = OffsetDateTime.now();
        return transactions.stream()
            .filter(t -> t.getDataHora().isAfter(now.minusSeconds(60)))
            .mapToDouble(Transaction::getValor)
            .summaryStatistics();
    }

}
