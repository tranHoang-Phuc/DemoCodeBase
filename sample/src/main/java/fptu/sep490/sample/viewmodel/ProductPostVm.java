package fptu.sep490.sample.viewmodel;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import org.hibernate.validator.constraints.Length;

@Builder
public record ProductPostVm(@NotNull @Length(min = 5) String productName) {
}
