package sample;

/**
 * Created by DBarnett on 3/21/2017.
 */
public class Product extends Part{

    public int productID=0;

public  Product(int i){

    this.productID = 0;
    this.partID = 0;
    this.name = "";
    this.price = 0.0;
    this.inStock= 0;
    this.min = 0;
    this.max =0;

}

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    //observable Array List for Parts.



    //addPart(part)  return void

    //removePart(int):boolean

    //lookupPart(int):part

    //updatePart(int):void





}
