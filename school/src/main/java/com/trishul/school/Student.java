package com.trishul.school;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private String firstname;
    private String lastName;
    private String email;
}
