package com;

/**
 * The class was only created to train the JUnit tests
 */

public class EmailValidator {

        /**
         * This method checks if the given e-mail is valid
         * A valid e-mail should:
         * - contain '@'
         * - have a dot after '@'
         * - not start or end with '@' or '.'
         */
        public boolean isValidEmail(String email) {
            if (email == null || email.isBlank()) {
                return false;
            }

            if (email.startsWith("@") || email.startsWith(".") ||
                    email.endsWith("@") || email.endsWith(".")) {
                return false;
            }

            int atIndex = email.indexOf("@");
            int dotIndex = email.lastIndexOf(".");

            return atIndex > 0 && dotIndex > atIndex + 1 && dotIndex < email.length() - 1;
        }
}


