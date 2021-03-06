package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.stocks.models.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface StockRepository extends JpaRepository<Stock, String> {
     boolean existsByCode(String code);
     Collection<Stock> findByCodeIn(Collection<String> code);
}