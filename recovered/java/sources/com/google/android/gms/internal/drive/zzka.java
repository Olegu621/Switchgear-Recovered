            package com.google.android.gms.internal.drive;

            import p000.f42;
            
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzka {
                private static final zzjy<?> zzoq = new zzjz();
                private static final zzjy<?> zzor = zzck();

                private static zzjy<?> zzck() {
                    try {
/* 16 */                return (zzjy) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
                    } catch (Exception unused) {
/* 1 */                 return null;
                    }
                }

                public static zzjy<?> zzcl() {
/* 1 */             return zzoq;
                }

                public static zzjy<?> zzcm() {
/* 1 */             zzjy<?> zzjyVar = zzor;
/* 3 */             if (zzjyVar != null) {
/* 5 */                 return zzjyVar;
                    }
/* 8 */             f42.m3656l("Protobuf runtime is not correctly loaded.");
/* 11 */            return null;
                }
            }
