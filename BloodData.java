/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package BlookBank;

/**
 *
 * @author jhnnn
 */

class BloodData {
    private String bloodType;
    private String rhFactor;

    public BloodData() {
        this.bloodType = "O";
        this.rhFactor = "+";
    }

    public BloodData(String bt, String rh) {
        this.bloodType = bt;
        this.rhFactor = rh;
    }

    public void display() {
        System.out.println(bloodType + rhFactor + " is added to the blood bank.");
    }
}
