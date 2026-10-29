            package com.google.android.gms.internal.auth;

            import android.content.Context;
            import android.os.Process;
            import android.os.UserManager;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzcc {
                private static UserManager zza;
                private static volatile boolean zzb = !zzb();

                private zzcc() {
                }

                /* JADX WARN: Code duplicated, block: B:32:0x004c A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:34:0x0050 A[Catch: all -> 0x0015, TryCatch #0 {all -> 0x0015, blocks: (B:9:0x000f, B:11:0x0013, B:18:0x001d, B:20:0x0021, B:21:0x002b, B:34:0x0050, B:35:0x0052, B:24:0x0031, B:26:0x0037, B:32:0x004c, B:30:0x0045), top: B:41:0x000f, inners: #1 }] */
                /* JADX WARN: Code duplicated, block: B:37:0x0055 A[RETURN] */
                public static boolean zza(Context context) {
                    boolean z;
/* 6 */             if (zzb() && !zzb) {
                        synchronized (zzcc.class) {
                            try {
/* 18 */                        if (!zzb) {
/* 25 */                            int i = 1;
                                    while (true) {
/* 28 */                                if (i <= 2) {
/* 32 */                                    if (zza == null) {
/* 42 */                                        zza = (UserManager) context.getSystemService(UserManager.class);
                                            }
/* 44 */                                    UserManager userManager = zza;
/* 46 */                                    if (userManager == null) {
/* 48 */                                        z = true;
                                            } else {
                                                try {
/* 54 */                                            if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
/* 66 */                                                z = true;
                                                    }
/* 75 */                                            if (z) {
/* 77 */                                                zza = null;
                                                    }
                                                } catch (NullPointerException unused) {
/* 70 */                                            zza = null;
/* 72 */                                            i++;
                                                }
                                            }
/* 79 */                                    if (z) {
/* 81 */                                        zzb = true;
                                            }
/* 84 */                                    if (!z) {
/* 24 */                                        return true;
                                            }
                                        }
/* 68 */                                z = false;
/* 75 */                                if (z) {
/* 77 */                                    zza = null;
                                        }
/* 79 */                                if (z) {
/* 81 */                                    zzb = true;
                                        }
/* 84 */                                if (!z) {
/* 24 */                                    return true;
                                        }
                                    }
                                }
                            } catch (Throwable th) {
/* 88 */                        throw th;
                            }
                        }
                    }
/* 5 */             return false;
                }

                public static boolean zzb() {
/* 1 */             return true;
                }
            }
