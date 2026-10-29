            package p000;

            import android.os.Parcel;
            import android.os.RemoteException;
            import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
            import com.google.android.gms.auth.api.signin.internal.zbs;
            import com.google.android.gms.common.api.Status;
            import com.google.android.gms.internal.p014authapi.zbc;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class oc3 extends AbstractC0955gi {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f14712a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public oc3(tr0 tr0Var, int i) {
/* 5 */             super(AbstractC0213ce.f2859b, tr0Var);
/* 1 */             this.f14712a = i;
                }

                @Override // com.google.android.gms.common.api.internal.BasePendingResult
                public final /* bridge */ /* synthetic */ p42 createFailedResult(Status status) {
/* 1 */             int i = this.f14712a;
/* 3 */             return status;
                }

                @Override // p000.AbstractC0955gi
                public final void doExecute(InterfaceC2359x8 interfaceC2359x8) throws RemoteException {
                    switch (this.f14712a) {
                        case 0:
/* 38 */                    mc3 mc3Var = (mc3) interfaceC2359x8;
/* 44 */                    zbs zbsVar = (zbs) mc3Var.getService();
/* 49 */                    nc3 nc3Var = new nc3(this, 0);
/* 52 */                    GoogleSignInOptions googleSignInOptions = mc3Var.f13700a;
/* 54 */                    Parcel parcelZba = zbsVar.zba();
/* 58 */                    zbc.zbd(parcelZba, nc3Var);
/* 61 */                    zbc.zbc(parcelZba, googleSignInOptions);
/* 66 */                    zbsVar.zbb(102, parcelZba);
                            break;
                        default:
/* 6 */                     mc3 mc3Var2 = (mc3) interfaceC2359x8;
/* 12 */                    zbs zbsVar2 = (zbs) mc3Var2.getService();
/* 17 */                    nc3 nc3Var2 = new nc3(this, 1);
/* 20 */                    GoogleSignInOptions googleSignInOptions2 = mc3Var2.f13700a;
/* 22 */                    Parcel parcelZba2 = zbsVar2.zba();
/* 26 */                    zbc.zbd(parcelZba2, nc3Var2);
/* 29 */                    zbc.zbc(parcelZba2, googleSignInOptions2);
/* 34 */                    zbsVar2.zbb(103, parcelZba2);
                            break;
                    }
                }

                @Override // p000.AbstractC0955gi, p000.InterfaceC0992hi
                public final /* bridge */ /* synthetic */ void setResult(Object obj) {
/* 3 */             setResult((p42) obj);
                }
            }
