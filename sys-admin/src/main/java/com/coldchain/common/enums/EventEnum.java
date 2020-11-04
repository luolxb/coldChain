package com.coldchain.common.enums;

public enum EventEnum {
    ReeferSwitchOn("ReeferSwitchOn","冷藏启动",0),
    ReeferSwitchOff("ReeferSwitchOff","冷藏关闭",0),

    DeviceConnected("DeviceConnected","设备连接",0),
    DeviceDisconnected("DeviceDisconnected","设备断开连接",0),

    ControllerOnline("ControllerOnline","控制器连接",0),
    ControllerOffline("ControllerOffline","控制器关闭连接",0),

    BatteryPowerOn("BatteryPowerOn","启动电池电源",0),
    ACPowerOn("ACPowerOn","启动电池电源",0),

    Devicereset("Devicereset","设备重置",0),

    EnteringGeoFence("EnteringGeoFence","进入地理围栏",0),
    ExitingGeoFence("ExitingGeoFence","退出地理围栏",0),

    LowAcVoltage("LowAcVoltage","交流电压过低",1),
    HighACVoltage("HighACVoltage","交流电压过高",1),

    SimCardChanged("SimCardChanged","SIM卡更换",0),
    AccelerometerValueOutOfRange("AccelerometerValueOutOfRange","加速度计值超出范围",1),

    PTIStarted("PTIStarted","PTI启动",0),
    PTIstopped("PTIstopped","PTI停止",0),
    WakeUpButton("WakeUpButton","按钮唤醒",0),
    TempShutdown("TempShutdown","临时关闭",0),
    TempOktoWake("TempOktoWake","临时唤醒",0),
    DeviceIsMoving("DeviceIsMoving","设备移动",0),
    DeviceIsStationary("DeviceIsStationary","设备静止",0),
    ImpactDetected("ImpactDetected","检测收到影响",1),
    HighOperatingTemp("HighOperatingTemp","操作温度过高",1),
    LowOperatingTemp("LowOperatingTemp","操作温度过低",1),
    ExtremeHighOperatingTemp("ExtremeHighOperatingTemp","工作温度过高",1),
    ExtremeLowOperatingTemp("ExtremeLowOperatingTemp","工作温度过低",1),
    LowBatteryShutdown("LowBatteryShutdown","电池电量不足关机",1),
    DeviceInstallMode("DeviceInstallMode","设备安装方式",0),
    ScheduledReport("DeviceInstallMode","报表",0),
    MicroAlarm("MicroAlarm","微报警",1),
    ContainerIDChange("ContainerIDChange","集装箱编号改变",0),
    ControllerSerialNumChange("ControllerSerialNumChange","控制器序列号更改",0),
    HumiditySetpointChange("HumiditySetpointChange","湿度设定值变化",0),
    LowBattery("LowBattery","电池电量低",1),
    DeviceMsgQIsFull("DeviceMsgQIsFull","设备信息已满",0),
    ControllerError("ControllerError","控制器异常",1);



    private  String code;

    private  String value;

    private int status;

    EventEnum(String code,String value,int status){
        this.code = code;
        this.value = value;
        this.status = status;
    }
    public String getCode() {
        return code;
    }


    public String getValue() {
        return value;
    }

    public static String getData(String desc) {
        for (EventEnum en : EventEnum.values()) {
            if(en.name().equals(desc)){
                return en.name();
            }
        }
        return null;
    }

    public static String getInfo(String desc) {
        for (EventEnum en : EventEnum.values()) {
            if(en.name().equals(desc)){
                return en.value;
            }
        }
        return null;
    }
    public int getStatus() {
        return status;
    }
    public static int getDataStatu(String desc) {
        for (EventEnum en : EventEnum.values()) {
            if(en.name().equals(desc)){
                return en.status;
            }
        }
        return 0;
    }
    public static String getEventStrByStatus(int status) {

        if(2 == status){
            return null;
        }
        String eventStr = "";
        for (EventEnum en : EventEnum.values()) {
            if(en.getStatus() == status){
                eventStr += en.name()+"|";
            }
        }
        if(1 < eventStr.length() ){
            eventStr = eventStr.substring(0,eventStr.length()-1);
        }else{
            eventStr = null;
        }

        if(3 == status){
            eventStr = ImpactDetected.name()
                    +"|"+MicroAlarm.name()
                    +"|"+ControllerError.name();
        }
        return eventStr;
    }
}
