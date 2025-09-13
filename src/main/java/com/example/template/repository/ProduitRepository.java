
package com.example.template.repository;

import com.example.template.model.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
    // No need to declare findById, findAll, save, or deleteById as they are inherited from JpaRepository
}
