            package com.google.android.recaptcha.internal;

            import p000.C1951n4;
            import p000.ds0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzsg implements zztq {
                private static final zzsg zza = new zzsg();

                private zzsg() {
                }

                public static zzsg zza() {
/* 1 */             return zza;
                }

                @Override // com.google.android.recaptcha.internal.zztq
                public final zztp zzb(Class cls) {
/* 8 */             if (!zzsn.class.isAssignableFrom(cls)) {
/* 51 */                C1951n4.m6859j("Unsupported message type: ".concat(cls.getName()));
/* 7 */                 return null;
                    }
                    try {
/* 23 */                return (zztp) zzsn.zzu(cls.asSubclass(zzsn.class)).zzh(3, null, null);
                    } catch (Exception e) {
/* 37 */                ds0.m3198o("Unable to get message info for ".concat(cls.getName()), e);
/* 7 */                 return null;
                    }
                }

                @Override // com.google.android.recaptcha.internal.zztq
                public final boolean zzc(Class cls) {
/* 3 */             return zzsn.class.isAssignableFrom(cls);
                }
            }
