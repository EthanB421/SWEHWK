package hwk6;

import java.util.Iterator;

interface IterableByUser {
    Iterator<Message> iterator(User userToSearchWith);
}