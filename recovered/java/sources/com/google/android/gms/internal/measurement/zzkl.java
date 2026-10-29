            package com.google.android.gms.internal.measurement;

            import android.content.Context;
            import android.net.Uri;
            import java.io.Serializable;
            import java.util.concurrent.atomic.AtomicInteger;
            import java.util.concurrent.atomic.AtomicReference;
            import p000.C0826d;
            import p000.C1951n4;
            import p000.lq1;
            import p000.qi2;
            import p000.ri2;
            import p000.si2;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class zzkl {
                public static final /* synthetic */ int zzc = 0;
                private static final Object zzd = new Object();
                private static volatile zzkg zze;
                private static volatile boolean zzf;
                private static final AtomicInteger zzh;
                final zzkf zza;
                final String zzb;
                private Object zzg;
                private volatile int zzi = -1;
                private volatile Object zzj;
                private volatile boolean zzk;

                static {
/* 10 */            new AtomicReference();
/* 15 */            if (zzkj.zza != null) {
/* 22 */                zzh = new AtomicInteger();
                    } else {
/* 27 */                C1951n4.m6868s("BuildInfo must be non-null");
                    }
                }

                public /* synthetic */ zzkl(zzkf zzkfVar, String str, Object obj, boolean z, byte[] bArr) {
/* 9 */             if (zzkfVar.zza == null) {
/* 23 */                C1951n4.m6859j("Must pass a valid SharedPreferences file name or ContentProvider URI");
/* 27 */                throw null;
                    }
/* 11 */            this.zza = zzkfVar;
/* 13 */            this.zzb = str;
/* 15 */            this.zzg = obj;
/* 18 */            this.zzk = false;
                }

                public static void zzb(final Context context) {
                    qi2 ri2Var;
/* 3 */             if (zze != null || context == null) {
/* 91 */                return;
                    }
/* 8 */             Object obj = zzd;
                    synchronized (obj) {
                        try {
/* 13 */                    if (zze == null) {
                                synchronized (obj) {
                                    try {
/* 16 */                                zzkg zzkgVar = zze;
/* 18 */                                Context applicationContext = context.getApplicationContext();
/* 22 */                                if (applicationContext != null) {
/* 24 */                                    context = applicationContext;
                                        }
/* 25 */                                if (zzkgVar == null || zzkgVar.zza() != context) {
/* 36 */                                    if (zzkgVar != null) {
/* 38 */                                        zzjq.zzd();
/* 41 */                                        zzkn.zzb();
/* 44 */                                        zzjx.zzc();
                                            }
/* 49 */                                    qi2 qi2Var = new qi2() { // from class: com.google.android.gms.internal.measurement.zzkk
                                                @Override // p000.qi2
                                                public final /* synthetic */ Object get() {
/* 1 */                                             int i = zzkl.zzc;
/* 5 */                                             return zzjy.zza(context);
                                                }
                                            };
/* 54 */                                    if (qi2Var instanceof Serializable) {
/* 58 */                                        ri2Var = new ri2(qi2Var);
                                            } else {
/* 64 */                                        si2 si2Var = new si2();
/* 67 */                                        si2Var.f16647a = qi2Var;
                                                ri2Var = si2Var;
                                            }
/* 74 */                                    zze = new zzjn(context, ri2Var);
/* 78 */                                    zzh.incrementAndGet();
                                        }
                                    } catch (Throwable th) {
/* 84 */                                throw th;
                                    }
                                }
                            }
                        } catch (Throwable th2) {
/* 90 */                    throw th2;
                        }
                    }
                }

                public static void zzc() {
/* 3 */             zzh.incrementAndGet();
                }

                public abstract Object zza(Object obj);

                /* JADX WARN: Code duplicated, block: B:16:0x0045 A[PHI: r2
  0x0045: PHI (r2v1 lq1) = (r2v0 lq1), (r2v0 lq1), (r2v5 lq1) binds: [B:8:0x0014, B:10:0x001a, B:12:0x002d] A[DONT_GENERATE, DONT_INLINE]] */
                public final Object zzd() {
                    String strZza;
                    String strZzb;
                    Object objZze;
/* 3 */             int i = zzh.get();
/* 9 */             if (this.zzi < i) {
                        synchronized (this) {
                            try {
/* 14 */                        if (this.zzi < i) {
/* 16 */                            zzkg zzkgVar = zze;
/* 18 */                            lq1 lq1Var = C0826d.f6944a;
/* 20 */                            Object objZza = null;
/* 21 */                            if (zzkgVar == null || zzkgVar.zzb() == null) {
/* 70 */                                strZza = null;
                                    } else {
/* 29 */                                qi2 qi2VarZzb = zzkgVar.zzb();
/* 33 */                                qi2VarZzb.getClass();
/* 40 */                                lq1Var = (lq1) qi2VarZzb.get();
/* 46 */                                if (lq1Var.mo2902b()) {
/* 52 */                                    zzjs zzjsVar = (zzjs) lq1Var.mo2901a();
/* 54 */                                    zzkf zzkfVar = this.zza;
/* 62 */                                    strZza = zzjsVar.zza(zzkfVar.zza, null, zzkfVar.zzc, this.zzb);
                                        } else {
/* 70 */                                    strZza = null;
                                        }
                                    }
/* 78 */                            if (!(zzkgVar != null)) {
/* 190 */                               throw new IllegalStateException("Must call PhenotypeFlagInitializer.maybeInit() first");
                                    }
/* 80 */                            zzkf zzkfVar2 = this.zza;
/* 82 */                            Uri uri = zzkfVar2.zza;
/* 84 */                            if (uri == null) {
/* 181 */                               zzkgVar.zza();
/* 184 */                               throw null;
                                    }
/* 111 */                           zzjq zzjqVarZza = zzjz.zza(zzkgVar.zza(), uri) ? zzjq.zza(zzkgVar.zza().getContentResolver(), uri, zzki.zza) : null;
/* 127 */                           Object objZza2 = (zzjqVarZza == null || (objZze = zzjqVarZza.zze(this.zzb)) == null) ? null : zza(objZze);
/* 128 */                           if (objZza2 == null) {
/* 133 */                               if (!zzkfVar2.zzd && (strZzb = zzjx.zza(zzkgVar.zza()).zze(this.zzb)) != null) {
/* 151 */                                   objZza = zza(strZzb);
                                        }
/* 160 */                               objZza2 = objZza == null ? this.zzg : objZza;
                                    }
/* 165 */                           if (lq1Var.mo2902b()) {
/* 172 */                               objZza2 = strZza == null ? this.zzg : zza(strZza);
                                    }
/* 176 */                           this.zzj = objZza2;
/* 178 */                           this.zzi = i;
                                }
                            } catch (Throwable th) {
/* 194 */                       throw th;
                            }
                        }
                    }
/* 195 */           return this.zzj;
                }
            }
