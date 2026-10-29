            package com.google.android.gms.internal.common;

            import java.util.logging.Level;
            import java.util.logging.Logger;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzx {
                public static String zza(String str, Object... objArr) {
                    int length;
                    int iIndexOf;
/* 11 */            StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
/* 14 */            int i = 0;
/* 15 */            int i2 = 0;
                    while (true) {
/* 16 */                length = objArr.length;
/* 17 */                if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                            break;
                        }
/* 29 */                sb.append((CharSequence) str, i2, iIndexOf);
/* 40 */                sb.append(zzb(objArr[i]));
/* 43 */                i2 = iIndexOf + 2;
/* 32 */                i++;
                    }
/* 53 */            sb.append((CharSequence) str, i2, str.length());
/* 56 */            if (i < length) {
/* 58 */                String str2 = " [";
/* 61 */                while (i < objArr.length) {
/* 63 */                    sb.append(str2);
/* 72 */                    sb.append(zzb(objArr[i]));
/* 75 */                    i++;
/* 77 */                    str2 = ", ";
                        }
/* 82 */                sb.append(']');
                    }
/* 85 */            return sb.toString();
                }

                private static String zzb(Object obj) {
/* 1 */             if (obj == null) {
/* 3 */                 return "null";
                    }
                    try {
/* 6 */                 return obj.toString();
                    } catch (Exception e) {
/* 17 */                String name = obj.getClass().getName();
/* 25 */                String hexString = Integer.toHexString(System.identityHashCode(obj));
/* 51 */                String strM3790p = fm0.m3790p(new StringBuilder(name.length() + 1 + String.valueOf(hexString).length()), name, "@", hexString);
/* 73 */                Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strM3790p), (Throwable) e);
/* 80 */                String name2 = e.getClass().getName();
/* 99 */                StringBuilder sb = new StringBuilder(strM3790p.length() + 8 + name2.length() + 1);
/* 106 */               fm0.m3796v(sb, "<", strM3790p, " threw ", name2);
/* 111 */               sb.append(">");
/* 114 */               return sb.toString();
                    }
                }
            }
