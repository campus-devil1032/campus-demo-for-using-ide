package org.example;


import org.example.exceptions.InvalidGasVolumeException;

public class Main {

    public static void main(String[] args) {

        CarWithPrivateMember carWithPrivateMember = new CarWithPrivateMember();

        try {
            carWithPrivateMember.setGas(0.9);
            carWithPrivateMember.show();
        } catch (InvalidGasVolumeException e) {
            System.out.println("가스 값 변경에 실패했습니다.");
        }

        carWithPrivateMember.setCarNumber(0.5);
        carWithPrivateMember.setCarNumber(10);
        carWithPrivateMember.setCarNumber(10, 0.5);


    }
}