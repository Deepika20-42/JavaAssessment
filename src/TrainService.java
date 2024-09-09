import java.util.*;

public class TrainService {
    private Map<String, Receipt> userTickets = new HashMap<>();
    private Map<String, String> seatAllocations = new HashMap<>();
    private int seatCounter = 1;

    // Purchase a ticket
    public Receipt purchaseTicket(User user) {
        String seat = allocateSeat();
        Receipt receipt = new Receipt("London", "France", user, seat, 20.0);
        userTickets.put(user.getEmail(), receipt);
        seatAllocations.put(user.getEmail(), seat);
        return receipt;
    }

    // View receipt
    public Receipt viewReceipt(String email) {
        return userTickets.get(email);
    }

    // View users by section
    public List<String> viewUsersBySection(String section) {
        List<String> usersInSection = new ArrayList<>();
        for (Map.Entry<String, String> entry : seatAllocations.entrySet()) {
            if (entry.getValue().startsWith(section)) {
                usersInSection.add(entry.getKey());
            }
        }
        return usersInSection;
    }

    // Remove a user
    public void removeUser(String email) {
        userTickets.remove(email);
        seatAllocations.remove(email);
    }

    // Modify seat
    public void modifySeat(String email, String newSeat) {
        if (userTickets.containsKey(email)) {
            seatAllocations.put(email, newSeat);
            userTickets.get(email).setSeat(newSeat);
        }
    }

    // Allocate seats alternately between Section A and Section B
    private String allocateSeat() {
        String section = (seatCounter % 2 == 0) ? "B" : "A";
        String seat = section + seatCounter;
        seatCounter++;
        return seat;
    }
}
