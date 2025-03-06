package fptu.sep490.sample.service;

import fptu.sep490.commonlibrary.exception.NotFoundException;
import fptu.sep490.sample.mapper.ProductMapper;
import fptu.sep490.sample.repository.ProductRepository;
import fptu.sep490.sample.utils.Constants;
import fptu.sep490.sample.viewmodel.ProductGetVm;
import fptu.sep490.sample.viewmodel.ProductPostVm;
import fptu.sep490.sample.viewmodel.ProductPutVm;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ProductService {
    private final ProductRepository productRepository;
    private final ProductMapper productMapper;

    public List<ProductGetVm> getAllProducts() {
        return productMapper.getProducts(productRepository.findAll());
    }

    public ProductGetVm getProductById(String id) {
        return productMapper.getProduct(productRepository.findById(id).orElseThrow(
                () -> new NotFoundException(Constants.ErrorCode.NOT_FOUND_PRODUCT, id)));
    }

    public ProductGetVm addProduct(ProductPostVm productPostVm) {
        return productMapper.getProduct(productRepository.save(productMapper.toProduct(productPostVm.productName())));
    }

    public ProductGetVm updateProduct(String productId, ProductPutVm productPutVm) {
        var product = productRepository.findById(productId).orElseThrow(
                () -> new NotFoundException(Constants.ErrorCode.NOT_FOUND_PRODUCT, productId));
        product.setProductName(productPutVm.productName());
        return productMapper.getProduct(productRepository.save(product));
    }

    public void deleteProduct(String productId) {
        productRepository.deleteById(productId);
    }
}
