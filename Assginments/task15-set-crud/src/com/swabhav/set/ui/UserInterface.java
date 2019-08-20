package com.swabhav.set.ui;

import java.util.*;

import com.swabhav.set.crud.*;

public class UserInterface {
	
	private static final int HASH_SET = 1;
	private static final int LINKED_HASH_SET = 2;
	private static final int TREE_SET = 3;
	private static final int EXIT = 4;
	private static final int CREATE = 1;
	private static final int READ = 2;
	private static final int UPDATE = 3;
	private static final int DELETE = 4;
	private static final int CRUD_EXIT = 5;

	public void menuSets() {
		while (true) {
			int choiceSets = 0;
			System.out.println(" ");
			System.out.println("1.HashSet \n2.LinkedHashSet \n3.TreeSet \n4.Exit");
			System.out.print("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			choiceSets = sc.nextInt();

			switch (choiceSets) {
			case HASH_SET:
				menuCrud(new HashSetCrud());
				break;

			case LINKED_HASH_SET:
				menuCrud(new LinkedHashSetCrud());
				break;

			case TREE_SET:
				menuCrud(new TreeSetCrud());
				break;

			case EXIT:
				System.exit(0);
				break;

			default:
				System.out.println("Invalid choice");
				break;
			}

		}

	}

	private void menuCrud(SetsCrud setType) {
		while (true) {
			int choiceCrud = 0;
			boolean flag = false;
			System.out.println(" ");
			System.out.println("1.Create \n2.Read \n3.Update \n4.Delete \n5.Exit");
			System.out.print("Enter your choice: ");
			Scanner sc = new Scanner(System.in);
			choiceCrud = sc.nextInt();

			switch (choiceCrud) {
			case CREATE:
				String element = "";
				System.out.print("Enter an element: ");
				element = sc.next();
				setType.create(element);
				break;

			case READ:
				if (setType.read() == "") {
					System.out.println("The list is empty");
				} else {
					System.out.println("The Set is:" + setType.read());
				}
				break;

			case UPDATE:
				String oldElement = "";
				String newElement = "";
				System.out.print(
						"Enter the element you want to replace and the element " + "with which you want to replace: ");
				oldElement = sc.next();
				newElement = sc.next();
				setType.update(oldElement, newElement);
				break;

			case DELETE:
				String elementToBeDeleted = "";
				System.out.print("Enter the element you want to delete: ");
				elementToBeDeleted = sc.next();
				setType.delete(elementToBeDeleted);
				break;

			case CRUD_EXIT:
				flag = true;
				break;

			default:
				System.out.println("Invalid choice");
				break;

			}
			if (flag == true) {
				break;
			}
		}

	}

}
