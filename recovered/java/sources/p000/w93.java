            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class w93 extends ra3 {

                /* JADX INFO: renamed from: i */
                public final /* synthetic */ IBinder f18486i;

                /* JADX INFO: renamed from: v */
                public final /* synthetic */ y93 f18487v;

                public w93(y93 y93Var, IBinder iBinder) {
/* 1 */             this.f18486i = iBinder;
/* 3 */             this.f18487v = y93Var;
                }

                @Override // p000.ra3
                /* JADX INFO: renamed from: b */
                public final void mo2453b() {
/* 5 */             z93 z93Var = (z93) this.f18487v.f19550b;
/* 17 */            z93Var.f20017n = (IInterface) z93Var.f20012i.mo2451a(this.f18486i);
/* 19 */            qa3 qa3Var = z93Var.f20005b;
/* 26 */            qa3Var.m7756b("linkToDeath", new Object[0]);
                    try {
/* 37 */                z93Var.f20017n.asBinder().linkToDeath(z93Var.f20014k, 0);
                    } catch (RemoteException e) {
/* 46 */                qa3Var.m7755a(e, "linkToDeath failed", new Object[0]);
                    }
/* 49 */            z93Var.f20010g = false;
/* 53 */            Iterator it = z93Var.f20007d.iterator();
/* 61 */            while (it.hasNext()) {
/* 69 */                ((Runnable) it.next()).run();
                    }
/* 75 */            z93Var.f20007d.clear();
                }
            }
