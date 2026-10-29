            package p000;

            import android.os.IBinder;
            import android.os.RemoteException;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import io.sentry.C1697u2;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final /* synthetic */ class sa3 implements IBinder.DeathRecipient {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f16489a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ Object f16490b;

                public /* synthetic */ sa3(Object obj, int i) {
/* 1 */             this.f16489a = i;
/* 3 */             this.f16490b = obj;
                }

                @Override // android.os.IBinder.DeathRecipient
                public final void binderDied() {
/* 1 */             int i = this.f16489a;
/* 4 */             Object obj = this.f16490b;
                    switch (i) {
                        case 0:
/* 104 */                   z93 z93Var = (z93) obj;
/* 112 */                   z93Var.f20005b.m7756b("reportBinderDeath", new Object[0]);
/* 121 */                   if (z93Var.f20013j.get() != null) {
/* 191 */                       C1697u2.m5431g();
/* 194 */                       return;
                            }
/* 133 */                   z93Var.f20005b.m7756b("%s : Binder has died.", z93Var.f20006c);
/* 138 */                   Iterator it = z93Var.f20007d.iterator();
/* 146 */                   while (it.hasNext()) {
/* 171 */                       ((ra3) it.next()).mo2452a(new RemoteException(String.valueOf(z93Var.f20006c).concat(" : Binder has died.")));
                            }
/* 177 */                   z93Var.f20007d.clear();
                            synchronized (z93Var.f20009f) {
/* 183 */                       z93Var.m10292e();
                                break;
                            }
/* 194 */                   return;
                        default:
/* 9 */                     yr3 yr3Var = (yr3) obj;
/* 17 */                    yr3Var.f19787b.m1530c("reportBinderDeath", new Object[0]);
/* 26 */                    if (yr3Var.f19794i.get() != null) {
/* 100 */                       C1697u2.m5431g();
/* 103 */                       return;
                            }
/* 38 */                    yr3Var.f19787b.m1530c("%s : Binder has died.", yr3Var.f19788c);
/* 51 */                    for (dn3 dn3Var : yr3Var.f19789d) {
/* 73 */                        RemoteException remoteException = new RemoteException(String.valueOf(yr3Var.f19788c).concat(" : Binder has died."));
/* 76 */                        TaskCompletionSource taskCompletionSource = dn3Var.f7351a;
/* 78 */                        if (taskCompletionSource != null) {
/* 80 */                            taskCompletionSource.trySetException(remoteException);
                                }
                            }
/* 86 */                    yr3Var.f19789d.clear();
                            synchronized (yr3Var.f19791f) {
/* 92 */                        yr3Var.m10179d();
                                break;
                            }
/* 103 */                   return;
                    }
                }
            }
