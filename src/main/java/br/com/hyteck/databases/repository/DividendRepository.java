package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.stocks.models.Dividend;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DividendRepository  extends JpaRepository<Dividend, String> {
}
