package org.example.exam1;

import org.example.exam1.exceptions.InvalidGasVolumeException;

class CarWithPrivateMember {
    private int carNumber;
    private double gas;

    public CarWithPrivateMember(int carNumber, double gas) {
        // this();
        System.out.println("인수 없는 생성자를 통해 초기 값을 설정했습니다.");

    }

    public CarWithPrivateMember() {

    }

    void show() {
        System.out.println("차량번호는 " + carNumber + " 입니다.");
        System.out.println("연료는 " + gas + " 남았습니다.");

    }

    public int getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(int carNumber) {
        System.out.println("setCarNumber(int)를 통해 carNumber 변경을 시도합니다. - this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
        this.carNumber = carNumber;
        System.out.println("setCarNumber(int)를 통해 carNumber 을 바꿨습니다. - this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
    }

    public void setCarNumber(double gas) {
        System.out.println("setCarNumber(double)를 통해 가스양을 변경을 시도합니다. - this.gas =" + this.gas + ", gas=" + gas);
        this.gas = gas;
        System.out.println("setCarNumber(double)를 통해 가스양을 바꿨습니다 - this.gas =" + this.gas + ", gas=" + gas);
    }

    public void setCarNumber(int carNumber, double gas) {
        System.out.println("setCarNumber(double, int)를 통해 가스양을 변경을 시도합니다. - this.gas =" + this.gas + ", gas=" + gas + "- this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
        this.gas = gas;
        this.carNumber = carNumber;
        System.out.println("setCarNumber(double, int)를 통해 가스양을 바꿨습니다 - this.gas =" + this.gas + ", gas=" + gas + "- this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
    }

    public void setCarNumber(double gas, int carNumber) {
        System.out.println("setCarNumber(double, int)를 통해 가스양을 변경을 시도합니다. - this.gas =" + this.gas + ", gas=" + gas + "- this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
        this.gas = gas;
        this.carNumber = carNumber;
        System.out.println("setCarNumber(double, int)를 통해 가스양을 바꿨습니다 - this.gas =" + this.gas + ", gas=" + gas + "- this.carNumber =" + this.carNumber + ", carNumber=" + carNumber);
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) throws InvalidGasVolumeException {
        if (gas > 0 && gas < 1000) {
            this.gas = gas;
        } else {
            System.out.println("올바른 가스 양이 아닙니다. (가능 한 수의 범위 : 0 ~ 1000). 입력 값: " + gas);
            throw new InvalidGasVolumeException();
        }
        System.out.println("현재 가스 상태를 변경했습니다 : " + this.gas);
    }
}