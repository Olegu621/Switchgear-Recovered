            package com.google.android.gms.internal.auth;

            import p000.f42;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzen {
                private static final zzel zza = new zzem();
                private static final zzel zzb;

                static {
/* 8 */             zzel zzelVar = null;
                    try {
/* 23 */                zzelVar = (zzel) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception unused) {
                    }
/* 26 */            zzb = zzelVar;
                }

                public static zzel zza() {
/* 1 */             zzel zzelVar = zzb;
/* 3 */             if (zzelVar != null) {
/* 5 */                 return zzelVar;
                    }
/* 8 */             f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 11 */            return null;
                }

                public static zzel zzb() {
/* 1 */             return zza;
                }
            }
