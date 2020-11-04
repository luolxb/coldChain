package com.common.service;

public class ColdChainService {
    public String sayWhat;
    public String toWho;
    public ColdChainService(String sayWhat_, String toWho_){
        sayWhat = sayWhat_;
        toWho = toWho_;
    }
    public String say(){
        return sayWhat + "!  " + toWho;
    }
}
