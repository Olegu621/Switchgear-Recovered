            package com.google.android.gms.internal.drive;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzix {
                private static final Class<?> zzni = zzj("libcore.io.Memory");
                private static final boolean zznj;

                static {
/* 20 */            zznj = zzj("org.robolectric.Robolectric") != null;
                }

                public static boolean zzbr() {
                    return (zzni == null || zznj) ? false : true;
                }

                public static Class<?> zzbs() {
/* 1 */             return zzni;
                }

                private static <T> Class<T> zzj(String str) {
                    try {
/* 1 */                 return (Class<T>) Class.forName(str);
                    } catch (Throwable unused) {
/* 6 */                 return null;
                    }
                }
            }
