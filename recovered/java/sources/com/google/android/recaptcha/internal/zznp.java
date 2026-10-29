            package com.google.android.recaptcha.internal;

            import java.lang.reflect.InvocationTargetException;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zznp {
                private static final zznr zza = zzb(zznr.zzd);

                private static zznr zzb(String[] strArr) {
                    zznv zznvVar;
                    try {
/* 2 */                 zznvVar = zznw.zza;
                    } catch (NoClassDefFoundError unused) {
/* 5 */                 zznvVar = null;
                    }
/* 6 */             if (zznvVar != null) {
/* 8 */                 return zznvVar;
                    }
/* 11 */            StringBuilder sb = new StringBuilder();
/* 17 */            for (String str : strArr) {
                        try {
/* 33 */                    return (zznr) Class.forName(str).getConstructor(null).newInstance(null);
                        } catch (Throwable th) {
/* 36 */                    th = th;
/* 39 */                    sb.append('\n');
/* 42 */                    sb.append(str);
/* 47 */                    sb.append(": ");
/* 52 */                    if (th instanceof InvocationTargetException) {
/* 54 */                        th = th.getCause();
                            }
/* 58 */                    sb.append(th);
                        }
                    }
/* 79 */            throw new IllegalStateException(sb.insert(0, "No logging platforms found:").toString());
                }
            }
