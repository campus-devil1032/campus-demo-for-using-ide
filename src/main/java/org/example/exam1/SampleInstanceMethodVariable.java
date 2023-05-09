package org.example;

class Vehicle {
    private int num;
    private double gas;

    public Vehicle() {
        num = 0;
        gas = 0.0;
        System.out.println("Vehicle이 만들어졌습니다.");
    }

    public void setVehicle(int num, double gas) {
        this.num = num;
        this.gas = gas;
        System.out.println("차량번호 num " + num + "으로 바꾸고, 연료 양을 " + gas + "로 바꿨습니다.");
    }

    public void show() {
        System.out.println("차량 번호는 " + num + " 입니다.");
        System.out.println("가스는 " + gas + " 입니다.");
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }
}

public class SampleInstanceMethodVariable {

    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle();
        vehicle1.setVehicle(111, 10.9);
        vehicle1.show();

        Vehicle vehicle2 = new Vehicle();
        vehicle2.setVehicle(2000, 200.7);
        vehicle2.show();
    }


}

