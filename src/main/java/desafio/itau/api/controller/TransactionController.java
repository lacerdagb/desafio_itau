package desafio.itau.api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import desafio.itau.api.dto.TransactionRequest;
import desafio.itau.api.model.Transaction;
import desafio.itau.api.service.TransactionService;
import jakarta.validation.Valid;

import java.time.OffsetDateTime;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/transacao")
public class TransactionController {

    private final TransactionService transactionService;
    
    private TransactionController(TransactionService transactionService) {
        this.transactionService = transactionService;
    }

    @PostMapping
    public ResponseEntity<Void> createTransaction (@Valid @RequestBody TransactionRequest request) {
        if ( request.getDataHora() .isAfter(OffsetDateTime.now()) || request.getValor() <= 0 ) 
        //Se for menor que 0, vai dar erro e não vai mostrar o corpo
        {
            return ResponseEntity.unprocessableEntity().build();
        }
        transactionService.addTransaction(new Transaction(request.getValor(), request.getDataHora()));
        
        return ResponseEntity.status(HttpStatus.CREATED).build();

    }
    @DeleteMapping
    public ResponseEntity<Void> clearTransactions() {
        transactionService.clearTransaction();
        return ResponseEntity.ok().build();
    }
    
}
