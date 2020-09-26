
package com.seanpetersgichia.bitcoinpriceindexapp.models.btcModel;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class BtcResponse {

    @SerializedName("bpi")
    private Btc mBpi;
    @SerializedName("chartName")
    private String mChartName;
    @SerializedName("disclaimer")
    private String mDisclaimer;
    @SerializedName("time")
    private Time mTime;

    public Btc getBpi() {
        return mBpi;
    }

    public void setBpi(Btc bpi) {
        mBpi = bpi;
    }

    public String getChartName() {
        return mChartName;
    }

    public void setChartName(String chartName) {
        mChartName = chartName;
    }

    public String getDisclaimer() {
        return mDisclaimer;
    }

    public void setDisclaimer(String disclaimer) {
        mDisclaimer = disclaimer;
    }

    public Time getTime() {
        return mTime;
    }

    public void setTime(Time time) {
        mTime = time;
    }

}
