            package p000;

            import android.os.Bundle;
            import android.os.RemoteException;
            import android.text.TextUtils;
            import com.google.android.gms.internal.measurement.zzcu;
            import com.google.android.gms.measurement.internal.zzga;
            import com.google.android.gms.measurement.internal.zzgd;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.ArrayList;
            import java.util.Collections;
            import java.util.concurrent.atomic.AtomicReference;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 16 */    public final /* synthetic */ class ck3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f2974a = 0;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ String f2975b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ zzr f2976c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f2977d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Object f2978e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ Object f2979f;

                public /* synthetic */ ck3(zzjc zzjcVar, zzr zzrVar, Bundle bundle, zzgd zzgdVar, String str) {
/* 7 */             this.f2977d = zzjcVar;
/* 9 */             this.f2976c = zzrVar;
/* 11 */            this.f2978e = bundle;
/* 13 */            this.f2979f = zzgdVar;
/* 15 */            this.f2975b = str;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    AtomicReference atomicReference;
                    up3 up3Var;
                    switch (this.f2974a) {
                        case 0:
/* 256 */                   zzjc zzjcVar = (zzjc) this.f2977d;
/* 258 */                   zzr zzrVar = this.f2976c;
/* 262 */                   Bundle bundle = (Bundle) this.f2978e;
/* 266 */                   zzgd zzgdVar = (zzgd) this.f2979f;
/* 268 */                   String str = this.f2975b;
/* 270 */                   mp3 mp3Var = zzjcVar.f4212a;
/* 272 */                   mp3Var.m6731A();
                            try {
/* 279 */                       zzgdVar.mo2190f0(mp3Var.m6751b0(bundle, zzrVar));
/* 295 */                       return;
                            } catch (RemoteException e) {
/* 292 */                       mp3Var.mo4557a().f17538f.m8512c(str, "Failed to return trigger URIs for app", e);
/* 295 */                       return;
                            }
                        case 1:
/* 110 */                   AtomicReference atomicReference2 = (AtomicReference) this.f2977d;
                            synchronized (atomicReference2) {
                                try {
                                    try {
/* 116 */                               pn3 pn3Var = (pn3) this.f2979f;
/* 118 */                               zzga zzgaVar = pn3Var.f15188d;
/* 120 */                               if (zzgaVar == null) {
/* 126 */                                   uh3 uh3Var = ((ij3) pn3Var.f16749a).f9655f;
/* 128 */                                   ij3.m4555l(uh3Var);
/* 141 */                                   uh3Var.f17538f.m8513d("(legacy) Failed to get conditional properties; not connected to service", null, this.f2975b, (String) this.f2978e);
/* 146 */                                   atomicReference2.set(Collections.EMPTY_LIST);
/* 149 */                                   atomicReference2.notify();
/* 243 */                                   return;
                                        }
/* 164 */                               if (TextUtils.isEmpty(null)) {
/* 178 */                                   atomicReference2.set(zzgaVar.mo2184l0(this.f2975b, (String) this.f2978e, this.f2976c));
                                        } else {
/* 192 */                                   atomicReference2.set(zzgaVar.mo2188x(null, this.f2975b, (String) this.f2978e));
                                        }
/* 195 */                               pn3Var.m7517M();
/* 200 */                               atomicReference = (AtomicReference) this.f2977d;
/* 202 */                               atomicReference.notify();
/* 243 */                               return;
                                    } catch (RemoteException e2) {
/* 214 */                               uh3 uh3Var2 = ((ij3) ((pn3) this.f2979f).f16749a).f9655f;
/* 216 */                               ij3.m4555l(uh3Var2);
/* 225 */                               uh3Var2.f17538f.m8513d("(legacy) Failed to get conditional properties; remote exception", null, this.f2975b, e2);
/* 234 */                               ((AtomicReference) this.f2977d).set(Collections.EMPTY_LIST);
/* 239 */                               atomicReference = (AtomicReference) this.f2977d;
                                    }
                                } catch (Throwable th) {
/* 248 */                           ((AtomicReference) this.f2977d).notify();
/* 251 */                           throw th;
                                }
                            }
                            break;
                        default:
/* 8 */                     zzcu zzcuVar = (zzcu) this.f2978e;
/* 12 */                    String str2 = (String) this.f2977d;
/* 14 */                    String str3 = this.f2975b;
/* 18 */                    pn3 pn3Var2 = (pn3) this.f2979f;
/* 22 */                    ArrayList arrayList = new ArrayList();
                            try {
                                try {
/* 25 */                            zzga zzgaVar2 = pn3Var2.f15188d;
/* 27 */                            if (zzgaVar2 == null) {
/* 31 */                                ij3 ij3Var = (ij3) pn3Var2.f16749a;
/* 33 */                                uh3 uh3Var3 = ij3Var.f9655f;
/* 35 */                                ij3.m4555l(uh3Var3);
/* 42 */                                uh3Var3.f17538f.m8512c(str3, "Failed to get conditional properties; not connected to service", str2);
/* 45 */                                up3Var = ij3Var.f9668w;
                                    } else {
/* 60 */                                arrayList = up3.m9070o0(zzgaVar2.mo2184l0(str3, str2, this.f2976c));
/* 64 */                                pn3Var2.m7517M();
/* 91 */                                up3Var = ((ij3) pn3Var2.f16749a).f9668w;
                                    }
                                } catch (Throwable th2) {
/* 99 */                            up3 up3Var2 = ((ij3) pn3Var2.f16749a).f9668w;
/* 101 */                           ij3.m4553j(up3Var2);
/* 104 */                           up3Var2.m9111n0(zzcuVar, arrayList);
/* 107 */                           throw th2;
                                }
                            } catch (RemoteException e3) {
/* 75 */                        uh3 uh3Var4 = ((ij3) pn3Var2.f16749a).f9655f;
/* 77 */                        ij3.m4555l(uh3Var4);
/* 84 */                        uh3Var4.f17538f.m8513d("Failed to get conditional properties; remote exception", str3, str2, e3);
                            }
/* 47 */                    ij3.m4553j(up3Var);
/* 50 */                    up3Var.m9111n0(zzcuVar, arrayList);
/* 94 */                    return;
                    }
                }

/* 17 */        public ck3(pn3 pn3Var, String str, String str2, zzr zzrVar, zzcu zzcuVar) {
                    this.f2975b = str;
                    this.f2977d = str2;
                    this.f2976c = zzrVar;
                    this.f2978e = zzcuVar;
                    this.f2979f = pn3Var;
                }

/* 18 */        public ck3(pn3 pn3Var, AtomicReference atomicReference, String str, String str2, zzr zzrVar) {
                    this.f2977d = atomicReference;
                    this.f2975b = str;
                    this.f2978e = str2;
                    this.f2976c = zzrVar;
                    this.f2979f = pn3Var;
                }
            }
