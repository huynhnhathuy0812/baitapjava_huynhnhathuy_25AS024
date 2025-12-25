package baitap71;

import java.util.Date;

public class TestDiscountSystem {
    public static void main(String[] args) {
        Visit v1 = new Visit("An", new Date());
        v1.getCustomer().setMember(true);
        v1.getCustomer().setMemberType("Premium");
        v1.setServiceExpense(100.0);
        v1.setProductExpense(100.0);

        System.out.println(v1);
        // Premium: Giảm 20% dịch vụ (80) + Giảm 10% sản phẩm (90) = 170
        System.out.println("Total expense for " + v1.getName() + ": " + v1.getTotalExpense());

        Visit v2 = new Visit("Binh", new Date());
        v2.getCustomer().setMember(true);
        v2.getCustomer().setMemberType("Silver");
        v2.setServiceExpense(100.0);
        v2.setProductExpense(100.0);
        // Silver: Giảm 10% dịch vụ (90) + Giảm 10% sản phẩm (90) = 180
        System.out.println("\nTotal expense for " + v2.getName() + ": " + v2.getTotalExpense());
    }
}
