            package com.google.android.gms.measurement.internal;

            import android.content.Context;
            import android.os.Binder;
            import android.os.Bundle;
            import android.text.TextUtils;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.ExecutionException;
            import java.util.concurrent.TimeUnit;
            import java.util.concurrent.TimeoutException;
            import p000.CallableC2139rc;
            import p000.RunnableC2265ur;
            import p000.as0;
            import p000.ck3;
            import p000.ij3;
            import p000.js0;
            import p000.kb1;
            import p000.kj3;
            import p000.kq2;
            import p000.mh3;
            import p000.mj3;
            import p000.mp3;
            import p000.pj3;
            import p000.rp3;
            import p000.sh3;
            import p000.uh3;
            import p000.up3;
            import p000.wr0;
            import p000.xt0;
            import p000.yd3;
            import p000.yy1;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zzjc extends zzfz {

                /* JADX INFO: renamed from: a */
                public final mp3 f4212a;

                /* JADX INFO: renamed from: b */
                public Boolean f4213b;

                /* JADX INFO: renamed from: c */
                public String f4214c;

                public zzjc(mp3 mp3Var) {
/* 3 */             super("com.google.android.gms.measurement.internal.IMeasurementService");
/* 6 */             kb1.m6061n(mp3Var);
/* 9 */             this.f4212a = mp3Var;
/* 12 */            this.f4214c = null;
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: A */
                public final void mo2168A(zzr zzrVar) {
/* 3 */             kb1.m6058k(zzrVar.f4240a);
/* 8 */             kb1.m6061n(zzrVar.f4247d0);
/* 17 */            m2192a(new mj3(this, zzrVar, 3));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: D */
                public final void mo2169D(zzpk zzpkVar, zzr zzrVar) {
/* 1 */             kb1.m6061n(zzpkVar);
/* 4 */             m2193b(zzrVar);
/* 14 */            m2195t0(new js0(13, this, zzpkVar, zzrVar));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: F */
                public final void mo2170F(zzbg zzbgVar, zzr zzrVar) {
/* 1 */             kb1.m6061n(zzbgVar);
/* 4 */             m2193b(zzrVar);
/* 14 */            m2195t0(new js0(11, this, zzbgVar, zzrVar));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: G */
                public final void mo2171G(zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 10 */            m2195t0(new mj3(this, zzrVar, 1));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: I */
                public final void mo2172I(zzr zzrVar) {
/* 3 */             kb1.m6058k(zzrVar.f4240a);
/* 8 */             kb1.m6061n(zzrVar.f4247d0);
/* 17 */            m2192a(new kj3(this, zzrVar, 2));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: M */
                public final void mo2173M(zzr zzrVar, zzaf zzafVar) {
/* 1 */             m2193b(zzrVar);
/* 15 */            m2195t0(new js0(this, zzrVar, zzafVar, 14, false));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: N */
                public final byte[] mo2174N(zzbg zzbgVar, String str) {
/* 1 */             kb1.m6058k(str);
/* 4 */             kb1.m6061n(zzbgVar);
/* 8 */             m2194s0(str, true);
/* 11 */            mp3 mp3Var = this.f4212a;
/* 17 */            sh3 sh3Var = mp3Var.mo4557a().f17533X;
/* 19 */            ij3 ij3Var = mp3Var.f13905W;
/* 21 */            mh3 mh3Var = ij3Var.f9639U;
/* 23 */            String str2 = zzbgVar.f4208a;
/* 31 */            sh3Var.m8511b(mh3Var.m6656a(str2), "Log and bundle. event");
/* 40 */            ((xt0) mp3Var.mo4562f()).getClass();
/* 50 */            long jNanoTime = System.nanoTime() / 1000000;
                    try {
/* 68 */                byte[] bArr = (byte[]) mp3Var.mo4558b().m1369H(new CallableC2139rc(this, zzbgVar, str)).get();
/* 70 */                if (bArr == null) {
/* 84 */                    mp3Var.mo4557a().f17538f.m8511b(uh3.m9013H(str), "Log and bundle returned null. appId");
/* 88 */                    bArr = new byte[0];
                        }
/* 101 */               ((xt0) mp3Var.mo4562f()).getClass();
/* 133 */               mp3Var.mo4557a().f17533X.m8513d("Log and bundle processed. event, size, time_ms", ij3Var.f9639U.m6656a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
/* 136 */               return bArr;
                    } catch (InterruptedException e) {
/* 93 */                e = e;
/* 155 */               mp3Var.mo4557a().f17538f.m8513d("Failed to log and bundle. appId, event, error", uh3.m9013H(str), ij3Var.f9639U.m6656a(str2), e);
/* 158 */               return null;
                    } catch (ExecutionException e2) {
/* 91 */                e = e2;
/* 155 */               mp3Var.mo4557a().f17538f.m8513d("Failed to log and bundle. appId, event, error", uh3.m9013H(str), ij3Var.f9639U.m6656a(str2), e);
/* 158 */               return null;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: P */
                public final zzao mo2175P(zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str = zzrVar.f4240a;
/* 6 */             kb1.m6058k(str);
/* 9 */             mp3 mp3Var = this.f4212a;
                    try {
/* 33 */                return (zzao) mp3Var.mo4558b().m1369H(new yd3(2, this, zzrVar)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 53 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str), "Failed to get consent. appId", e);
/* 59 */                return new zzao(null);
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: Q */
                public final void mo2176Q(Bundle bundle, zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str = zzrVar.f4240a;
/* 6 */             kb1.m6061n(str);
/* 19 */            m2195t0(new RunnableC2265ur(this, bundle, str, zzrVar, 4, false));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: V */
                public final void mo2177V(zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 10 */            m2195t0(new kj3(this, zzrVar, 0));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: Y */
                public final void mo2178Y(zzr zzrVar, zzon zzonVar, zzgg zzggVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str = zzrVar.f4240a;
/* 6 */             kb1.m6061n(str);
/* 25 */            this.f4212a.mo4558b().m1370I(new RunnableC2265ur(this, str, zzonVar, zzggVar, 2, false));
                }

                /* JADX INFO: renamed from: a */
                public final void m2192a(Runnable runnable) {
/* 1 */             mp3 mp3Var = this.f4212a;
/* 11 */            if (mp3Var.mo4558b().m1367F()) {
/* 13 */                runnable.run();
                    } else {
/* 21 */                mp3Var.mo4558b().m1372K(runnable);
                    }
                }

                /* JADX INFO: renamed from: b */
                public final void m2193b(zzr zzrVar) {
/* 1 */             kb1.m6061n(zzrVar);
/* 4 */             String str = zzrVar.f4240a;
/* 6 */             kb1.m6058k(str);
/* 10 */            m2194s0(str, false);
/* 21 */            this.f4212a.m6763j0().m9078D(zzrVar.f4242b);
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: d */
                public final List mo2179d(String str, String str2, String str3, boolean z) {
/* 2 */             m2194s0(str, true);
/* 5 */             mp3 mp3Var = this.f4212a;
                    try {
/* 29 */                List<rp3> list = (List) mp3Var.mo4558b().m1368G(new pj3(this, str, str2, str3, 1)).get();
/* 37 */                ArrayList arrayList = new ArrayList(list.size());
/* 48 */                for (rp3 rp3Var : list) {
/* 56 */                    if (z || !up3.m9067X(rp3Var.f16226c)) {
/* 77 */                        arrayList.add(new zzpk(rp3Var));
                            }
                        }
/* 81 */                return arrayList;
                    } catch (InterruptedException e) {
/* 70 */                e = e;
/* 94 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str), "Failed to get user properties as. appId", e);
/* 97 */                return Collections.EMPTY_LIST;
                    } catch (ExecutionException e2) {
/* 67 */                e = e2;
/* 94 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str), "Failed to get user properties as. appId", e);
/* 97 */                return Collections.EMPTY_LIST;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: d0 */
                public final void mo2180d0(zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 10 */            m2195t0(new mj3(this, zzrVar, 0));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: f */
                public final void mo2181f(zzah zzahVar, zzr zzrVar) {
/* 1 */             kb1.m6061n(zzahVar);
/* 6 */             kb1.m6061n(zzahVar.f4199c);
/* 9 */             m2193b(zzrVar);
/* 14 */            zzah zzahVar2 = new zzah(zzahVar);
/* 19 */            zzahVar2.f4197a = zzrVar.f4240a;
/* 28 */            m2195t0(new js0(10, this, zzahVar2, zzrVar));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: g0 */
                public final List mo2182g0(String str, String str2, boolean z, zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str3 = zzrVar.f4240a;
/* 6 */             kb1.m6061n(str3);
/* 9 */             mp3 mp3Var = this.f4212a;
                    try {
/* 32 */                List<rp3> list = (List) mp3Var.mo4558b().m1368G(new pj3(this, str3, str, str2, 0)).get();
/* 40 */                ArrayList arrayList = new ArrayList(list.size());
/* 51 */                for (rp3 rp3Var : list) {
/* 59 */                    if (z || !up3.m9067X(rp3Var.f16226c)) {
/* 80 */                        arrayList.add(new zzpk(rp3Var));
                            }
                        }
/* 84 */                return arrayList;
                    } catch (InterruptedException e) {
/* 73 */                e = e;
/* 97 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str3), "Failed to query user properties. appId", e);
/* 100 */               return Collections.EMPTY_LIST;
                    } catch (ExecutionException e2) {
/* 70 */                e = e2;
/* 97 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(str3), "Failed to query user properties. appId", e);
/* 100 */               return Collections.EMPTY_LIST;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: k0 */
                public final String mo2183k0(zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             mp3 mp3Var = this.f4212a;
                    try {
/* 27 */                return (String) mp3Var.mo4558b().m1368G(new yd3(mp3Var, zzrVar)).get(30000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e) {
/* 49 */                mp3Var.mo4557a().f17538f.m8512c(uh3.m9013H(zzrVar.f4240a), "Failed to get app instance id. appId", e);
/* 52 */                return null;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: l0 */
                public final List mo2184l0(String str, String str2, zzr zzrVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str3 = zzrVar.f4240a;
/* 6 */             kb1.m6061n(str3);
/* 9 */             mp3 mp3Var = this.f4212a;
                    try {
/* 32 */                return (List) mp3Var.mo4558b().m1368G(new pj3(this, str3, str, str2, 2)).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 48 */                mp3Var.mo4557a().f17538f.m8511b(e, "Failed to get conditional user properties");
/* 51 */                return Collections.EMPTY_LIST;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: n */
                public final void mo2185n(long j, String str, String str2, String str3) {
/* 12 */            m2195t0(new kq2(this, str2, str3, str, j, 1));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: p */
                public final void mo2186p(zzr zzrVar) {
/* 1 */             String str = zzrVar.f4240a;
/* 3 */             kb1.m6058k(str);
/* 7 */             m2194s0(str, false);
/* 16 */            m2195t0(new kj3(this, zzrVar, 1));
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: q0 */
                public final void mo2187q0(zzr zzrVar) {
/* 3 */             kb1.m6058k(zzrVar.f4240a);
/* 8 */             kb1.m6061n(zzrVar.f4247d0);
/* 17 */            m2192a(new mj3(this, zzrVar, 2));
                }

                /* JADX INFO: renamed from: s0 */
                public final void m2194s0(String str, boolean z) {
/* 3 */             boolean zIsEmpty = TextUtils.isEmpty(str);
/* 7 */             mp3 mp3Var = this.f4212a;
/* 9 */             if (zIsEmpty) {
/* 157 */               mp3Var.mo4557a().f17538f.m8510a("Measurement Service called without app package");
/* 165 */               throw new SecurityException("Measurement Service called without app package");
                    }
/* 11 */            if (z) {
                        try {
/* 15 */                    if (this.f4213b == null) {
/* 25 */                        boolean z2 = true;
/* 26 */                        if (!"com.google.android.gms".equals(this.f4214c) && !yy1.m10228x(mp3Var.f13905W.f9645a, Binder.getCallingUid()) && !as0.m1153b(mp3Var.f13905W.f9645a).m1158d(Binder.getCallingUid())) {
/* 61 */                            z2 = false;
                                }
/* 69 */                        this.f4213b = Boolean.valueOf(z2);
                            }
/* 77 */                    if (this.f4213b.booleanValue()) {
/* 109 */                       return;
                            }
                        } catch (SecurityException e) {
/* 145 */                   mp3Var.mo4557a().f17538f.m8511b(uh3.m9013H(str), "Measurement Service called with invalid calling package. appId");
/* 148 */                   throw e;
                        }
                    }
/* 81 */            if (this.f4214c == null) {
/* 85 */                Context context = mp3Var.f13905W.f9645a;
/* 87 */                int callingUid = Binder.getCallingUid();
/* 91 */                int i = wr0.f18787e;
/* 97 */                if (yy1.m10205L(context, str, callingUid)) {
/* 99 */                    this.f4214c = str;
                        }
                    }
/* 107 */           if (str.equals(this.f4214c)) {
/* 109 */               return;
                    }
/* 132 */           throw new SecurityException("Unknown calling package name '" + str + "'.");
                }

                /* JADX INFO: renamed from: t0 */
                public final void m2195t0(Runnable runnable) {
/* 1 */             mp3 mp3Var = this.f4212a;
/* 11 */            if (mp3Var.mo4558b().m1367F()) {
/* 13 */                runnable.run();
                    } else {
/* 21 */                mp3Var.mo4558b().m1370I(runnable);
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: x */
                public final List mo2188x(String str, String str2, String str3) {
/* 2 */             m2194s0(str, true);
/* 5 */             mp3 mp3Var = this.f4212a;
                    try {
/* 29 */                return (List) mp3Var.mo4558b().m1368G(new pj3(this, str, str2, str3, 3)).get();
                    } catch (InterruptedException | ExecutionException e) {
/* 45 */                mp3Var.mo4557a().f17538f.m8511b(e, "Failed to get conditional user properties as");
/* 48 */                return Collections.EMPTY_LIST;
                    }
                }

                @Override // com.google.android.gms.measurement.internal.zzga
                /* JADX INFO: renamed from: z */
                public final void mo2189z(zzr zzrVar, Bundle bundle, zzgd zzgdVar) {
/* 1 */             m2193b(zzrVar);
/* 4 */             String str = zzrVar.f4240a;
/* 6 */             kb1.m6061n(str);
/* 24 */            this.f4212a.mo4558b().m1370I(new ck3(this, zzrVar, bundle, zzgdVar, str));
                }
            }
