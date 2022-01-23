package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.trade.model.InvestmentAverage;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentAverageRepository extends JpaRepository<InvestmentAverage, String> {
}
