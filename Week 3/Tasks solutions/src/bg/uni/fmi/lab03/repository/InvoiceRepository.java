package bg.uni.fmi.lab03.repository;

import bg.uni.fmi.lab03.invoice.Invoice;

import java.util.List;

public class InvoiceRepository {
    private final List<Invoice> history;

    public InvoiceRepository(List<Invoice> history) {
        this.history = history;
    }

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
