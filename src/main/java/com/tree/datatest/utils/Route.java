package com.tree.datatest.utils;

public class Route {

    private String id;
    private String routeName;

    public Route(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


    public String getRouteName() {

        switch (id) {
            case "1":
                routeName = "P2M3";
                break;
            case "2":
                routeName = "P2M4";
                break;
            case "3":
                routeName = "P2M5";
                break;
            case "4":
                routeName = "P2M6";
                break;
            case "5":
                routeName = "P2M7";
                break;
            case "6":
                routeName = "P2M8";
                break;
            case "7":
                routeName = "P2M9";
                break;
            case "8":
                routeName = "P2M10";
                break;
            case "9":
                routeName = "P2M11";
                break;
            case "10":
                routeName = "P2M12";
                break;
            case "11":
                routeName = "P2M13";
                break;
            case "12":
                routeName = "P2M14";
                break;
            case "13":
                routeName = "P2M15";
                break;
            case "14":
                routeName = "P2M16";
                break;
            case "15":
                routeName = "P2M17";
                break;
            case "16":
                routeName = "P2M18";
                break;
            default:
                routeName = "";

        }
        return routeName;

    }

    public void setRouteName(String routeName) {
        this.routeName = routeName;
    }
}