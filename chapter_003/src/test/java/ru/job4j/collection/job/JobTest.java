package ru.job4j.collection.job;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {

    @Test
    public void whenComparatorAscByName() {
        Comparator<Job> compAscByName = new JobAscByName();
        int result = compAscByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, is(3));
    }

    @Test
    public void whenComparatorDescByName() {
        Comparator<Job> compDescByName = new JobDescByName();
        int result = compDescByName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, is(-3));
    }

    @Test
    public void whenComparatorAscByPriority() {
        Comparator<Job> compAscByPriority = new JobAscByPriority();
        int result = compAscByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, is(-1));
    }

    @Test
    public void whenComparatorDescByPriority() {
        Comparator<Job> compDescByPriority = new JobDescByPriority();
        int result = compDescByPriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(result, is(1));
    }

    @Test
    public void whenComparatorAscByNameAndAscPriority() {
        Comparator<Job> compAscNameAscPriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int result = compAscNameAscPriority.compare(
                new Job("Same name", 0),
                new Job("Same name", 1)
        );
        assertThat(result, is(-1));
    }

    @Test
    public void whenComparatorDescByNameAndAscPriority() {
        Comparator<Job> compDescNameAscPriority = new JobDescByName().thenComparing(new JobAscByPriority());
        int result = compDescNameAscPriority.compare(
                new Job("Same name", 0),
                new Job("Same name", 1)
        );
        assertThat(result, is(-1));
    }


    @Test
    public void whenComparatorDescByNameAndDescPriority() {
        Comparator<Job> compDescNameDescPriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int result = compDescNameDescPriority.compare(
                new Job("Same name", 0),
                new Job("Same name", 1)
        );
        assertThat(result, is(1));
    }

    @Test
    public void whenComparatorAscByNameAndDescPriority() {
        Comparator<Job> compAscNameDescPriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int result = compAscNameDescPriority.compare(
                new Job("Same name", 0),
                new Job("Same name", 1)
        );
        assertThat(result, is(1));
    }

    @Test
    public void whenComparatorAscByPriorityAndAscName() {
        Comparator<Job> compAscPriorityAscName = new JobAscByPriority().thenComparing(new JobAscByName());
        int result = compAscPriorityAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(result, is(3));
    }

    @Test
    public void whenComparatorDescByPriorityAndAscName() {
        Comparator<Job> compDescPriorityAscName = new JobDescByPriority().thenComparing(new JobAscByName());
        int result = compDescPriorityAscName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(result, is(3));
    }

    @Test
    public void whenComparatorDescByPriorityAndDescName() {
        Comparator<Job> compDescPriorityDescName = new JobDescByPriority().thenComparing(new JobDescByName());
        int result = compDescPriorityDescName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(result, is(-3));
    }

    @Test
    public void whenComparatorAskByPriorityAndDescName() {
        Comparator<Job> compAscPriorityDescName = new JobAscByPriority().thenComparing(new JobDescByName());
        int result = compAscPriorityDescName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 0)
        );
        assertThat(result, is(-3));
    }
}