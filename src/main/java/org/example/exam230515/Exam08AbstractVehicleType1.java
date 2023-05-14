package org.example.exam230515;

abstract class Exam08AbstractVehicleType1 { // 클래스 이름 앞에 abstract를 붙인 추상 클래스입니다.

    protected int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        System.out.println("속도를 변경함: " + speed);
    }

    abstract void show(); // 이 메소드에는 몸체{}가 없습니다.
}
