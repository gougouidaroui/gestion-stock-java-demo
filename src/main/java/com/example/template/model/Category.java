package com.example.template.model;

import com.example.template.model.Produit;
import jakarta.persistence.*;

@Entity
@Table(name = "categories")
public class Category {
  @Id
  @Column(name="category_id")
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;
  private String name;
  private String description;

  @ManyToOne
  @JoinColumn(name = "produit_id")
  private Produit produit_id;

  public Category() {}
  public Category(String name, String description) {
    this.name = name;
    this.description = description;
  }
}
