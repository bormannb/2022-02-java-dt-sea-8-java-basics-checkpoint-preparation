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
        // `Admin` are `ITPerson` with Read access always, but Write access to Resources if they are certified, 
        // ie. the `lastCertified` date is less than one year ago.
        
        // Arrange
        LocalDate lastCertificationOneMonthAgo = LocalDate.now().minusMonths(1);
        ITPerson adminValid = new Admin("superadmin_valid", lastCertificationOneMonthAgo);

        // Act + Assert
        adminValid.hasReadAccess(), "Admin should have read access");
        

        // Arrange
        LocalDate lastCertificationOneYearAndOneDayAgo = LocalDate.now().minusYears(1).minusDays(1);
        ITPerson adminInvalid = new Admin("superadmin_invalid", lastCertificationOneYearAndOneDayAgo);

        // Act + Assert
        adminInvalid.hasReadAccess(), "Invalid Admin should always have read access");
        


        return false;
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.

        // Arrange
        LocalDate lastCertificationOneMonthAgo = LocalDate.now().minusMonths(1);
        ITPerson adminValid = new Admin("superadmin_valid", lastCertificationOneMonthAgo);

        adminValid.hasWriteAccess(), "Admin should have write access");
        adminInvalid.hasWriteAccess(), "Invalid Admin should have no write access");
        return false;
    }
}
