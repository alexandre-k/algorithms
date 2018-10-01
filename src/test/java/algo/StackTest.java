package algo;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StackTest {
    @Test
    @DisplayName("initialization")
    public void testInit() {
        Stack stack = new Stack();
        assertEquals(stack.last, null);
        assertEquals(stack.first, null);
    }

    @Test
    @DisplayName("push new item")
    public void testPush() {
        Stack stack = new Stack();
        stack.push("hello");
        stack.push("world");
        stack.push("good");
        stack.push("bye");
        assertEquals("hello", stack.first.value);
        assertEquals("world", stack.first.next.value);
        assertEquals("good", stack.first.next.next.value);
        assertEquals("bye", stack.last.value);
        assertEquals("good", stack.last.previous.value);
        assertEquals("world", stack.last.previous.previous.value);
        assertEquals("hello", stack.last.previous.previous.previous.value);
        // assertEquals(stack.last.value);
    }

    @Test
    @DisplayName("pop item")
    public void testPop() {
        Stack stack = new Stack();
        stack.push("hello");
        stack.push("world");
        stack.push("good");
        stack.push("bye");
        assertEquals("bye", stack.pop().value);
        assertEquals("good", stack.pop().value);
        assertEquals("world", stack.pop().value);
        assertEquals("hello", stack.pop().value);
        assertEquals(null, stack.first);
        assertEquals(null, stack.last);
    }

    @Test
    @DisplayName("size stack")
    public void testSize() {
        Stack stack = new Stack();
        stack.push("hello");
        stack.push("world");
        stack.push("good");
        stack.push("bye");
        assertEquals(4, stack.size);
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        assertEquals(0, stack.size);
        // assertEquals(stack.last.value);
    }
}
