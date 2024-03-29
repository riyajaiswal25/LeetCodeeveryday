class Solution {
    public int garbageCollection(String[] garbage, int[] travel) {
        long totalMinutes = 0;  // Total minutes needed for garbage collection
        long currentTravelTime = 0;  // Current travel time

        // Add the initial minutes required to collect garbage at the first house
        totalMinutes += garbage[0].length();
        
        // Keep track of the last occurrence of each type of garbage
        List<Integer> lastGarbageIndices = new ArrayList<>(List.of(-1, -1, -1)); 

        // Iterate through each house starting from the second house
        for (int houseIndex = 1; houseIndex < garbage.length; houseIndex++) {
            // Add the minutes required to collect garbage at the current house
            totalMinutes += garbage[houseIndex].length();

            // Update the indices of the last occurrence of each type of garbage
            if (garbage[houseIndex].contains("M")) {
                lastGarbageIndices.set(0, houseIndex - 1);
            }
            if (garbage[houseIndex].contains("P")) {
                lastGarbageIndices.set(1, houseIndex - 1);
            }
            if (garbage[houseIndex].contains("G")) {
                lastGarbageIndices.set(2, houseIndex - 1);
            }
        }

        // Iterate through each travel segment
        for (int travelIndex = 0; travelIndex < travel.length; travelIndex++) {
            // Add the current travel time
            currentTravelTime += travel[travelIndex];

            // Add the minutes required to collect garbage if a garbage truck is at the corresponding house
            for (int truckIndex = 0; truckIndex < 3; truckIndex++) {
                if (lastGarbageIndices.get(truckIndex) == travelIndex) {
                    totalMinutes += currentTravelTime;
                }
            }
        }

        return (int) totalMinutes;
    }
}