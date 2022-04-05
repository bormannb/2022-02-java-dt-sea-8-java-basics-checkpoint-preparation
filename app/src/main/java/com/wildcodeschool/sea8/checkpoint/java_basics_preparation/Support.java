package com.wildcodeschool.sea8.checkpoint.java_basics_preparation;

public class Support extends ITPerson {

    protected int level;

    public Support(String name, int level) {
        super(name);
        this.level = level;
    }

    @Override
    public boolean hasReadAccess() {
        // Add logic to evaluate Read access for Support here.

        //level0 cannot read or write; level 1 can read 
        //ITPerson supportLevel1 = 1;
        
        if(level==0){
            return false;
        }else if (level==1){
            return true;
        }else{
            return true;
        }
        
    }

    @Override
    public boolean hasWriteAccess() {
        // Add logic to evaluate Write access for Admin here.
        // level 2 can read or write
        // frage nach den leveln ab

        if(level==0){
            return false;
        }else if (level==1){
            return false;
        }else{
            return true;
        }

    }
}
