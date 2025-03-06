package fptu.sep490.sample.controller;

import fptu.sep490.sample.service.ProductService;
import fptu.sep490.sample.viewmodel.ProductGetVm;
import fptu.sep490.sample.viewmodel.ProductPostVm;
import fptu.sep490.sample.viewmodel.ProductPutVm;
import jakarta.websocket.server.PathParam;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1/products")
public class ProductController {
    private final ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductGetVm>> getAllProducts() {
        return ResponseEntity.ok(productService.getAllProducts());
    }

    @GetMapping("/{productId}")
    public ResponseEntity<ProductGetVm> getProductById(@PathVariable(name = "productId") String productId) {
        return ResponseEntity.ok(productService.getProductById(productId));
    }

    @PostMapping
    public ResponseEntity<ProductGetVm> addProduct(@RequestBody ProductPostVm productPostVm) {
        return ResponseEntity.ok(productService.addProduct(productPostVm));
    }

    @PutMapping("/{productId}")
    public ResponseEntity<ProductGetVm> updateProduct(@PathVariable(name = "productId") String productId, @RequestBody ProductPutVm productPutVm) {
        return ResponseEntity.ok(productService.updateProduct(productId, productPutVm));
    }

    @DeleteMapping("/{productId}")
    public ResponseEntity<Void> deleteProduct(@PathVariable(name = "productId") String productId) {
        productService.deleteProduct(productId);
        return ResponseEntity.noContent().build();
    }
}
