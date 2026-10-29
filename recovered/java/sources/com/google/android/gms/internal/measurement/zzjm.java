            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.os.Process;
            import android.os.UserManager;
            import io.sentry.android.core.AbstractC1245n0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjm {
                private static UserManager zza;
                private static volatile boolean zzb = !zza();

                private zzjm() {
                }

                public static boolean zza() {
/* 1 */             return true;
                }

                public static boolean zzb(Context context) {
                    return zza() && !zzd(context);
                }

                public static boolean zzc(Context context) {
                    return !zza() || zzd(context);
                }

                /* JADX WARN: Code duplicated, block: B:32:0x0050 A[Catch: all -> 0x000f, TryCatch #1 {all -> 0x000f, blocks: (B:7:0x0009, B:9:0x000d, B:16:0x0017, B:18:0x001b, B:19:0x0025, B:32:0x0050, B:33:0x0052, B:22:0x002b, B:24:0x0031, B:28:0x003e, B:30:0x004c), top: B:39:0x0009, inners: #0 }] */
                private static boolean zzd(Context context) {
/* 4 */             if (zzb) {
/* 3 */                 return true;
                    }
                    synchronized (zzjm.class) {
                        try {
/* 12 */                    if (zzb) {
/* 3 */                         return true;
                            }
/* 18 */                    int i = 1;
                            while (true) {
/* 21 */                        boolean z = false;
/* 22 */                        if (i <= 2) {
/* 26 */                            if (zza == null) {
/* 36 */                                zza = (UserManager) context.getSystemService(UserManager.class);
                                    }
/* 38 */                            UserManager userManager = zza;
/* 40 */                            if (userManager == null) {
/* 42 */                                z = true;
                                    } else {
                                        try {
/* 48 */                                    if (userManager.isUserUnlocked() || !userManager.isUserRunning(Process.myUserHandle())) {
/* 60 */                                        z = true;
                                            }
                                        } catch (NullPointerException e) {
/* 67 */                                    AbstractC1245n0.m4891s("DirectBootUtils", "Failed to check if user is unlocked.", e);
/* 70 */                                    zza = null;
/* 72 */                                    i++;
                                        }
                                    }
/* 79 */                            if (z) {
/* 81 */                                zzb = true;
                                    }
/* 84 */                            return z;
                                }
/* 75 */                        if (z) {
/* 77 */                            zza = null;
                                }
/* 79 */                        if (z) {
/* 81 */                            zzb = true;
                                }
/* 84 */                        return z;
                            }
                        } catch (Throwable th) {
/* 86 */                    throw th;
                        }
                    }
                }
            }
