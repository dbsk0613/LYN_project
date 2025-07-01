package com.yourname.ecommerce.domain;

public class Product {
    private int id;
    private String name;
    private int price;

    // �� �⺻ ������
    public Product() {}

    // �� �Ķ���� 3��¥�� ������ (�̰� �ʿ��ߴ� �κ�)
    public Product(int id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // �� getters / setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getPrice() { return price; }
    public void setPrice(int price) { this.price = price; }
}
