import java.util.Date;
package com.entities;

public class SalesData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne()
    @JoinColumn(name = "seller_id")
    private List<Users> sellers;

    @ManyToOne()
    @JoinColumn(name = "buyer_id")
    private List<Users> buyers;

    @Column
    @Temporal(TemporalType.DATE)
    private Date createdAt;

    @Column
    @Temporal(TemporalType.DATE)
    private Date updatedAt;
}