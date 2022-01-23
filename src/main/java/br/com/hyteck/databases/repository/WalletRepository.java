package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.stocks.models.Wallet;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

public interface WalletRepository extends JpaRepository<Wallet, String> {
    Collection<Wallet> findDistinctByNameIn(Collection<String> names);
}
