public class Main {
    public static void main(String[] args) {
        System.out.println("======================");
        System.out.println("주택용 전기요금(저압) 계산기");
        System.out.println("======================");

        double result;            // 계산 결과값 반영
        double amount;            // 사용량 변수
        amount = 99;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");
        amount = 150;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");
        amount = 250;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");
        amount = 301;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");
        amount = 450;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");
        amount = 510;
        result = elec_calc(amount);
        System.out.println(amount + "kWh의 전기요금은 " +result+"원 입니다.");


    }
  //저압의 경우 100kWh 이하는 kWh당 60.7원, 100kWh 초과는 125.9원, 200kWh 초과는 187.9원, 300kWh 초과는 280.6원, 400kWh 초과는 417.7원, 500kWh초과는 670.6원의 전력량 요금을 내야한다.
    public static double elec_calc(double amount) {              // 저압 전기사용량 계산하는 메소드
        double result = 0;
        if(amount > 500) {                                     // 사용량이 500이상인 경우
            result = (amount-500) * 670.6 + 100 * 417.7 + 100 * 280.6 + 100 * 187.9 + 100 * 125.9 + 100 * 60.7;
        }

        if(amount > 400 && amount <= 500) {                                     // 사용량이 400초과 500 이하인 경우
            result = (amount-400) * 417.7 + 100 * 280.6 + 100 * 187.9 + 100 * 125.9 + 100 * 60.7;
        }

        if(amount > 300 && amount <= 400) {                                     // 사용량이 300초과 400 이하인 경우
            result = (amount-300) * 280.6 + 100 * 187.9 + 100 * 125.9 + 100 * 60.7;
        }

        if(amount > 200 && amount <= 300) {                                     // 사용량이 200초과 300 이하인 경우
            result = (amount-200) * 187.9 + 100 * 125.9 + 100 * 60.7;
        }

        if(amount > 100 && amount <= 200) {                                     // 사용량이 100초과 200 이하인 경우
            result = (amount-100) * 125.9 + 100 * 60.7;
        }

        if(amount < 100) {                                     // 사용량이 100 이하인 경우
            result = amount * 60.7;
        }
        return result;
    }


}
