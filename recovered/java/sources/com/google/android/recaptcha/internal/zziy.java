            package com.google.android.recaptcha.internal;

            import io.sentry.C1697u2;
            import p000.r51;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zziy {
                public static final Class zza(Object obj) throws zzdm {
                    Class cls;
/* 3 */             if (obj instanceof Class) {
/* 5 */                 return (Class) obj;
                    }
/* 16 */            if (!(obj instanceof Integer)) {
/* 78 */                if (!(obj instanceof String)) {
/* 118 */                   C1697u2.m5433i(4, 5, null);
/* 14 */                    return null;
                        }
                        try {
/* 80 */                    String str = (String) obj;
/* 82 */                    Class<?> cls2 = Class.forName(str);
/* 86 */                    int i = zzby.zza;
/* 104 */                   if (((zziq) r51.m8065b(zzix.zza).getValue()).zzb(str)) {
/* 106 */                       return cls2;
                            }
/* 109 */                   C1697u2.m5433i(6, 47, null);
/* 14 */                    return null;
                        } catch (Exception e) {
/* 114 */                   C1697u2.m5433i(6, 8, e);
/* 14 */                    return null;
                        }
                    }
/* 20 */            int iIntValue = ((Number) obj).intValue();
/* 25 */            if (iIntValue == 1) {
/* 27 */                cls = Integer.TYPE;
                    } else if (iIntValue == 2) {
/* 33 */                cls = Short.TYPE;
                    } else if (iIntValue == 3) {
/* 39 */                cls = Byte.TYPE;
                    } else if (iIntValue == 4) {
/* 44 */                cls = Long.TYPE;
                    } else if (iIntValue == 5) {
/* 49 */                cls = Character.TYPE;
                    } else if (iIntValue == 6) {
/* 54 */                cls = Float.TYPE;
                    } else if (iIntValue == 7) {
/* 60 */                cls = Double.TYPE;
                    } else {
/* 68 */                cls = iIntValue == 8 ? Boolean.TYPE : null;
                    }
/* 69 */            if (cls != null) {
/* 71 */                return cls;
                    }
/* 72 */            C1697u2.m5433i(4, 6, null);
/* 14 */            return null;
                }
            }
