package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.stocks.models.StockSplit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StockSplitRepository extends JpaRepository<StockSplit, String> {
}