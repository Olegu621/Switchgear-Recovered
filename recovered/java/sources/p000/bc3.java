            package p000;

            import android.os.RemoteException;
            import com.google.android.gms.common.api.Status;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class bc3 {

                /* JADX INFO: renamed from: a */
                public final int f2369a;

                public bc3(int i) {
/* 4 */             this.f2369a = i;
                }

                /* JADX INFO: renamed from: e */
                public static Status m1332e(RemoteException remoteException) {
/* 38 */            return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage(), null, null);
                }

                /* JADX INFO: renamed from: a */
                public abstract void mo1333a(Status status);

                /* JADX INFO: renamed from: b */
                public abstract void mo1334b(Exception exc);

                /* JADX INFO: renamed from: c */
                public abstract void mo1335c(cb3 cb3Var);

                /* JADX INFO: renamed from: d */
                public abstract void mo1336d(we2 we2Var, boolean z);
            }
