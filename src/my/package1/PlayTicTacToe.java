package my.package1;

class PlayTicTacToe {
    public static void main(String[] args) {
        char[][] board = {
                {' ', ' ', ' '},
                {' ', ' ', ' '},
                {' ', ' ', ' '}
        };

        System.out.println("Добро пожаловать в Игру Крестики-Нолики!");
        System.out.println("  1 | 2 | 3  ");
        System.out.println("1 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
        System.out.println(" -----------");
        System.out.println("2 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
        System.out.println(" -----------");
        System.out.println("3 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
        System.out.println("\n Начинаем игру! Первый ход за крестиками: ");

        // Игровой цикл
        boolean playing = true;
        char player = 'X';

        while (playing) {
            System.out.println("Сейчас ходит " + player);
            // Ввод пользователя
            System.out.println("Введите номер строки и столбца (например, 11): ");

            int row, col;

            try {
                System.out.println("Введите номер строки");
                row = Character.getNumericValue(System.in.read());

                System.out.println("Введите номер столбца");
                col = Character.getNumericValue(System.in.read());
            } catch (Exception e) {
                System.out.println("Введено некорректное значение. Попробуйте еще раз.");

                continue;
            }

            // Проверка валидности данных пользователя
            if (row < 1 || row > 3 || col < 1 || col > 3) {
                System.out.println("Координаты должны быть от 1 до 3, попробуйте еще раз.");

                continue;
            }

            // Убедимся, что выбранная клетка пуста
            if (board[row - 1][col - 1] != ' ') {
                System.out.println("Эта клетка уже занята, попробуйте другую.");

                continue;
            }
            // Запишем ход в поле
            board[row - 1][col - 1] = player;

            // Отобразим новое состояние игрового поля
            System.out.println("  1 | 2 | 3  ");
            System.out.println("1 " + board[0][0] + " | " + board[0][1] + " | " + board[0][2]);
            System.out.println(" -----------------");
            System.out.println("2 " + board[1][0] + " | " + board[1][1] + " | " + board[1][2]);
            System.out.println(" -----------------");
            System.out.println("3 " + board[2][0] + " | " + board[2][1] + " | " + board[2][2]);
            System.out.println();

            // Проверяем победителя
            if (checkWinner(board)) {
                playing = false;

                System.out.println("Поздравляем, игрок \"" + player + "\" победил!");
            }

            // Меняем игрока
            player = (player == 'X') ? 'O' : 'X';
        }
    }

    // Данный метод проверяет поле, проверка по строкам, столбцам и диагоналям
    public static boolean checkWinner(char[][] board) {
        for (int i = 0; i < 3; i++) {
            // Проверка строк
            if (board[i][0] != ' ' && board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }

            // Проверка столбцов
            if (board[0][i] != ' ' && board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }

        // Проверка диагоналей
        if (board[0][0] != ' ' && board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        return board[2][0] != ' ' && board[2][0] == board[1][1] && board[1][1] == board[0][2];
    }
}