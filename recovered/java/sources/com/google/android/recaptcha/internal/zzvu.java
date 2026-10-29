            package com.google.android.recaptcha.internal;

            import java.util.Iterator;
            import okhttp3.HttpUrl;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzvu extends zzsn implements zztt {
                private static final zzvu zzb;
                private static volatile zzua zzd;
                private int zze;
                private String zzf = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzg = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzh = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzi = HttpUrl.FRAGMENT_ENCODE_SET;
                private String zzj = HttpUrl.FRAGMENT_ENCODE_SET;
                private zzss zzk = zzsn.zzy();

                static {
/* 3 */             zzvu zzvuVar = new zzvu();
/* 6 */             zzb = zzvuVar;
/* 10 */            zzsn.zzI(zzvu.class, zzvuVar);
                }

                private zzvu() {
                }

                public static /* synthetic */ void zzM(zzvu zzvuVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzvuVar.zzf = str;
                }

                public static /* synthetic */ void zzN(zzvu zzvuVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzvuVar.zzi = str;
                }

                public static zzvr zzf() {
/* 7 */             return (zzvr) zzb.zzq();
                }

                public static /* synthetic */ void zzi(zzvu zzvuVar, Iterable iterable) {
/* 1 */             zzss zzssVar = zzvuVar.zzk;
/* 7 */             if (!zzssVar.zzc()) {
/* 13 */                zzvuVar.zzk = zzsn.zzz(zzssVar);
                    }
/* 15 */            Iterator it = iterable.iterator();
/* 23 */            while (it.hasNext()) {
/* 37 */                zzvuVar.zzk.zzh(((zzvs) it.next()).zza());
                    }
                }

                public static /* synthetic */ void zzk(zzvu zzvuVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzvuVar.zzj = str;
                }

                public static /* synthetic */ void zzl(zzvu zzvuVar, String str) {
/* 1 */             str.getClass();
/* 4 */             zzvuVar.zzh = str;
                }

                @Override // com.google.android.recaptcha.internal.zzsn
                public final Object zzh(int i, Object obj, Object obj2) {
                    zzua zzsiVar;
/* 1 */             int i2 = i - 1;
/* 3 */             if (i2 == 0) {
/* 94 */                return (byte) 1;
                    }
/* 6 */             if (i2 == 2) {
/* 88 */                return zzsn.zzF(zzb, "\u0000\u0007\u0000\u0000\u0001\u0007\u0007\u0000\u0001\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004Ȉ\u0005Ȉ\u0006Ȉ\u0007,", new Object[]{"zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk"});
                    }
/* 9 */             if (i2 == 3) {
/* 62 */                return new zzvu();
                    }
/* 12 */            zzvt zzvtVar = null;
/* 13 */            if (i2 == 4) {
/* 56 */                return new zzvr(zzvtVar);
                    }
/* 16 */            if (i2 == 5) {
/* 51 */                return zzb;
                    }
/* 19 */            if (i2 != 6) {
/* 50 */                throw null;
                    }
/* 21 */            zzua zzuaVar = zzd;
/* 23 */            if (zzuaVar != null) {
/* 49 */                return zzuaVar;
                    }
                    synchronized (zzvu.class) {
                        try {
/* 28 */                    zzsiVar = zzd;
/* 30 */                    if (zzsiVar == null) {
/* 36 */                        zzsiVar = new zzsi(zzb);
/* 39 */                        zzd = zzsiVar;
                            }
                        } catch (Throwable th) {
/* 48 */                    throw th;
                        }
                    }
/* 46 */            return zzsiVar;
                }
            }
