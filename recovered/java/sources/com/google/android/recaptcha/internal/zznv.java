            package com.google.android.recaptcha.internal;

            import android.os.Build;
            import dalvik.system.VMStack;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zznv extends zznr {
                private static final boolean zza = zza.zza();
                private static final boolean zzb;
                private static final zznq zzc;

                /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
                final class zza {
                    public static boolean zza() {
/* 1 */                 return zznv.zzt();
                    }
                }

                static {
/* 7 */             String str = Build.FINGERPRINT;
/* 9 */             boolean z = true;
/* 10 */            if (str != null && !"robolectric".equals(str)) {
/* 21 */                z = false;
                    }
/* 22 */            zzb = z;
/* 29 */            zzc = new zznq() { // from class: com.google.android.recaptcha.internal.zznv.1
                        @Override // com.google.android.recaptcha.internal.zznq
                        public zzmw zza(Class<?> cls, int i) {
/* 1 */                     return zzmw.zza;
                        }

                        @Override // com.google.android.recaptcha.internal.zznq
                        public String zzb(Class cls) {
                            StackTraceElement stackTraceElementZza;
/* 5 */                     if (zznv.zza) {
                                try {
/* 15 */                            if (cls.equals(zznv.zzp())) {
/* 21 */                                return VMStack.getStackClass2().getName();
                                    }
                                } catch (Throwable unused) {
                                }
                            }
/* 30 */                    if (!zznv.zzb || (stackTraceElementZza = zzos.zza(cls, 1)) == null) {
/* 44 */                        return null;
                            }
/* 39 */                    return stackTraceElementZza.getClassName();
                        }
                    };
                }

                public static Class<?> zzp() {
/* 1 */             return VMStack.getStackClass2();
                }

                public static String zzq() {
                    try {
/* 5 */                 return VMStack.getStackClass2().getName();
                    } catch (Throwable unused) {
/* 10 */                return null;
                    }
                }

                public static boolean zzt() {
                    try {
/* 10 */                Class.forName("dalvik.system.VMStack").getMethod("getStackClass2", null);
/* 23 */                return zza.class.getName().equals(zzq());
                    } catch (Throwable unused) {
/* 28 */                return false;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zznr
                public zznb zze(String str) {
/* 1 */             return zznz.zzb(str);
                }

                @Override // com.google.android.recaptcha.internal.zznr
                public zznq zzh() {
/* 1 */             return zzc;
                }

                @Override // com.google.android.recaptcha.internal.zznr
                public zzof zzj() {
/* 1 */             return zzoa.zzb();
                }

                @Override // com.google.android.recaptcha.internal.zznr
                public String zzm() {
/* 1 */             return "platform: Android";
                }
            }
