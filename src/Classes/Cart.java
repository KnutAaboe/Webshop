package Classes;

import java.util.*;

public class Cart {
    //    private String id;
    private List<Item> items;

    public Cart() {
//        this.id=id;
        items = new ArrayList<Item>();
    }

    public Cart(List<Item> items) {
        this.items = items;
    }

    public void addItem(String newItem) {
        items.add(new Item(newItem));

    }

    //returning a item
    public Item getItem(Item newItem) {
        Item item = null;
        for (Item i : items) {
            if (i.equals(newItem)) {
                item = newItem;
                break;
            }
        }
        return item;
    }

    //Item itemExist check
    public boolean itemExist(String newItem) {
        boolean exist = false;
        for (Item i : items) {
            if (i.getName().toUpperCase().equals(newItem.toUpperCase()) && !(newItem.equals(" "))) {
                exist = true;
                break;
            }
        }
        return exist;
    }

    //    add units on a item
    public void addUnit(String item) {
        for (Item i : items) {
            if (i.getName().toUpperCase().equals(item.toUpperCase())) {
                i.unit++;
            }
        }
    }

    public void removeUnit(String item) {
        Item delete = null;
        for (Item i : items) {
            if ((i.getName().toUpperCase().equals(item.toUpperCase()))) {
                i.unit--;
                if (i.getUnit() == 0) {
                    delete = i;
                }


            }
        }
        items.remove(delete);
    }


    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

}










