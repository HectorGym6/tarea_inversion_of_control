package org.example.components;

import lombok.AllArgsConstructor;
import org.example.entity.Member;

import java.util.Scanner;
@AllArgsConstructor
public class MemberReader {
    private Scanner sc;
    public Member readMember(){

        System.out.println("Introduce el NIF del socio");
        String nif = sc.next();
        System.out.println("Introduce el nombre del usuario con NIF " + nif);
        String name = sc.next();
        System.out.println("Introduce el apellido de " + name);
        String surname = sc.next();
        System.out.println("Introduce el codigo postal de " + name + " " + surname);
        int ccpp = sc.nextInt();
        return new Member(nif, name, surname, ccpp);

    }
}