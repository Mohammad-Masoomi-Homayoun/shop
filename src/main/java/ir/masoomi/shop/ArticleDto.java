package ir.masoomi.shop;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor(staticName = "of")
public class ArticleDto implements Serializable {

    private Long id;
    private String name;
    private int count;
    private int price;

    @Override
    public String toString() {
        return "ID: " + this.id + ", Name: " + this.name + ", Count: " + this.count + ", Price: " + this.price;
    }
}
