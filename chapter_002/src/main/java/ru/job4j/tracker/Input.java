package ru.job4j.tracker;

import java.util.List;

/**
 * Input.
 *
 * @author Maksym Mateiuk (maxymmateuk@gmail.com)
 * @version $Id$
 * @since 0.1
 */
public interface Input {
    String ask(String question);

    int ask(String question, List<Integer> range);
}
