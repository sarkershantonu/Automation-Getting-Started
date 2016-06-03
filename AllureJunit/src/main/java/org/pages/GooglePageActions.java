package org.pages;

/**
 * Created by shantonu on 3/12/16.
 */
public class GooglePageActions {
    private static GooglePage googlePage;
    public GooglePageActions(GooglePage aPage){
        this.googlePage = aPage;
    }
    public void search(String text){

    }

    public void NoNeedSearch(){
        googlePage.clickImFeelingLuckyButton();
    }

}
