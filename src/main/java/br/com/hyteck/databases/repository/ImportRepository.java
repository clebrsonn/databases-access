package br.com.hyteck.databases.repository;

import br.com.hyteck.databases.imported.ImportedXSLX;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface ImportRepository extends JpaRepository<ImportedXSLX, String> {

    List<ImportedXSLX> findAllByAlreadyConvertedIsFalse();
}
