package bg.fmi.course.WebJavaWeek04.task2.repository;

import bg.fmi.course.WebJavaWeek04.task1.model.invoice.Invoice;
import org.springframework.stereotype.Repository;

import java.util.LinkedList;
import java.util.List;

@Repository
public class InvoiceRepository {
    private final List<Invoice> history = new LinkedList<>();

//    public InvoiceRepository(List<Invoice> history) {
//        this.history = history;
//    }

    public boolean addInvoice(Invoice invoice) {
        if (invoice == null) {
            throw new IllegalArgumentException("The invoice cannot be null!");
        }

        return history.add(invoice);
    }

    public List<Invoice> getInvoiceHistory() {
        return history;
    }
}
