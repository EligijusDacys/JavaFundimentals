package Workers;

public class WorkersMain {

    public static void main(String[] args) {
        Workers[] worker = getWorkersArray();

        printAverageAgeOfWorkers(worker);
        printAverageSalaryOfWorkers(worker);
        printMostEarningWorker(worker);
        printYoungestWorker(worker);
        //printMostTypeOfGender(worker);

    }

    private static Workers[] getWorkersArray(){
        Workers[] worker = new Workers[5];

        worker[0] = new Workers("Robert", 1000, 36, "male");
        worker[1] = new Workers("Linda", 1500, 28, "female");
        worker[2] = new Workers("Amy", 1450, 27, "female");
        worker[3] = new Workers("Bob", 1000, 21, "male");
        worker[4] = new Workers("Anthony", 1300, 25, "male");

        return worker;
    }

    private static void  printAverageAgeOfWorkers(Workers[] worker){
        double averageAge = 0;
            for (Workers workers : worker) {
                averageAge = workers.getAge();
            }

            System.out.println("Average age" + averageAge);
    }

    private static void printAverageSalaryOfWorkers(Workers[] worker){
        double averageSalary = 0;
            for (Workers workers : worker) {
                averageSalary = workers.getSalary();
            }

            System.out.println("Average Salary" + averageSalary);
    }

    private static void printMostEarningWorker(Workers[] worker){
        double biggestSalary = worker[0].getSalary();
        for (Workers workers : worker){
            biggestSalary = Math.max(workers.getSalary(), biggestSalary);
        }

        System.out.println("Biggest Salary" + biggestSalary);
    }

    private static void printYoungestWorker(Workers[] worker){
        double youngestWorker = worker[0].getAge();
            for(Workers workers : worker) {
                youngestWorker = Math.min(workers.getAge(), youngestWorker);
            }

        System.out.println("Youngest Worker" + youngestWorker);
    }


}
