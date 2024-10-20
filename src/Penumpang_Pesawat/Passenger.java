package Penumpang_Pesawat;

class Passenger {
    String name;
    Passenger next;

    public Passenger(String name) {
        this.name = name;
        this.next = null;
    }
}

class Flight {
    private Passenger head;

    public Flight() {
        this.head = null;
    }

    public void addPassenger(String name) {
        Passenger newPassenger = new Passenger(name);
        if (head == null) {
            head = newPassenger ;
        } else {
            Passenger currentPassenger = head;
            while (currentPassenger.next != null) {
                currentPassenger = currentPassenger.next;
            }
            currentPassenger.next = newPassenger;
        }
    }

    public void removePassenger(String name) {
        if (head == null) {
            System.out.println("Tidak ada penumpang.");
            return;
        }

        if (head.name.equals(name)) {
            head = head.next;
            System.out.println(name + " telah dihapus.");
            return;
        }

        Passenger currentPassenger = head;
        while (currentPassenger.next != null && !currentPassenger.next.name.equals(name)) {
            currentPassenger = currentPassenger.next;
        }

        if (currentPassenger.next != null && currentPassenger.next.name.equals(name)) {
            currentPassenger.next = currentPassenger.next.next;
            System.out.println(name + " telah dihapus.");
        } else {
            System.out.println(name + " tidak ditemukan.");
        }
    }

    public void displayPassenger() {
        if (head == null) {
            System.out.println("Tidak ada penumpang.");
            return;
        }

        Passenger currentPassenger = head;
        System.out.println("Daftar Nama-nama Penumpang Airasia.");
        while (currentPassenger != null) {
            System.out.println(currentPassenger.name);
            currentPassenger = currentPassenger.next;
        }
    }
}