package ir.seefa.tutorial.spring.service;

import ir.seefa.tutorial.spring.entity.ContactEntity;
import ir.seefa.tutorial.spring.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * @author Saman Delfani
 * @version 1.0
 * @since 10 Sep 2020 T 00:14:25
 */
// 1. read spring-core-tutorial and spring-hibernate-mvc-tutorial codes before starting this project because primary annotations and hibernate logic explained there
@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository contactRepository;

    @Override
    @Transactional
    public void addOrUpdateContact(ContactEntity contact) {
        contactRepository.save(contact);
    }

    @Override
    public void delete(int contactId) {
        boolean existContact = contactRepository.existsById(contactId);
        if (existContact) {
            ContactEntity contact = contactRepository.getOne(contactId);
            contactRepository.delete(contact);
        }
    }

    @Override
    public Optional<ContactEntity> get(int contactId) {
        return contactRepository.findById(contactId);
    }

    @Override
    public List<ContactEntity> getAll() {
        return contactRepository.findAll();
    }

    @Override
    public Page<ContactEntity> getAllWithPagingAndSorting(int page, int count) {
        int numberOfItemPerPage = count >= 5 && count <= 20 ? count : 10;
        Pageable pageable = PageRequest.of(page, numberOfItemPerPage, Sort.by("name", "family").ascending());
        return contactRepository.findAll(pageable);
    }

    @Override
    public List<ContactEntity> findByNameAndFamily(String name, String family) {
        return contactRepository.findAllByNameAndFamily(name, family);
    }

    @Override
    public List<ContactEntity> findByPhone(String phone) {
        return contactRepository.findAllByPhone(phone);
    }
}
