package fptu.sep490.sample.viewmodel;

import lombok.Builder;

@Builder
public record ProductGetVm(String productId, String productName) {
}
