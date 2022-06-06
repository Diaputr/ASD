package minggu12;
public class VacNode {
    VacNode prev, next;
    Vaccine data;

    VacNode(VacNode prev, Vaccine data, VacNode next) {
        this.prev = prev;
        this.next = next;
        this.data = data;
    }
}