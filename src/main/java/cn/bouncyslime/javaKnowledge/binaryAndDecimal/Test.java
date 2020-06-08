package cn.bouncyslime.javaKnowledge.binaryAndDecimal;

/*
* binaryString
* 10001000
* 11100     11100000
* 01001100
*
* to decimal
* 136
* 28
* 76
*
* complement code
* -120
* -32
* 76
*
* */

public class Test {
    public static void main(String[] args){
        String binaryString = "10001000";
        String binaryString2 = "11100";
        String binaryString3 = "01001100";

        Test test = new Test();
        test.toString();
        
        
        System.out.println(test.binaryToByte(binaryString));
        System.out.println(test.binaryToByte(binaryString2));
        System.out.println(test.binaryToByte(binaryString3));

        test.byteToBinary(test.binaryToByte(binaryString));
        test.byteToBinary(test.binaryToByte(binaryString2));
        test.byteToBinary(test.binaryToByte(binaryString3));
    }

    public byte binaryToByte(String binaryString){
        byte result = 0;
        for(int i=0;i<binaryString.length();i++){
            char tmp=binaryString.charAt(i);
            if(tmp=='1'){
                if(i%8==0){	 result= (byte) ((int)result | 0x80);	} // 1000 0000
                if(i%8==1){	 result= (byte) ((int)result | 0x40);	} // 0100 0000
                if(i%8==2){	 result= (byte) ((int)result | 0x20);	} // 0010 0000
                if(i%8==3){	 result= (byte) ((int)result | 0x10);	} // 0001 0000
                if(i%8==4){	 result= (byte) ((int)result | 0x8);	} // 0000 1000
                if(i%8==5){	 result= (byte) ((int)result | 0x4);	} // 0000 0100
                if(i%8==6){	 result= (byte) ((int)result | 0x2);	} // 0000 0010
                if(i%8==7){	 result= (byte) ((int)result | 0x1);	} // 0000 0001
            }
        }
        return result;
    }
    
    @Override
    public String toString() {
    	return "就是这个样子的啊";
    }
    
    // 就是这个样子

    public void byteToBinary(byte byteNum){
        String result;
        int z = byteNum;
        z |= 256;
        System.out.println(z);
        result = Integer.toBinaryString(z);
        System.out.println(result.substring(result.length()-8));
    }
}
