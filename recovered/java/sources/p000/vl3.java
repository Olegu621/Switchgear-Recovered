            package p000;

            import android.app.Service;
            import android.content.Intent;
            import java.util.Map;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 14 */    public final /* synthetic */ class vl3 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f18243a = 1;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ int f18244b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ Object f18245c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ Object f18246d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ Cloneable f18247e;

                /* JADX WARN: Multi-variable type inference failed */
                public /* synthetic */ vl3(eu0 eu0Var, int i, Exception exc, byte[] bArr, Map map) {
/* 7 */             this.f18245c = eu0Var;
/* 9 */             this.f18244b = i;
/* 11 */            this.f18246d = exc;
/* 13 */            this.f18247e = bArr;
                }

                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
/* 1 */             int i = this.f18243a;
/* 3 */             Object obj = this.f18247e;
/* 5 */             Object obj2 = this.f18246d;
/* 7 */             int i2 = this.f18244b;
/* 9 */             Object obj3 = this.f18245c;
                    switch (i) {
                        case 0:
/* 75 */                    ((ul3) ((eu0) obj3).f7881e).mo173b(i2, (Exception) obj2, (byte[]) obj);
                            break;
                        default:
/* 16 */                    uh3 uh3Var = (uh3) obj2;
/* 18 */                    Intent intent = (Intent) obj;
/* 22 */                    Service service = (Service) ((ac3) obj3).f184b;
/* 25 */                    vn3 vn3Var = (vn3) service;
/* 31 */                    if (vn3Var.zza(i2)) {
/* 41 */                        uh3Var.f17534Y.m8511b(Integer.valueOf(i2), "Local AppMeasurementService processed last upload request. StartId");
/* 49 */                        uh3 uh3Var2 = ij3.m4556r(service, null, null).f9655f;
/* 51 */                        ij3.m4555l(uh3Var2);
/* 58 */                        uh3Var2.f17534Y.m8510a("Completed wakeful intent.");
/* 61 */                        vn3Var.mo2158a(intent);
                            }
                            break;
                    }
                }

/* 15 */        public /* synthetic */ vl3(ac3 ac3Var, int i, uh3 uh3Var, Intent intent) {
                    this.f18245c = ac3Var;
                    this.f18244b = i;
                    this.f18246d = uh3Var;
                    this.f18247e = intent;
                }
            }
