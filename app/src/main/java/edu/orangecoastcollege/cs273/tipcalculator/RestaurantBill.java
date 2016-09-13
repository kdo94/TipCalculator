package edu.orangecoastcollege.cs273.tipcalculator;

/**
 * Created by kdo94 on 9/8/2016.
 */
public class RestaurantBill {
    private double mAmount;
    private double mTipPercent;
    private double mTipAmount;
    private double mTotalAmount;

    public RestaurantBill(){
        mAmount = 0.0;
        mTipAmount = 0.0;
        mTipPercent = 0.0;
        mTotalAmount = 0.0;
    }

    public RestaurantBill(double mTotalAmount, double mTipAmount) {
        this.mTotalAmount = mTotalAmount;
        this.mTipAmount = mTipAmount;
        recalculateAmount();
    }

    public double getAmount() {
        return mAmount;
    }

    public void setAmount(double mAmount) {
        this.mAmount = mAmount;
        recalculateAmount();
    }

    public double getTipPercent() {
        return mTipPercent;
    }

    public void setTipPercent(double mTipPercent) {
        this.mTipPercent = mTipPercent;
        recalculateAmount();
    }

    public double getTipAmount() {
        return mTipAmount;
    }


    public double getTotalAmount() {
        return mTotalAmount;
    }

    private void recalculateAmount(){
        mTipAmount = mTotalAmount * mTipPercent;
        mTotalAmount = mAmount + mTipAmount;
    }
}
