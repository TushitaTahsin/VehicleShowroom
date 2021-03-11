/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vehicleshowroom;

/**
 *
 * @author pc
 */
public abstract class AVehicle {
    private String modelNumber;
    private String engineType;
    private int enginePower;
    private int tireSize;
    private String vehicleType;
    
    public AVehicle(String modelNumber, String engineType, int enginePower, int tireSize, String vehicleType){
        this.modelNumber = modelNumber;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.tireSize = tireSize;
        this.vehicleType = vehicleType;
    }

    public String getModelNumber() {
        return modelNumber;
    }

    public String getEngineType() {
        return engineType;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public int getTireSize() {
        return tireSize;
    }

    public String getVehicleType() {
        return vehicleType;
    }    
   
    @Override
    public String toString(){
        return "mn: "+ this.modelNumber + "  et: " + this.engineType + "  ep:  "+this.enginePower + 
                "  ts:  "+this.tireSize + "  vt:  "  + this.vehicleType;
    }
}
