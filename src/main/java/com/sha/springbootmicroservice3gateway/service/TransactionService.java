package com.sha.springbootmicroservice3gateway.service;

import com.google.gson.JsonElement;
import com.sha.springbootmicroservice3gateway.request.ITransactionServiceRequest;
import com.sha.springbootmicroservice3gateway.util.RetrofitUtils;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService implements ITransactionService {

    private final ITransactionServiceRequest transactionServiceRequest;

    public TransactionService(ITransactionServiceRequest transactionServiceRequest) {
        this.transactionServiceRequest = transactionServiceRequest;
    }

    @Override
    public JsonElement saveProduct(JsonElement requestBody) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.saveTransaction(requestBody));
    }

    @Override
    public void deleteProduct(Long productId) {
        RetrofitUtils.executeInBlock(transactionServiceRequest.deleteTransaction(productId));
    }

    @Override
    public List<JsonElement> getAllTransactionsOfUser(Long userId) {
        return RetrofitUtils.executeInBlock(transactionServiceRequest.getAllTransactionsOfAuthorizedUser(userId));
    }
}
