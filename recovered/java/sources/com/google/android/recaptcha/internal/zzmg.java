            package com.google.android.recaptcha.internal;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzmg {
                public static String zza(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String strM3785k;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    strM3785k = "null";
                        } else {
                            try {
/* 13 */                        strM3785k = obj.toString();
                            } catch (Exception e) {
/* 38 */                        String strM3508l = AbstractC0886en.m3508l(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
/* 60 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM3508l), (Throwable) e);
/* 77 */                        strM3785k = fm0.m3785k("<", strM3508l, " threw ", e.getClass().getName(), ">");
                            }
                        }
/* 81 */                objArr[i2] = strM3785k;
/* 83 */                i2++;
                    }
/* 95 */            StringBuilder sb = new StringBuilder(str.length() + (length * 16));
/* 98 */            int i3 = 0;
                    while (true) {
/* 99 */                length2 = objArr.length;
/* 100 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 112 */               sb.append((CharSequence) str, i3, iIndexOf);
/* 119 */               sb.append(objArr[i]);
/* 115 */               i++;
/* 122 */               i3 = iIndexOf + 2;
                    }
/* 132 */           sb.append((CharSequence) str, i3, str.length());
/* 135 */           if (i < length2) {
/* 139 */               sb.append(" [");
/* 146 */               sb.append(objArr[i]);
/* 150 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 154 */                   sb.append(", ");
/* 161 */                   sb.append(objArr[i4]);
                        }
/* 168 */               sb.append(']');
                    }
/* 171 */           return sb.toString();
                }
            }
