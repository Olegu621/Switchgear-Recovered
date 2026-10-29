            package p000;

            import com.google.android.gms.internal.measurement.zzgl;
            import com.google.android.gms.internal.measurement.zzin;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzr;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mj3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13823a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f13824b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zzjc f13825c;

                public /* synthetic */ mj3(zzjc zzjcVar, zzr zzrVar, int i) {
/* 1 */             this.f13823a = i;
/* 3 */             this.f13824b = zzrVar;
/* 5 */             this.f13825c = zzjcVar;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
/* 1 */             int i = this.f13823a;
/* 3 */             zzr zzrVar = this.f13824b;
/* 5 */             zzjc zzjcVar = this.f13825c;
                    switch (i) {
                        case 0:
/* 76 */                    zzjcVar.f4212a.m6731A();
/* 79 */                    mp3 mp3Var = zzjcVar.f4212a;
/* 85 */                    mp3Var.mo4558b().mo1375y();
/* 88 */                    mp3Var.m6765k0();
/* 91 */                    kb1.m6061n(zzrVar);
/* 94 */                    String str = zzrVar.f4240a;
/* 96 */                    kb1.m6058k(str);
/* 110 */                   int i2 = 0;
/* 111 */                   if (mp3Var.m6753d0().m7406J(null, vg3.f18176z0)) {
/* 119 */                       ((xt0) mp3Var.mo4562f()).getClass();
/* 122 */                       long jCurrentTimeMillis = System.currentTimeMillis();
/* 132 */                       int iM7404H = mp3Var.m6753d0().m7404H(null, vg3.f18140i0);
/* 136 */                       mp3Var.m6753d0();
/* 151 */                       long jLongValue = jCurrentTimeMillis - ((Long) vg3.f18127e.m9011a(null)).longValue();
/* 152 */                       while (i2 < iM7404H && mp3Var.m6735G(null, jLongValue)) {
/* 160 */                           i2++;
                                }
                            } else {
/* 163 */                       mp3Var.m6753d0();
/* 174 */                       long jIntValue = ((Integer) vg3.f18147l.m9011a(null)).intValue();
/* 182 */                       while (i2 < jIntValue && mp3Var.m6735G(str, 0L)) {
/* 192 */                           i2++;
                                }
                            }
/* 205 */                   if (mp3Var.m6753d0().m7406J(null, vg3.f18064A0)) {
/* 211 */                       mp3Var.mo4558b().mo1375y();
/* 214 */                       mp3Var.m6734F();
                            }
/* 217 */                   yo3 yo3Var = mp3Var.f13903U;
/* 221 */                   zzin zzinVarZzb = zzin.zzb(zzrVar.f4262p0);
/* 225 */                   yo3Var.mo1375y();
/* 230 */                   if (zzinVarZzb == zzin.CLIENT_UPLOAD_ELIGIBLE && !yo3.m10165C(str)) {
/* 241 */                       vi3 vi3Var = yo3Var.f15676b.f13909a;
/* 243 */                       mp3.m6728S(vi3Var);
/* 246 */                       zzgl zzglVarM9286L = vi3Var.m9286L(str);
/* 250 */                       if (zzglVarM9286L != null && zzglVarM9286L.zzp() && !zzglVarM9286L.zzq().zzd().isEmpty()) {
/* 280 */                           mp3Var.mo4557a().f17534Y.m8511b(str, "[sgtm] Going background, trigger client side upload. appId");
/* 289 */                           ((xt0) mp3Var.mo4562f()).getClass();
/* 296 */                           mp3Var.m6777r(str, System.currentTimeMillis());
                                    break;
                                }
                            }
                            break;
                        case 1:
/* 50 */                    zzjcVar.f4212a.m6731A();
/* 53 */                    mp3 mp3Var2 = zzjcVar.f4212a;
/* 59 */                    mp3Var2.mo4558b().mo1375y();
/* 62 */                    mp3Var2.m6765k0();
/* 67 */                    kb1.m6058k(zzrVar.f4240a);
/* 70 */                    mp3Var2.m6750a0(zzrVar);
                            break;
                        case 2:
/* 21 */                    zzjcVar.f4212a.m6731A();
/* 24 */                    mp3 mp3Var3 = zzjcVar.f4212a;
/* 30 */                    mp3Var3.mo4558b().mo1375y();
/* 33 */                    mp3Var3.m6765k0();
/* 38 */                    kb1.m6058k(zzrVar.f4240a);
/* 41 */                    mp3Var3.m6767l0(zzrVar);
/* 44 */                    mp3Var3.m6769m0(zzrVar);
                            break;
                        default:
/* 10 */                    mp3 mp3Var4 = zzjcVar.f4212a;
/* 12 */                    mp3Var4.m6731A();
/* 15 */                    mp3Var4.m6767l0(zzrVar);
                            break;
                    }
                }
            }
