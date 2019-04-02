package seedu.address.model;

import javafx.beans.Observable;
import javafx.collections.ObservableList;
import seedu.address.model.person.Person;
import seedu.address.model.request.Request;

import java.util.List;

/**
 * Unmodifiable view of a personnel database
 */
public interface ReadOnlyPersonnelDatabase extends Observable {

    /**
     * Returns an unmodifiable view of the persons list.
     * This list will not contain any duplicate persons.
     */
    ObservableList<Person> getPersonList();

    /**
     * Returns an unmodifiable view of the duty duty.
     * This duty will not contain any duplicate duties.
     */
    DutyCalendar getDutyCalendar();

    /**
     * Returns a list of requests.
     */
    List<Request> getRequestList();
}
