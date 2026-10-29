            package com.google.android.gms.internal.fido;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.AbstractC0886en;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzat {
                public static String zza(String str, Object... objArr) {
                    int length;
                    int length2;
                    int iIndexOf;
                    String string;
/* 1 */             int i = 0;
/* 2 */             int i2 = 0;
                    while (true) {
/* 3 */                 length = objArr.length;
/* 4 */                 if (i2 >= length) {
                            break;
                        }
/* 6 */                 Object obj = objArr[i2];
/* 8 */                 if (obj == null) {
/* 10 */                    string = "null";
                        } else {
                            try {
/* 13 */                        string = obj.toString();
                            } catch (Exception e) {
/* 52 */                        String str2 = obj.getClass().getName() + '@' + Integer.toHexString(System.identityHashCode(obj));
/* 74 */                        Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(str2), (Throwable) e);
/* 81 */                        StringBuilder sbM3513q = AbstractC0886en.m3513q("<", str2, " threw ");
/* 93 */                        sbM3513q.append(e.getClass().getName());
/* 98 */                        sbM3513q.append(">");
/* 101 */                       string = sbM3513q.toString();
                            }
                        }
/* 105 */               objArr[i2] = string;
/* 107 */               i2++;
                    }
/* 119 */           StringBuilder sb = new StringBuilder(str.length() + (length * 16));
/* 122 */           int i3 = 0;
                    while (true) {
/* 123 */               length2 = objArr.length;
/* 124 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 136 */               sb.append((CharSequence) str, i3, iIndexOf);
/* 143 */               sb.append(objArr[i]);
/* 139 */               i++;
/* 146 */               i3 = iIndexOf + 2;
                    }
/* 156 */           sb.append((CharSequence) str, i3, str.length());
/* 159 */           if (i < length2) {
/* 163 */               sb.append(" [");
/* 170 */               sb.append(objArr[i]);
/* 174 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 178 */                   sb.append(", ");
/* 185 */                   sb.append(objArr[i4]);
                        }
/* 192 */               sb.append(']');
                    }
/* 195 */           return sb.toString();
                }
            }
