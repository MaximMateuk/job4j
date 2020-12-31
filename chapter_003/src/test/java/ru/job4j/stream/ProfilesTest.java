package ru.job4j.stream;

import java.util.Arrays;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ProfilesTest {

    List<Profile> profileList = new ArrayList<>();

    @Before
    public void setUp() {
        profileList.add(new Profile(new Address("New York", "Avenue", 10, 8)));
        profileList.add(new Profile(new Address("LosAngeles", "51-street", 1, 2)));
        profileList.add(new Profile(new Address("Miami", "Beach", 50, 7)));
        profileList.add(new Profile(new Address("Washington", "Lincoln", 20, 4)));
    }

    @Test
    public void shouldCollectFourAddress() {
        List<Address> actualAddressList = Profiles.collect(profileList);
        List<Address> expectedAddressList = Arrays.asList(
                new Address("New York", "Avenue", 10, 8),
                new Address("LosAngeles", "51-street", 1, 2),
                new Address("Miami", "Beach", 50, 7),
                new Address("Washington", "Lincoln", 20, 4)
                );
        assertThat(expectedAddressList, is(actualAddressList));
    }
}