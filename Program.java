public class Program {

    public static void main(String[] args) {
    /* 
        Object[] array = new Object[10];
        array[0] = 1;
        array[1] = "Hello!";
        array[2] = new Person();
        Object o = new Person();

        Employee employee2 = new Employee("DDDD", 32);

        Employee employee1 = new Employee("AAAAAA", 34);
        LinkedList<Employee> linkedList1 = new LinkedList<>();
        linkedList1.addFirst(new Employee("AAAAAA", 43));
        linkedList1.addFirst(new Employee("CCCC", 22));
        linkedList1.addFirst(employee1);
        linkedList1.addFirst(new Employee("EEEEE", 55));
        linkedList1.addFirst(new Employee("AAAAAA", 67));
        linkedList1.addFirst(new Employee("DDDD", 32));
        linkedList1.addFirst(new Employee("AAAAAA", 21));

        System.out.println(linkedList1);

        linkedList1.sort(new EmployeeComparator(SortType.Ascending));

        System.out.println();
        System.out.println(linkedList1);

        linkedList1.sort(new EmployeeComparator(SortType.Descending));

        System.out.println();
        System.out.println(linkedList1);

        LinkedList<Employee>.Node node = linkedList1.contains(employee2);
        if (node != null){
            System.out.println("Элемент найден!");
            System.out.println("Значение элемента: " + node.value);
        }
        else {
            System.out.println("Элемент не найден.");
        }

        linkedList1.removeFirst();

        linkedList1.removeLast();

        System.out.println();
        System.out.println(linkedList1);
    */
        // вызываем метод разворота связного списка

        LinkedList<Employee> linkedList2 = new LinkedList<>();
        linkedList2.addFirst(new Employee("Семен Петрович", 43));
        linkedList2.addFirst(new Employee("Тамара Степановна", 22));
        linkedList2.addFirst(new Employee("Елена Дмитриевна", 55));
        linkedList2.addFirst(new Employee("Дмитрий Александрович", 67));
        linkedList2.addFirst(new Employee("Наталья Владимировна", 32));
        linkedList2.addFirst(new Employee("Виктория Юрьевна", 21));
        System.out.printf("Изначальный список сотрудников: \n" + linkedList2);
        
        linkedList2.revert();
        System.out.println();
        System.out.printf("Cписок сотрудников после метода разворота: \n" + linkedList2);
    }

}

class Person{

}
