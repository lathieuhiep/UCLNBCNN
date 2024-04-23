package com.techja.uclnbcnn;

public class UCLNBCNN {
    private int a, b;

    public UCLNBCNN(int a, int b) {
        this.a = a;
        this.b = b;
    }

    private int timUCLN() {
        int tempA = a;
        int tempB = b;

        if (tempA < tempB) {
            int temp = tempA;
            tempA = tempB;
            tempB = temp;
        }

        while (tempB != 0 ) {
            int temp = tempB;
            tempB = tempA % tempB;
            tempA = temp;
        }

        return tempA;
    }

    public void inUCLN() {
        int ucln = timUCLN();

        System.out.println("UCLN cua (" + a + ", " + b + ") la: " + ucln);
    }

    public void inBSCNN() {
        int ucln = timUCLN();
        int bcnh = a * b / ucln;

        System.out.println("BCNN cua (" + a + ", " + b + ") la: " + bcnh);
    }
}
