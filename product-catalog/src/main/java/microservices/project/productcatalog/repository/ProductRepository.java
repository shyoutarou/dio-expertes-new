package microservices.project.productcatalog.repository;

import microservices.project.productcatalog.model.Product;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface ProductRepository extends ElasticsearchRepository<Product, Integer> {
}