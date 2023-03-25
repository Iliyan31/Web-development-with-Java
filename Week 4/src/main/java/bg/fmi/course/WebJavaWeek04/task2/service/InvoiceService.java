package bg.fmi.course.WebJavaWeek04.task2.service;

import bg.fmi.course.WebJavaWeek04.task1.model.invoice.Invoice;
import bg.fmi.course.WebJavaWeek04.task1.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvoiceService {
    private final InvoiceRepository invoiceRepository;

    @Autowired
    public InvoiceService(@Qualifier("invoiceRepository") InvoiceRepository invoiceRepository) {
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