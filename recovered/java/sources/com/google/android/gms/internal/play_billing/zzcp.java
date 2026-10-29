            package com.google.android.gms.internal.play_billing;

            import p000.AbstractC0886en;
            import p000.fm0;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            final class zzcp {
                private final Object zza;
                private final Object zzb;
                private final Object zzc;

                public zzcp(Object obj, Object obj2, Object obj3) {
/* 4 */             this.zza = obj;
/* 6 */             this.zzb = obj2;
/* 8 */             this.zzc = obj3;
                }

                public final IllegalArgumentException zza() {
/* 1 */             Object obj = this.zzc;
/* 3 */             Object obj2 = this.zzb;
/* 5 */             Object obj3 = this.zza;
/* 9 */             String strValueOf = String.valueOf(obj3);
/* 13 */            String strValueOf2 = String.valueOf(obj2);
/* 39 */            return new IllegalArgumentException(fm0.m3790p(AbstractC0886en.m3514r("Multiple entries with same key: ", strValueOf, "=", strValueOf2, " and "), String.valueOf(obj3), "=", String.valueOf(obj)));
                }
            }
