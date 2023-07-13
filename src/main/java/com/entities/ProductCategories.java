import java.util.Date;

public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String code;

    @Column
    private String description;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;

    @OneToMany(mappedBy = "category")
    private List<Products> products;
}