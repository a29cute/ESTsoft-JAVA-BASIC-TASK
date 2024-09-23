package contact;

import java.util.List;
import java.util.Scanner;

public class AddressBookProgram {

    static void printMenu() {
        System.out.println("1. 비즈니스 연락처 추가\n" +
                "2. 개인 연락처 추가\n" +
                "3. 연락처 출력\n" +
                "4. 연락처 검색\n" +
                "5. 종료\n" +
                "메뉴를 선택해주세요: ");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean exit = false;

        while (!exit) {
            printMenu();
            int menu = scanner.nextInt();
            scanner.nextLine();

            switch (menu) {
                case 1:
                    System.out.print("이름을 입력하세요: ");
                    String businessName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String businessPhone = scanner.nextLine();
                    System.out.print("회사를 입력하세요: ");
                    String businessCompany = scanner.nextLine();
                    BusinessContact businessContact = new BusinessContact(businessName, businessPhone, businessCompany);
                    addressBook.addContact(businessContact);
                    System.out.println("비즈니스 연락처 추가 완료");
                    break;
                case 2:
                    System.out.print("이름을 입력하세요: ");
                    String personalName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String personalPhone = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String personalRelationship = scanner.nextLine();
                    PersonalContact personalContact = new PersonalContact(personalName, personalPhone, personalRelationship);
                    addressBook.addContact(personalContact);
                    System.out.println("개인 연락처 추가 완료");
                    break;
                case 3:
                    System.out.println("연락처 목록");
                    addressBook.displayContacts();
                    break;
                case 4:
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    System.out.println("검색 결과");
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    System.out.println("프로그램 종료");
                    exit = true;
                    break;
                default:
                    System.out.println("올바르지 않은 선택입니다.");
            }
        }
        scanner.close();
    }
}