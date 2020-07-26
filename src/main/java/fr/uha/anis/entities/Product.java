package fr.uha.anis.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name="product")
public class Product {
	
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
    private Long id;
    
    @Column(name="sku")
	private String sku;
    
    @Column(name="name")
	private String name;
    
    @Column(name="description")
	private String description;
    
    @Column(name="unitPrice")
	private double unitPrice;
    
    @Column(name="imageUrl")
	private String imageUrl;
    
    @Column(name="active")
	private boolean active;
    
    @Column(name="unitsInstock")
	private int unitsInstock;
    
    @Column(name="dateCreated")
	private Date dateCreated;
    
    @Column(name="lastUpdated")
	private Date lastUpdated;
    
    @ManyToOne
    @JoinColumn(name = "category_id",nullable = false)
    private Category category;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public boolean isActive() {
		return active;
	}

	public void setActive(boolean active) {
		this.active = active;
	}

	public int getUnitsInstock() {
		return unitsInstock;
	}

	public void setUnitsInstock(int unitsInstock) {
		this.unitsInstock = unitsInstock;
	}

	public Date getDateCreated() {
		return dateCreated;
	}

	public void setDateCreated(Date dateCreated) {
		this.dateCreated = dateCreated;
	}

	public Date getLastUpdated() {
		return lastUpdated;
	}

	public void setLastUpdated(Date lastUpdated) {
		this.lastUpdated = lastUpdated;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
    
    public Product() {
		// TODO Auto-generated constructor stub
	}
    

	public Product(Long id, String sku, String name, String description, double d, String imageUrl,
			boolean active, int unitsInstock, Date dateCreated, Date lastUpdated, Category category) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.unitPrice = d;
		this.imageUrl = imageUrl;
		this.active = active;
		this.unitsInstock = unitsInstock;
		this.dateCreated = dateCreated;
		this.lastUpdated = lastUpdated;
		this.category = category;
	}
    
    
}
