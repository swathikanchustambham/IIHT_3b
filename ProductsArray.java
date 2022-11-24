class Product {​​​​​

    private int id;

    private String name;

    private float price;     
public Product(int id, String name, float price) {​​​​​

        this.id = id;

        this.name = name;

        this.price = price;

    }​​​​​     public int getId() {​​​​​

        return id;

    }​​​​​     public void setId(int id) {​​​​​

        this.id = id;

    }​​​​​     public String getName() {​​​​​

        return name;

    }​​​​​     public void setName(String name) {​​​​​

        this.name = name;

    }​​​​​     public float getPrice() {​​​​​

        return price;

    }​​​​​ public void setPrice(float price) {​​​​​
this.price = price;
}​​​​​​​​​​

}​​​​​

Public class ProductsArray{
    static Products p[]=new Products[3];
    public static void main(String args[]){
        reverse();
        for(Products prod : p){
            System.out.println(prod.toString());
        }
static void reverseOfProducts(){
    p[0] = new Product(1, "Prod1", 12.5f);
    p[1] = new Product(2, "Prod2", 9.5f);
    p[2] = new Product(3, "Prod3", 6.5f);
    int len = p.length;
    for (int i = 0; i < len / 2; i++) {​​​​​

            Product tparr = null;

            tparr = p[i];

           p[i] = p[len - i - 1];

            parr[len - i - 1] = tparr;

        }
}​​​​​
}
}