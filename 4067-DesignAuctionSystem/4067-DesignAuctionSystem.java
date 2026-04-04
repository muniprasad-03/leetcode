// Last updated: 04/04/2026, 23:27:43
class AuctionSystem {
    
    private static class Bid {
        int userId, amt;
        Bid(int userId, int amt) {
            this.userId = userId;
            this.amt = amt;
        }
    }
    private class ItemData {
        Map<Integer, Integer> userAmtMap = new HashMap<>();
        TreeSet<Bid> sortedBids = new TreeSet<>(
            (a,b) -> {
                if(a.amt != b.amt) {
                    return Integer.compare(b.amt, a.amt);
                }
                return Integer.compare(b.userId, a.userId);
            });
        void addOrUpdate(int userId, int amt) {
            if(userAmtMap.containsKey(userId)) {
                int oldAmt = userAmtMap.get(userId);
                sortedBids.remove(new Bid(userId, oldAmt));
            }
            userAmtMap.put(userId, amt);
            sortedBids.add(new Bid(userId, amt));
        }
        void remove(int userId) {
            if(userAmtMap.containsKey(userId)) {
                int oldAmt = userAmtMap.remove(userId);
                sortedBids.remove(new Bid(userId, oldAmt));
            }
        }
        int getTop() {
            if(sortedBids.isEmpty()) return -1;
            return sortedBids.first().userId;
        }
    }
    private Map<Integer, ItemData> itemMap;
    public AuctionSystem() {
        itemMap = new HashMap<>();
    }
    
    public void addBid(int userId, int itemId, int bidAmount) {
        itemMap.putIfAbsent(itemId, new ItemData());
        itemMap.get(itemId).addOrUpdate(userId, bidAmount);
    }
    
    public void updateBid(int userId, int itemId, int newAmount) {
        itemMap.get(itemId).addOrUpdate(userId, newAmount);
    }
    
    public void removeBid(int userId, int itemId) {
        itemMap.get(itemId).remove(userId);
    }
    
    public int getHighestBidder(int itemId) {
        ItemData item = itemMap.get(itemId);
        if(item == null) return -1;
        return item.getTop();
    }
}

/**
 * Your AuctionSystem object will be instantiated and called as such:
 * AuctionSystem obj = new AuctionSystem();
 * obj.addBid(userId,itemId,bidAmount);
 * obj.updateBid(userId,itemId,newAmount);
 * obj.removeBid(userId,itemId);
 * int param_4 = obj.getHighestBidder(itemId);
 */