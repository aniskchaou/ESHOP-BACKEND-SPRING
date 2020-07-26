package fr.uha.anis.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.metamodel.EntityType;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import fr.uha.anis.entities.Category;
import fr.uha.anis.entities.Product;

@Configuration
public class ConfigureRepository implements RepositoryRestConfigurer {
	
	private EntityManager entityManager;
	
	
	@Autowired
public ConfigureRepository(EntityManager entityManager) {
		
		this.entityManager = entityManager;
	}



@Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	HttpMethod[] unsopportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
	
	//products
       /*config.getExposureConfiguration().forDomainType(Product.class).withItemExposure((metdata,httpMethods) ->
		httpMethods.disable(unsopportedActions)).withCollectionExposure((metdata,httpMethods) ->
		httpMethods.disable(unsopportedActions));*/
	// config.addMapping("/**").allowedOrigins("http://localhost:8090").allowedMethods("PUT", "DELETE", "GET", "POST");
	//categories
	config.getExposureConfiguration().forDomainType(Category.class).withItemExposure((metdata,httpMethods) ->
	httpMethods.disable(unsopportedActions)).withCollectionExposure((metdata,httpMethods) ->
	httpMethods.disable(unsopportedActions));
	exposeIds(config);
}



private void exposeIds(RepositoryRestConfiguration config) {
	Set<EntityType<?>> entities=entityManager.getMetamodel().getEntities();
	
	List<Class> entityClasses= new ArrayList<>();
	
	for(EntityType tempEntity:entities)
	{
		entityClasses.add(tempEntity.getJavaType());
	}
	
	Class[] domainTypes=entityClasses.toArray(new Class[0]);
	config.exposeIdsFor(domainTypes);
}
}
