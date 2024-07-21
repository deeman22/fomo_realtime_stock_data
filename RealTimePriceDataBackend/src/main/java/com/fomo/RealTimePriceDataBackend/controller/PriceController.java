package com.fomo.realtimepricedatabackend.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fomo.realtimepricedatabackend.entity.CoinPriceHistory;
import com.fomo.realtimepricedatabackend.service.PriceService;

@RestController
@RequestMapping("/price")
public class PriceController {

    private final PriceService priceService;

    public PriceController(PriceService priceService) {
        this.priceService = priceService;
    }

    @GetMapping("/{coinId}")
    public ResponseEntity<List<CoinPriceHistory>> getMethodName(@PathVariable String coinId, @RequestParam int count) {
        List<CoinPriceHistory> priceList = priceService.getPriceListByCoinId(coinId, count);
        return ResponseEntity.ok(priceList);
    }
}
