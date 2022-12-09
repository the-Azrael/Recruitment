public class Main {
    private static final CandidatesBase candidatesBase = new CandidatesBase();
    private static final String MALE = "Мужской";
    private static final String FEMALE = "Женский";

    public static void fillBase() {
        Candidate candidate1 = new Candidate("Иванов Иван Иванович", MALE, "35", 4, 3);
        Candidate candidate2 = new Candidate("Петрова Полина Петровна", FEMALE, "22", 2, 3);
        Candidate candidate3 = new Candidate("Сидоров Сергей Сергеевич", MALE, "28", 2, 2);
        Candidate candidate4 = new Candidate("Цыплина Юлия Леонидовна", FEMALE, "30", 5, 5);
        Candidate candidate5 = new Candidate("Егоркин Роман Олегович", MALE, "25", 4, 5);
        Candidate candidate6 = new Candidate("Потапова Анастасия Кирилловна", FEMALE, "18", 1, 1);
        Candidate candidate7 = new Candidate("Верба Геннадий Федорович", MALE, "25", 2, 4);
        Candidate candidate8 = new Candidate("Казюкевич Лидия Михайловна", FEMALE, "40", 3, 4);
        Candidate candidate9 = new Candidate("Зелибоба Данил Прометеевич", MALE, "50", 1, 5);
        Candidate candidate10 = new Candidate("Хусанова Наиля Джанебековна", FEMALE, "37", 1, 5);
        Candidate candidate11 = new Candidate("Хусанова Наиля Джанебековна", FEMALE, "37", 2, 5);

        candidatesBase.addCandidate(candidate1);
        candidatesBase.addCandidate(candidate2);
        candidatesBase.addCandidate(candidate3);
        candidatesBase.addCandidate(candidate4);
        candidatesBase.addCandidate(candidate5);
        candidatesBase.addCandidate(candidate6);
        candidatesBase.addCandidate(candidate7);
        candidatesBase.addCandidate(candidate8);
        candidatesBase.addCandidate(candidate9);
        candidatesBase.addCandidate(candidate10);
        candidatesBase.addCandidate(candidate11);
    }

    public static void main(String[] args) {
        fillBase();
        System.out.println(String.format("%30s %15s %15s", "ФИО", "Релевантность", "Оценка"));
        System.out.println(candidatesBase);
    }
}
