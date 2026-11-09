package agh.po.lab4;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.Map;
import java.util.HashMap;

public class CodingBatTest {

    @Test
    public void testMapAB() {
        CodingBat cb = new CodingBat();

        Map<String, String> map1 = new HashMap<>();  //a i b
        map1.put("a", "Hi");
        map1.put("b", "There");
        Map<String, String> wynik1 = cb.mapAB(map1);
        assertEquals("HiThere", wynik1.get("ab"));

        Map<String, String> map2 = new HashMap<>();  //tytlko a
        map2.put("a", "Hi");
        Map<String, String> wynik2 = cb.mapAB(map2);
        assertFalse(wynik2.containsKey("ab"));

        Map<String, String> map3 = new HashMap<>();   //tylko b
        map3.put("b", "There");
        Map<String, String> wynik3 = cb.mapAB(map3);
        assertFalse(wynik3.containsKey("ab"));
    }

    @Test
    public void testWordLen() {
        CodingBat cb = new CodingBat();

        Map<String, Integer> wynik1 = cb.wordLen(new String[]{"kom", "kom", "bob", "bob"});
        assertEquals(Integer.valueOf(3), wynik1.get("kom"));
        assertEquals(Integer.valueOf(3), wynik1.get("bob"));
        assertEquals(2, wynik1.size());

        Map<String, Integer> wynik2 = cb.wordLen(new String[]{"krzesło", "ramka", "dywan", "ramka"});
        assertEquals(Integer.valueOf(7), wynik2.get("krzesło"));
        assertEquals(Integer.valueOf(5), wynik2.get("ramka"));
        assertEquals(Integer.valueOf(5), wynik2.get("dywan"));

        Map<String, Integer> wynik3 = cb.wordLen(new String[]{"coś", "coś", "coś", "opowieść"});
        assertEquals(Integer.valueOf(3), wynik3.get("coś"));
        assertEquals(Integer.valueOf(8), wynik3.get("opowieść"));
    }
}