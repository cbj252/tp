package seedu.address.model.person;

import java.util.Set;

import seedu.address.model.module.Module;
import seedu.address.model.tag.Tag;
import seedu.address.model.tutorial.Tutorial;

/**
 * Represents a Professor in the address book.
 */
public class Professor extends Person {
    /**
     * Every field must be present and not null.
     */
    public Professor(Name name, Phone phone, Email email, Address address, Set<Tag> tags,
                     Set<Module> modules, Set<Tutorial> tutorials, StudentNumber studentNumber) {
        super(name, phone, email, address, tags, modules, tutorials, studentNumber);
    }
}