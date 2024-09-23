package contact;

import java.util.List;
import java.util.Scanner;

public class AddressBookProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();
        boolean exit = false;

        while (!exit) {
            System.out.println("--------------------------------");
            System.out.println("1. 비즈니 연락처 추가");
            System.out.println("2. 개인 연락처 추가");
            System.out.println("3. 연락처 출력");
            System.out.println("4. 연락처 검색");
            System.out.println("5. 종료");
            System.out.println("--------------------------------");

            System.out.print("메뉴를 선택해주세요: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    // 비즈니 연락처 추가
                    System.out.println("--------------------------------");
                    System.out.print("이름을 입력하세요: ");
                    String businessName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String businessPhone = scanner.nextLine();
                    System.out.print("회사를 입력하세요: ");
                    String businessCompany = scanner.nextLine();
                    System.out.println("--------------------------------");
                    BusinessContact businessContact = new BusinessContact(businessName, businessPhone, businessCompany);
                    addressBook.addContact(businessContact);
                    System.out.println("비즈니스 연락처가 추가되었습니다.");
                    break;
                case 2:
                    // 개인 연락처 추가
                    System.out.println("--------------------------------");
                    System.out.print("이름을 입력하세요: ");
                    String personalName = scanner.nextLine();
                    System.out.print("전화번호를 입력하세요: ");
                    String personalPhone = scanner.nextLine();
                    System.out.print("관계를 입력하세요: ");
                    String personalRelationship = scanner.nextLine();
                    System.out.println("--------------------------------");
                    PersonalContact personalContact = new PersonalContact(personalName, personalPhone, personalRelationship);
                    addressBook.addContact(personalContact);
                    System.out.println("개인 연락처가 추가되었습니다.");
                    break;
                case 3:
                    // 연락처 출력
                    System.out.println("--------------------------------");
                    System.out.println("<연락처 목록>");
                    addressBook.displayContacts();
                    break;
                case 4:
                    // 연락처 검색
                    System.out.print("검색할 이름을 입력하세요: ");
                    String searchName = scanner.nextLine();
                    System.out.println("--------------------------------");
                    System.out.println("<검색 결과>");
                    addressBook.searchContact(searchName);
                    break;
                case 5:
                    // 종료
                    System.out.println("--------------------------------");
                    System.out.println("프로그램을 종료합니다.");
                    System.out.println("--------------------------------");
                    exit = true;
                    break;
                default:
                    System.out.println("유효하지 않은 선택입니다. 다시 선택해주세요.");
            }
        }

        scanner.close();

    }
}