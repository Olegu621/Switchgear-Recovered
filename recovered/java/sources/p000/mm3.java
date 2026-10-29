            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzpk;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.Collections;
            import java.util.List;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 18 */    public final class mm3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13859a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f13860b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ String f13861c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zzr f13862d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ boolean f13863e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ pn3 f13864f;

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ Object f13865i;

                public mm3(pn3 pn3Var, String str, String str2, zzr zzrVar, boolean z, zzcu zzcuVar) {
/* 7 */             this.f13860b = str;
/* 9 */             this.f13861c = str2;
/* 11 */            this.f13862d = zzrVar;
/* 13 */            this.f13863e = z;
/* 15 */            this.f13865i = zzcuVar;
/* 17 */            this.f13864f = pn3Var;
                }

                @Override // java.lang.Runnable
                public final void run() throws Throwable {
                    up3 up3Var;
                    AtomicReference atomicReference;
                    switch (this.f13859a) {
                        case 0:
/* 146 */                   String str = this.f13861c;
/* 148 */                   String str2 = this.f13860b;
/* 152 */                   zzcu zzcuVar = (zzcu) this.f13865i;
/* 154 */                   pn3 pn3Var = this.f13864f;
/* 158 */                   Bundle bundle = new Bundle();
                            try {
                                try {
/* 161 */                           zzga zzgaVar = pn3Var.f15188d;
/* 165 */                           ij3 ij3Var = (ij3) pn3Var.f16749a;
/* 167 */                           if (zzgaVar == null) {
/* 169 */                               uh3 uh3Var = ij3Var.f9655f;
/* 171 */                               ij3.m4555l(uh3Var);
/* 178 */                               uh3Var.f17538f.m8512c(str2, "Failed to get user properties; not connected to service", str);
/* 181 */                               up3Var = ij3Var.f9668w;
/* 183 */                               ij3.m4553j(up3Var);
/* 186 */                               up3Var.m9110m0(zzcuVar, bundle);
/* 302 */                               return;
                                    }
/* 200 */                           List<zzpk> listMo2182g0 = zzgaVar.mo2182g0(str2, str, this.f13863e, this.f13862d);
/* 206 */                           Bundle bundle2 = new Bundle();
/* 209 */                           if (listMo2182g0 != null) {
/* 220 */                               for (zzpk zzpkVar : listMo2182g0) {
/* 228 */                                   String str3 = zzpkVar.f4231e;
/* 230 */                                   String str4 = zzpkVar.f4228b;
/* 232 */                                   if (str3 != null) {
/* 234 */                                       bundle2.putString(str4, str3);
                                            } else {
/* 238 */                                       Long l = zzpkVar.f4230d;
/* 240 */                                       if (l != null) {
/* 246 */                                           bundle2.putLong(str4, l.longValue());
                                                } else {
/* 250 */                                           Double d = zzpkVar.f4233i;
/* 252 */                                           if (d != null) {
/* 258 */                                               bundle2.putDouble(str4, d.doubleValue());
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    try {
/* 262 */                               pn3Var.m7517M();
/* 265 */                               up3 up3Var2 = ij3Var.f9668w;
/* 267 */                               ij3.m4553j(up3Var2);
/* 270 */                               up3Var2.m9110m0(zzcuVar, bundle2);
/* 302 */                               return;
                                    } catch (RemoteException e) {
/* 277 */                               e = e;
/* 278 */                               bundle = bundle2;
/* 283 */                               uh3 uh3Var2 = ((ij3) pn3Var.f16749a).f9655f;
/* 285 */                               ij3.m4555l(uh3Var2);
/* 292 */                               uh3Var2.f17538f.m8512c(str2, "Failed to get user properties; remote exception", e);
/* 299 */                               up3Var = ((ij3) pn3Var.f16749a).f9668w;
/* 183 */                               ij3.m4553j(up3Var);
/* 186 */                               up3Var.m9110m0(zzcuVar, bundle);
/* 302 */                               return;
                                    } catch (Throwable th) {
/* 274 */                               th = th;
/* 275 */                               bundle = bundle2;
/* 307 */                               up3 up3Var3 = ((ij3) pn3Var.f16749a).f9668w;
/* 309 */                               ij3.m4553j(up3Var3);
/* 312 */                               up3Var3.m9110m0(zzcuVar, bundle);
/* 315 */                               throw th;
                                    }
                                } catch (RemoteException e2) {
/* 194 */                           e = e2;
                                }
                            } catch (Throwable th2) {
/* 191 */                       th = th2;
                            }
                            break;
                        default:
/* 8 */                     AtomicReference atomicReference2 = (AtomicReference) this.f13865i;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 12 */                                pn3 pn3Var2 = this.f13864f;
/* 14 */                                zzga zzgaVar2 = pn3Var2.f15188d;
/* 16 */                                if (zzgaVar2 == null) {
/* 22 */                                    uh3 uh3Var3 = ((ij3) pn3Var2.f16749a).f9655f;
/* 24 */                                    ij3.m4555l(uh3Var3);
/* 35 */                                    uh3Var3.f17538f.m8513d("(legacy) Failed to get user properties; not connected to service", null, this.f13860b, this.f13861c);
/* 40 */                                    atomicReference2.set(Collections.EMPTY_LIST);
/* 43 */                                    atomicReference2.notify();
/* 135 */                                   return;
                                        }
/* 58 */                                if (TextUtils.isEmpty(null)) {
/* 72 */                                    atomicReference2.set(zzgaVar2.mo2182g0(this.f13860b, this.f13861c, this.f13863e, this.f13862d));
                                        } else {
/* 86 */                                    atomicReference2.set(zzgaVar2.mo2179d(null, this.f13860b, this.f13861c, this.f13863e));
                                        }
/* 89 */                                pn3Var2.m7517M();
/* 94 */                                atomicReference = (AtomicReference) this.f13865i;
/* 96 */                                atomicReference.notify();
/* 135 */                               return;
                                    } catch (RemoteException e3) {
/* 106 */                               uh3 uh3Var4 = ((ij3) this.f13864f.f16749a).f9655f;
/* 108 */                               ij3.m4555l(uh3Var4);
/* 117 */                               uh3Var4.f17538f.m8513d("(legacy) Failed to get user properties; remote exception", null, this.f13860b, e3);
/* 126 */                               ((AtomicReference) this.f13865i).set(Collections.EMPTY_LIST);
/* 131 */                               atomicReference = (AtomicReference) this.f13865i;
                                    }
                                } catch (Throwable th3) {
/* 140 */                           ((AtomicReference) this.f13865i).notify();
/* 143 */                           throw th3;
                                }
                            }
                            break;
                    }
                }

/* 19 */        public mm3(pn3 pn3Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar, boolean z) {
                    this.f13865i = atomicReference;
                    this.f13860b = str;
                    this.f13861c = str2;
                    this.f13862d = zzrVar;
                    this.f13863e = z;
                    this.f13864f = pn3Var;
                }
            }
