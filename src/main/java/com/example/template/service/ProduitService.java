package com.example.template.service;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.http.ResponseEntity;
import java.util.List;
import com.example.template.model.Produit;



public interface ProduitService {
    List<Produit> getAllProduits();

    ResponseEntity<Produit> getProduitById(@PathVariable Long id);

    Produit createProduit(@RequestBody Produit produit);

    ResponseEntity<Produit> updateProduit(@PathVariable Long id, @RequestBody Produit produit);

    ResponseEntity<Void> deleteProduit(@PathVariable Long id);
}
