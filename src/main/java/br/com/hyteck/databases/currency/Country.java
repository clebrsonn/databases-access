package br.com.hyteck.databases.currency;


import br.com.hyteck.databases.framework.AbstractEntity;
import lombok.*;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Entity
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Country extends AbstractEntity {
    @ManyToMany
    @JoinTable(name="country_currency", joinColumns=
            {@JoinColumn(name="country_id")}, inverseJoinColumns=
            {@JoinColumn(name="currency_id")})
    @ToString.Exclude
    private List<Currency> currencies;

    private String name;

}
