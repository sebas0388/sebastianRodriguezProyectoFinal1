/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author SebastianR
 */
public class survey {
    
    String service, solve, recommend;

    public survey(String service, String solve, String recommend) {
        this.service = service;
        this.solve = solve;
        this.recommend = recommend;
    }

    public void setService(String service) {
        this.service = service;
    }

    public void setSolve(String solve) {
        this.solve = solve;
    }

    public void setRecommend(String recommend) {
        this.recommend = recommend;
    }

    public String getService() {
        return service;
    }

    public String getSolve() {
        return solve;
    }

    public String getRecommend() {
        return recommend;
    }
    
    
    
}
