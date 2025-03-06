package fptu.sep490.sample.mapper;

import fptu.sep490.sample.model.Product;
import fptu.sep490.sample.viewmodel.ProductGetVm;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductMapper {
    public ProductGetVm getProduct(Product product) {
        return ProductGetVm
                .builder()
                .productId(product.getProductId())
                .productName(product.getProductName())
                .build();
    }
    public List<ProductGetVm> getProducts(List<Product> products) {
        return products.stream().map(this::getProduct).toList();
    }

    public Product toProduct(String productName) {
        return Product
                .builder()
                .productName(productName)
                .build();
    }
}
