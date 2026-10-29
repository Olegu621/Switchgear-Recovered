            package com.google.gson;

            import java.lang.reflect.Field;
            import java.util.Locale;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public enum FieldNamingPolicy implements FieldNamingStrategy {
                IDENTITY { // from class: com.google.gson.FieldNamingPolicy.1
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 1 */                 return field.getName();
                    }
                },
                UPPER_CAMEL_CASE { // from class: com.google.gson.FieldNamingPolicy.2
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 5 */                 return FieldNamingPolicy.upperCaseFirstLetter(field.getName());
                    }
                },
                UPPER_CAMEL_CASE_WITH_SPACES { // from class: com.google.gson.FieldNamingPolicy.3
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 11 */                return FieldNamingPolicy.upperCaseFirstLetter(FieldNamingPolicy.separateCamelCase(field.getName(), ' '));
                    }
                },
                UPPER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.4
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 13 */                return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toUpperCase(Locale.ENGLISH);
                    }
                },
                LOWER_CASE_WITH_UNDERSCORES { // from class: com.google.gson.FieldNamingPolicy.5
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 13 */                return FieldNamingPolicy.separateCamelCase(field.getName(), '_').toLowerCase(Locale.ENGLISH);
                    }
                },
                LOWER_CASE_WITH_DASHES { // from class: com.google.gson.FieldNamingPolicy.6
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 13 */                return FieldNamingPolicy.separateCamelCase(field.getName(), '-').toLowerCase(Locale.ENGLISH);
                    }
                },
                LOWER_CASE_WITH_DOTS { // from class: com.google.gson.FieldNamingPolicy.7
                    @Override // com.google.gson.FieldNamingStrategy
                    public String translateName(Field field) {
/* 13 */                return FieldNamingPolicy.separateCamelCase(field.getName(), '.').toLowerCase(Locale.ENGLISH);
                    }
                };

                public static String separateCamelCase(String str, char c) {
/* 3 */             StringBuilder sb = new StringBuilder();
/* 6 */             int length = str.length();
/* 11 */            for (int i = 0; i < length; i++) {
/* 13 */                char cCharAt = str.charAt(i);
/* 21 */                if (Character.isUpperCase(cCharAt) && sb.length() != 0) {
/* 29 */                    sb.append(c);
                        }
/* 32 */                sb.append(cCharAt);
                    }
/* 38 */            return sb.toString();
                }

                public static String upperCaseFirstLetter(String str) {
/* 1 */             int length = str.length();
/* 7 */             for (int i = 0; i < length; i++) {
/* 9 */                 char cCharAt = str.charAt(i);
/* 17 */                if (Character.isLetter(cCharAt)) {
/* 23 */                    if (Character.isUpperCase(cCharAt)) {
                                break;
                            }
/* 26 */                    char upperCase = Character.toUpperCase(cCharAt);
/* 31 */                    if (i == 0) {
/* 48 */                        return upperCase + str.substring(1);
                            }
/* 76 */                    return str.substring(0, i) + upperCase + str.substring(i + 1);
                        }
                    }
/* 84 */            return str;
                }
            }
