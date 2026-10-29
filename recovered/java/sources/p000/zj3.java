            package p000;

            import android.os.Bundle;
            import com.google.android.gms.measurement.internal.zzjc;
            import com.google.android.gms.measurement.internal.zzr;
            import java.util.Objects;
            import java.util.concurrent.Callable;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zj3 implements Callable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f20206a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ zzr f20207b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Bundle f20208c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ zzjc f20209d;

                public zj3(zzjc zzjcVar, zzr zzrVar, Bundle bundle, int i) {
/* 1 */             this.f20206a = i;
                    switch (i) {
                        case 1:
/* 22 */                    this.f20207b = zzrVar;
/* 24 */                    this.f20208c = bundle;
/* 26 */                    Objects.requireNonNull(zzjcVar);
/* 29 */                    this.f20209d = zzjcVar;
                            break;
                        default:
/* 9 */                     this.f20207b = zzrVar;
/* 11 */                    this.f20208c = bundle;
/* 13 */                    Objects.requireNonNull(zzjcVar);
/* 16 */                    this.f20209d = zzjcVar;
                            break;
                    }
                }

                @Override // java.util.concurrent.Callable
                public final /* synthetic */ Object call() {
/* 1 */             int i = this.f20206a;
/* 3 */             Bundle bundle = this.f20208c;
/* 5 */             zzr zzrVar = this.f20207b;
/* 7 */             zzjc zzjcVar = this.f20209d;
                    switch (i) {
                        case 0:
/* 26 */                    zzjcVar.f4212a.m6731A();
                            break;
                        default:
/* 14 */                    zzjcVar.f4212a.m6731A();
                            break;
                    }
/* 19 */            return zzjcVar.f4212a.m6751b0(bundle, zzrVar);
                }
            }
