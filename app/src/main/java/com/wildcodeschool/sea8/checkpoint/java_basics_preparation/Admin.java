package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

import java.time.LocalDate;

public class Admin extends ITPerson {

    protected LocalDate lastCertified;

    public Admin(String name, LocalDate lastCertified) {
        super(name);
        this.lastCertified = lastCertified;
    }

    public void setLastCertified(LocalDate lastCertified) {
        this.lastCertified = lastCertified;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Admin here.
        //  copy aus der Aufgabe: `Admin` are `ITPerson` with Read access always, but Write access to Resources if they are certified, 
        // ie. the `lastCertified` date is less than one year ago.
        
      

        return true;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        // LocalDate now = LocalDate.now();

    
        // Arrange
        boolean isCertified = LocalDate.now().minusYears(1).isBefore(this.lastCertified);
        return isCertified;

    
    }
}
