package com.example.myandroidevent;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class lab3 extends Activity {

    EditText n;
    Button btn;
    TextView tv1, tv2, tv3, tv4;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab3);

        n = findViewById(R.id.et1);
        btn = findViewById(R.id.btn);
        tv1 = findViewById(R.id.evenodd);
        tv2 = findViewById(R.id.primecom);
        tv3 = findViewById(R.id.fact);
        tv4 = findViewById(R.id.palindrome);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input = n.getText().toString();
                int num = Integer.parseInt(input);

                    // Call methods for calculations
                    int resultPrime = primecom(num);
                    int resultFact = fact(num);
                    boolean resultPalindrome = palindrome(input);

                    // Display results in TextViews
                    tv1.setText("Odd/Even: " + ((num%2 == 0) ? "Even" : "Odd"));
                    tv2.setText("Prime/Composite: " + ((resultPrime == 1) ? "Prime" : "Composite"));
                    tv3.setText("Factorial: " + resultFact);
                 if (resultPalindrome)
                        tv4.append("\nPalindrome: Yes");
                    else
                        tv4.append("\nPalindrome: No");
                }
        });
    }



    // Method to check if number is prime or composite
    public static int primecom(int num) {
        if (num < 2) return 0; // 0 and 1 are neither prime nor composite
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0)
                return 0; // Not prime
        }
        return 1; // Prime
    }

    // Method to calculate factorial of a number
    public static int fact(int num) {
        int factorial = 1;
        for (int i = 2; i <= num; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to check if a string is palindrome
    public static boolean palindrome(String input) {
        int left = 0;
        int right = input.length() - 1;
        while (left < right) {
            if (input.charAt(left) != input.charAt(right))
                return false;
            left++;
            right--;
        }
        return true;
    }
}
