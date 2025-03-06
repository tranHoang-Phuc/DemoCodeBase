package fptu.sep490.sample.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Table(name = "product")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Product extends AbstractAuditEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "product_id")
    String productId;
    @Column(name = "product_name")
    String productName;
}
