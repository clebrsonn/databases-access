package br.com.hyteck.databases.trade.model;

import br.com.hyteck.databases.framework.AbstractEntity;
import br.com.hyteck.databases.stocks.models.Stock;

import javax.persistence.Column;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import java.math.BigDecimal;
import java.util.List;

public class PositionInvestment extends AbstractEntity {

    @OneToOne
    @Column(unique = true)
    private Stock stock;

    @OneToMany
    @JoinColumn(name = "position")
    private List<Investment> investments;

    private BigDecimal totalBuy;
    private BigDecimal totalSell;

}
