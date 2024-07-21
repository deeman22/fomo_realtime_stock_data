package com.fomo.realtimepricedatabackend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.fomo.realtimepricedatabackend.entity.CoinData;
import com.fomo.realtimepricedatabackend.repository.CoinRepository;

@Service
public class CoinService {

    private final CoinRepository coinRepository;

    public CoinService(CoinRepository coinRepository) {
        this.coinRepository = coinRepository;
    }

    public List<CoinData> getAllCoins() {
        return coinRepository.findAll();
    }

}
