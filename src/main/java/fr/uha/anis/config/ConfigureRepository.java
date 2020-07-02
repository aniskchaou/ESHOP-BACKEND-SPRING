package fr.uha.anis.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

import fr.uha.anis.entities.Category;
import fr.uha.anis.entities.Product;

@Configuration
public class ConfigureRepository implements RepositoryRestConfigurer {
@Override
public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
	HttpMethod[] unsopportedActions= {HttpMethod.PUT,HttpMethod.POST,HttpMethod.DELETE};
	
	//products
	config.getExposureConfiguration().forDomainType(Product.class).withItemExposure((metdata,httpMethods) ->
		httpMethods.disable(unsopportedActions)).withCollectionExposure((metdata,httpMethods) ->
		httpMethods.disable(unsopportedActions));
	
	//categories
	config.getExposureConfiguration().forDomainType(Category.class).withItemExposure((metdata,httpMethods) ->
	httpMethods.disable(unsopportedActions)).withCollectionExposure((metdata,httpMethods) ->
	httpMethods.disable(unsopportedActions));
}
}
