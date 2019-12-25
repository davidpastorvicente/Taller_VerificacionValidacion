import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AgendaTest {
    Agenda ag;
    Entry e, f;

    @BeforeEach
    void before() {
        e = new Entry();
        e.setName("David");
        f = new Entry();
        f.setName("Alex");

        ag = new Agenda();
    }

    @Test
    void addEntryCamino1() {
        assertEquals(ag.addEntryV2(e), false);
        assertEquals("A - H - J", ag.traza);
    }

    @Test
    void addEntryCamino2() {
        assertEquals(ag.addEntry(f), true);
        assertEquals("A - H - I", ag.traza);
    }

    @Test
    void addEntryCamino3() {
        ag.addEntryV3(e);

        assertEquals(ag.addEntryV3(f), true);
        assertEquals("A - B - C - H - I", ag.traza);
    }

    @Test
    void addEntryCamino4() {
        ag.addEntryV4(f);

        assertEquals(ag.addEntryV4(e), false);
        assertEquals("A - B - C - D - H - J", ag.traza);
    }

    @Test
    void addEntryCamino5() {
        ag.addEntry(e);

        assertEquals(ag.addEntry(f), true);
        assertEquals("A - B - C - D - E - G - C - H - I", ag.traza);
    }

    @Test
    void addEntryCamino6() {
        ag.addEntry(e);

        assertEquals(ag.addEntry(e), false);
        assertEquals("A - B - C - D - E - F - G - C - H - J", ag.traza);
    }
}