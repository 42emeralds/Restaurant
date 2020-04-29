package restaurant;

import java.time.LocalDate;

public class MenuItem {
    private Double price;
    private String description;
    private String category;
    private LocalDate updated;

    public MenuItem(Double price, String description, String category, LocalDate updated) {
        this.price = price;
        this.description = description;
        this.category = category;
        this.updated = LocalDate.now();
    }

    public Double getPrice() {
        return price;
    }

    private void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    private void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    private void setCategory(String category) {
        this.category = category;
    }

    public LocalDate getUpdated() {
        return updated;
    }

    private void setUpdated(LocalDate updated) {
        this.updated = updated;
    }
}
