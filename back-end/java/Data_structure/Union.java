package Data_structure;

import java.util.ArrayList;

import java.util.Scanner;

public class Union {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter elements for the first ArrayList:");
        ArrayList<Integer> list1 = getInputList(scanner);

        System.out.println("Enter elements for the second ArrayList:");
        ArrayList<Integer> list2 = getInputList(scanner);

        ArrayList<Integer> unionList = new ArrayList<>();
        ArrayList<Integer> duplicatesList = new ArrayList<>();

        findUnionAndDuplicates(list1, list2, unionList, duplicatesList);

        System.out.println("Union of the two ArrayLists: " + unionList);
        System.out.println("Elements that are common in both ArrayLists: " + duplicatesList);
    }

    private static ArrayList<Integer> getInputList(Scanner scanner) {
        ArrayList<Integer> list = new ArrayList<>();
        String input = scanner.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            list.add(Integer.parseInt(element));
        }
        return list;
    }

    private static void findUnionAndDuplicates(
            ArrayList<Integer> list1, ArrayList<Integer> list2,
            ArrayList<Integer> unionList, ArrayList<Integer> duplicatesList) {

        for (Integer element : list1) {
            if (list2.contains(element)) {
                duplicatesList.add(element);
            }
            unionList.add(element);
        }

        for (Integer element : list2) {
            if (!unionList.contains(element)) {
                unionList.add(element);
            }
        }
    }
}