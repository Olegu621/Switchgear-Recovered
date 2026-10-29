            package p000;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public abstract class sh2 {

                /* JADX INFO: renamed from: a */
                public static final String[] f16631a;

                /* JADX INFO: renamed from: b */
                public static final byte[] f16632b;

                static {
/* 3 */             String[] strArr = new String[93];
/* 9 */             for (int i = 0; i < 32; i++) {
/* 56 */                strArr[i] = "\\u" + m8509c(i >> 12) + m8509c(i >> 8) + m8509c(i >> 4) + m8509c(i);
                    }
/* 65 */            strArr[34] = "\\\"";
/* 71 */            strArr[92] = "\\\\";
/* 77 */            strArr[9] = "\\t";
/* 83 */            strArr[8] = "\\b";
/* 89 */            strArr[10] = "\\n";
/* 95 */            strArr[13] = "\\r";
/* 101 */           strArr[12] = "\\f";
/* 103 */           f16631a = strArr;
/* 105 */           byte[] bArr = new byte[93];
/* 107 */           for (int i2 = 0; i2 < 32; i2++) {
/* 110 */               bArr[i2] = 1;
                    }
/* 115 */           bArr[34] = 34;
/* 117 */           bArr[92] = 92;
/* 121 */           bArr[9] = 116;
/* 125 */           bArr[8] = 98;
/* 129 */           bArr[10] = 110;
/* 133 */           bArr[13] = 114;
/* 137 */           bArr[12] = 102;
/* 139 */           f16632b = bArr;
                }

                /* JADX INFO: renamed from: a */
                public static final void m8507a(StringBuilder sb, String str) {
/* 1 */             str.getClass();
/* 6 */             sb.append('\"');
/* 9 */             int length = str.length();
/* 14 */            int i = 0;
/* 15 */            for (int i2 = 0; i2 < length; i2++) {
/* 17 */                char cCharAt = str.charAt(i2);
/* 21 */                String[] strArr = f16631a;
/* 24 */                if (cCharAt < strArr.length && strArr[cCharAt] != null) {
/* 30 */                    sb.append((CharSequence) str, i, i2);
/* 35 */                    sb.append(strArr[cCharAt]);
/* 38 */                    i = i2 + 1;
                        }
                    }
/* 43 */            if (i != 0) {
/* 49 */                sb.append((CharSequence) str, i, str.length());
                    } else {
/* 53 */                sb.append(str);
                    }
/* 56 */            sb.append('\"');
                }

                /* JADX INFO: renamed from: b */
                public static final Boolean m8508b(String str) {
/* 1 */             str.getClass();
/* 10 */            if (str.equalsIgnoreCase("true")) {
/* 12 */                return Boolean.TRUE;
                    }
/* 21 */            if (str.equalsIgnoreCase("false")) {
/* 23 */                return Boolean.FALSE;
                    }
/* 26 */            return null;
                }

                /* JADX INFO: renamed from: c */
                public static final char m8509c(int i) {
/* 1 */             int i2 = i & 15;
/* 9 */             return (char) (i2 < 10 ? i2 + 48 : i2 + 87);
                }
            }
