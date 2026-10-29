            package p000;

            import android.os.IBinder;
            import android.os.IInterface;
            import android.os.RemoteException;
            import com.google.android.play.core.appupdate.internal.zzd;
            import com.google.android.play.core.appupdate.internal.zze;
            import com.google.android.play.core.appupdate.internal.zzf;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class mr3 extends dn3 {

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ IBinder f13988b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ y93 f13989c;

                public mr3(y93 y93Var, IBinder iBinder) {
/* 1 */             this.f13989c = y93Var;
/* 3 */             this.f13988b = iBinder;
                }

                @Override // p000.dn3
                /* JADX INFO: renamed from: a */
                public final void mo3165a() {
                    zzf zzdVar;
/* 5 */             yr3 yr3Var = (yr3) this.f13989c.f19550b;
/* 7 */             int i = zze.f5143a;
/* 9 */             IBinder iBinder = this.f13988b;
/* 11 */            if (iBinder == null) {
/* 13 */                zzdVar = null;
                    } else {
/* 17 */                IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.play.core.appupdate.protocol.IAppUpdateService");
/* 31 */                zzdVar = iInterfaceQueryLocalInterface instanceof zzf ? (zzf) iInterfaceQueryLocalInterface : new zzd(iBinder);
                    }
/* 37 */            yr3Var.f19798m = zzdVar;
/* 39 */            C0204c5 c0204c5 = yr3Var.f19787b;
/* 46 */            c0204c5.m1530c("linkToDeath", new Object[0]);
                    try {
/* 57 */                yr3Var.f19798m.asBinder().linkToDeath(yr3Var.f19795j, 0);
                    } catch (RemoteException e) {
/* 66 */                c0204c5.m1529b(e, "linkToDeath failed", new Object[0]);
                    }
/* 69 */            yr3Var.f19792g = false;
/* 73 */            Iterator it = yr3Var.f19789d.iterator();
/* 81 */            while (it.hasNext()) {
/* 89 */                ((Runnable) it.next()).run();
                    }
/* 95 */            yr3Var.f19789d.clear();
                }
            }
