            package com.google.android.gms.internal.location;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import org.checkerframework.checker.nullness.compatqual.NullableDecl;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzbn {
                public static String zza(@NullableDecl String str, @NullableDecl Object... objArr) {
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
/* 14 */                        string = obj.toString();
                            } catch (Exception e) {
/* 26 */                        String name = obj.getClass().getName();
/* 34 */                        String hexString = Integer.toHexString(System.identityHashCode(obj));
/* 55 */                        StringBuilder sb = new StringBuilder(name.length() + 1 + String.valueOf(hexString).length());
/* 58 */                        sb.append(name);
/* 63 */                        sb.append('@');
/* 66 */                        sb.append(hexString);
/* 69 */                        String string2 = sb.toString();
/* 105 */                       Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", string2.length() != 0 ? "Exception during lenientFormat for ".concat(string2) : new String("Exception during lenientFormat for "), (Throwable) e);
/* 112 */                       String name2 = e.getClass().getName();
/* 129 */                       StringBuilder sb2 = new StringBuilder(string2.length() + 9 + name2.length());
/* 136 */                       fm0.m3796v(sb2, "<", string2, " threw ", name2);
/* 141 */                       sb2.append(">");
/* 144 */                       string = sb2.toString();
                            }
                        }
/* 148 */               objArr[i2] = string;
/* 150 */               i2++;
                    }
/* 163 */           StringBuilder sb3 = new StringBuilder((length * 16) + str.length());
/* 166 */           int i3 = 0;
                    while (true) {
/* 167 */               length2 = objArr.length;
/* 168 */               if (i >= length2 || (iIndexOf = str.indexOf("%s", i3)) == -1) {
                            break;
                        }
/* 180 */               sb3.append((CharSequence) str, i3, iIndexOf);
/* 187 */               sb3.append(objArr[i]);
/* 183 */               i++;
/* 190 */               i3 = iIndexOf + 2;
                    }
/* 200 */           sb3.append((CharSequence) str, i3, str.length());
/* 203 */           if (i < length2) {
/* 207 */               sb3.append(" [");
/* 214 */               sb3.append(objArr[i]);
/* 218 */               for (int i4 = i + 1; i4 < objArr.length; i4++) {
/* 222 */                   sb3.append(", ");
/* 229 */                   sb3.append(objArr[i4]);
                        }
/* 236 */               sb3.append(']');
                    }
/* 239 */           return sb3.toString();
                }
            }
