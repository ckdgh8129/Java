package simple;


import java.util.Scanner;
import java.util.Random;

public class SimpleRPG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();

        // 플레이어 초기 스탯
        String name;
        int hp = 100, maxHp = 100, mp = 50, maxMp = 50, atk = 15, gold = 0, lv = 1, exp = 0;

        System.out.print("용사의 이름을 입력하세요: ");
        name = sc.nextLine();

        while (hp > 0) {
            System.out.println("\n========================================");
            System.out.println("[ " + name + " LV:" + lv + " HP:" + hp + "/" + maxHp + " MP:" + mp + "/" + maxMp + " ]");
            System.out.println("1.사냥터 2.상점 3.휴식(MP회복) 4.종료");
            int menu = sc.nextInt();

            if (menu == 1) { // 사냥터
                String mName = "야생의 몬스터";
                int mHp = lv * 50;
                int mAtk = lv * 7;

                while (mHp > 0 && hp > 0) {
                    System.out.println("\n" + mName + " HP: " + mHp);
                    System.out.println("1.일반공격 2.스킬선택 3.도망");
                    int act = sc.nextInt();

                    if (act == 1) {
                        System.out.println("기본 공격! " + atk + " 데미지!");
                        mHp -= atk;
                    } else if (act == 2) {
                        System.out.println("1.강타(MP 10): 2배 데미지");
                        System.out.println("2.흡혈(MP 15): 공격 후 HP 20 회복");
                        System.out.println("3.필살기(MP 30): 4배 데미지");
                        int sChoice = sc.nextInt();
                        
                        if (sChoice == 1 && mp >= 10) {
                            System.out.println("강타! " + (atk * 2) + " 데미지!");
                            mHp -= (atk * 2); mp -= 10;
                        } else if (sChoice == 2 && mp >= 15) {
                            System.out.println("흡혈! " + atk + " 데미지 및 체력 20 회복!");
                            mHp -= atk; hp = Math.min(hp + 20, maxHp); mp -= 15;
                        } else if (sChoice == 3 && mp >= 30) {
                            System.out.println("필.살.기! " + (atk * 4) + " 데미지!!!");
                            mHp -= (atk * 4); mp -= 30;
                        } else {
                            System.out.println("MP가 부족하거나 잘못된 입력입니다. 공격 실패!");
                        }
                    } else { break; }

                    if (mHp > 0) {
                        System.out.println(mName + "의 반격! " + mAtk + " 데미지!");
                        hp -= mAtk;
                    }
                }
                if (mHp <= 0) {
                    System.out.println("몬스터 처치! 경험치와 골드를 얻었습니다.");
                    gold += 50; exp += 50;
                    if (exp >= 100) {
                        System.out.println("★ LEVEL UP ★");
                        lv++; exp = 0; maxHp += 20; maxMp += 10; hp = maxHp; mp = maxMp;
                    }
                }
            } else if (menu == 2) {
                System.out.println("상점: 1.체력포션(50G) 2.마나포션(30G)");
                int buy = sc.nextInt();
                if (buy == 1 && gold >= 50) { hp = maxHp; gold -= 50; }
                else if (buy == 2 && gold >= 30) { mp = maxMp; gold -= 30; }
            } else if (menu == 3) {
                System.out.println("잠을 자며 MP를 조금 회복합니다...");
                mp = Math.min(mp + 20, maxMp);
            } else { break; }
        }
        System.out.println("게임이 종료되었습니다.");
    }
}
