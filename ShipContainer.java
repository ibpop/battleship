package model;

/**
 * Created by Mateo on 2016-06-03.
 */
public class ShipContainer {
    private static final int fiveFlagstaffCounter = 1;
    private static final int fourFlagstaffCounter = 1;
    private static final int threeFlagstaffCounter = 2;
    private static final int twoFlagstaffCounter = 2;
    private static final int oneFlagstaffCounter = 2;

    private Ship[] fiveFlagstaff;
    private Ship[] fourFlagstaff;
    private Ship[] threeFlagstaff;
    private Ship[] twoFlagstaff;
    private Ship[] oneFlagstaff;


    public ShipContainer() {
        fiveFlagstaff = createFlagStaffs(fiveFlagstaffCounter, 5);
        fourFlagstaff = createFlagStaffs(fourFlagstaffCounter, 4);
        threeFlagstaff = createFlagStaffs(threeFlagstaffCounter, 3);
        twoFlagstaff = createFlagStaffs(twoFlagstaffCounter, 2);
        oneFlagstaff = createFlagStaffs(oneFlagstaffCounter, 1);


    }

    private Ship[] createFlagStaffs(int shipCounter, int flagCounter) {
        Ship[] shipArray = new Ship[shipCounter];
        for(int i = 0; i < shipCounter; i++){
            shipArray[i] = new Ship(flagCounter);
        }
        return shipArray;
    }

}
