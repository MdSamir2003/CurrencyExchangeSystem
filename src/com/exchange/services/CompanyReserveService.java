package com.exchange.services;

import com.exchange.CompanyReserve;

import java.util.ArrayList;
import java.util.List;

public class CompanyReserveService {
    private List<CompanyReserve> reserves;

    public CompanyReserveService() {
        reserves = new ArrayList<>();
    }

    public void addReserve(CompanyReserve reserve) {
        reserves.add(reserve);
    }

    public CompanyReserve getReserveById(int currencyId) {
        for (CompanyReserve reserve : reserves) {
            if (reserve.getCurrencyId() == currencyId) {
                return reserve;
            }
        }
        return null;
    }

    public List<CompanyReserve> getAllReserves() {
        return reserves;
    }


}
