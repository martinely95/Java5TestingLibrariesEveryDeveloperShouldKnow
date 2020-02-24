package eu.dreamix.main;

public class MockitoSpyExample {
    int high(int fingers) {
        return getFingers(fingers);
    }

    int getFingers(int fingers) {
        return fingers;
    }
}
