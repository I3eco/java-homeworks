package hwk06;

public class Zoo {
	Monkey[] arrMonkey = new Monkey[10];
	Lion[] arrLion;
	Eagle[] arrEagle;
	Snake[] arrSnake;
	Shark[] arrShark;
	
	Zoo() {
		this.arrLion = new Lion[10];
		this.arrEagle = new Eagle[10];
		this.arrSnake = new Snake[10];
		this.arrShark = new Shark[10];
	}

	void addMonkey(Monkey nextMonkey) {
		boolean check = true;
		for (int i = 0; i < arrMonkey.length; i++) {
			if (arrMonkey[i] == null) {
				arrMonkey[i] = nextMonkey;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("there is no place for a new monkey.");
		}
	}

	void removeMonkey() {
		boolean check = true;
		for (int i = arrMonkey.length - 1; i >= 0; i--) {
			if (arrMonkey[i] != null) {
				arrMonkey[i] = null;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("there are no monkeys in your zoo.");
		}
	}

	void addLion(Lion nextLion) {
		boolean check = true;
		for (int i = 0; i < arrLion.length; i++) {
			if (arrLion[i] == null) {
				arrLion[i] = nextLion;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There is no place for a new lion.");
		}
	}

	void removeLion() {
		boolean check = true;
		for (int i = arrLion.length - 1; i >= 0; i--) {
			if (arrLion[i] != null) {
				arrLion[i] = null;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There are no lions here.");
		}
	}

	void addEagle(Eagle nextEagle) {
		boolean check = true;
		for (int i = 0; i < arrEagle.length; i++) {
			if (arrEagle[i] == null) {
				arrEagle[i] = nextEagle;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There is no place for a new eagle.");
		}
	}

	void removeEagle() {
		boolean check = true;
		for (int i = arrEagle.length - 1; i >= 0; i--) {
			if (arrEagle[i] != null) {
				arrEagle[i] = null;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There are no eagles here.");
		}
	}

	void addSnake(Snake nextSnake) {
		boolean check = true;
		for (int i = 0; i < arrSnake.length; i++) {
			if (arrSnake[i] == null) {
				arrSnake[i] = nextSnake;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There is no place for a new snake.");
		}
	}

	void removeSnake() {
		boolean check = true;
		for (int i = arrSnake.length - 1; i >= 0; i--) {
			if (arrSnake[i] != null) {
				arrSnake[i] = null;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There are no snakes here.");
		}
	}

	void addShark(Shark nextShark) {
		boolean check = true;
		for (int i = 0; i < arrShark.length; i++) {
			if (arrShark[i] == null) {
				arrShark[i] = nextShark;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There is no place for a new shark.");
		}
	}

	void removeShark() {
		boolean check = true;
		for (int i = arrShark.length - 1; i >= 0; i--) {
			if (arrShark[i] != null) {
				arrShark[i] = null;
				check = false;
				break;
			}
		}
		if (check) {
			System.out.println("There are no sharks here.");
		}
	}

	void getAnimalsCount() {
		int count = 0;

		for (int i = 0; i < arrMonkey.length; i++) {
			if (arrMonkey[i] != null) {
				count++;
			}

			if (arrLion[i] != null) {
				count++;
			}

			if (arrEagle[i] != null) {
				count++;
			}

			if (arrSnake[i] != null) {
				count++;
			}

			if (arrShark[i] != null) {
				count++;
			}
		}

		System.out.println("The number of all animals in the zoo is:" + count);

		// for (int i = 0; i < arrLion.length; i++) {
		// if (arrLion[i] != null) {
		// count ++;
		// }
		// }
		//
		// for (int i = 0; i < arrEagle.length; i++) {
		// if (arrEagle[i] != null) {
		// count ++;
		// }
		// }
		//
		// for (int i = 0; i < arrSnake.length; i++) {
		// if (arrSnake[i] != null) {
		// count ++;
		// }
		// }
		//
		// for (int i = 0; i < arrShark.length; i++) {
		// if (arrShark[i] != null) {
		// count ++;
		// }
		// }

	}
	
	void getMammalsCount() {
		int count = 0;

		for (int i = 0; i < arrMonkey.length; i++) {
			if (arrMonkey[i] != null && arrMonkey[i].isMammal) {
				count++;
			}

			if (arrLion[i] != null && arrLion[i].isMammal) {
				count++;
			}

			if (arrEagle[i] != null && arrEagle[i].isMammal) {
				count++;
			}

			if (arrSnake[i] != null && arrSnake[i].isMammal) {
				count++;
			}

			if (arrShark[i] != null && arrShark[i].isMammal) {
				count++;
			}
		}

		System.out.println("The number of all mammals in the zoo is:" + count);
	}
	
	void getFishesCount () {
		int count = 0;

		for (int i = 0; i < arrMonkey.length; i++) {
			if (arrMonkey[i] != null && arrMonkey[i].isFish) {
				count++;
			}

			if (arrLion[i] != null && arrLion[i].isFish) {
				count++;
			}

			if (arrEagle[i] != null && arrEagle[i].isFish) {
				count++;
			}

			if (arrSnake[i] != null && arrSnake[i].isFish) {
				count++;
			}

			if (arrShark[i] != null && arrShark[i].isFish) {
				count++;
			}
		}

		System.out.println("The number of all fishes in the zoo is:" + count);
	}
	
}
