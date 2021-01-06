package com.wallet.service;

import com.wallet.entity.Wallet;
import com.wallet.repository.WalletRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WalletServiceImpl implements WalletService {

    @Autowired
    private WalletRepository repository;

    @Override
    public Wallet save(Wallet w) {
        return repository.save(w);
    }
}
