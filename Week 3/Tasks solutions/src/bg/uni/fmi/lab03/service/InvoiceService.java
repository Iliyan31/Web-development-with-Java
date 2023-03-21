package bg.uni.fmi.lab03.service;

import bg.uni.fmi.lab03.invoice.Invoice;
import bg.uni.fmi.lab03.repository.InvoiceRepository;

import java.util.List;

public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    public InvoiceService(InvoiceRepository invoiceRepository) {
        this.invoiceRepository = invoiceRepository;
    }

    public boolean addInvoice(Invoice invoice) {
        return invoiceRepository.addInvoice(invoice);
    }

    public List<Invoice> getInvoiceHistory() {
        return invoiceRepository.getInvoiceHistory();
    }

    public double calculateTotalPrice(Invoice invoice) {
        return invoice.getTotalPrice();
    }
}