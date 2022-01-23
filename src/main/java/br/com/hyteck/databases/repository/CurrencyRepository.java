package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.currency.Currency;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface CurrencyRepository extends JpaRepository<Currency, String> {
    Integer countByCode(String code);
}
