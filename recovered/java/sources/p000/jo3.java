            package p000;

            import android.os.Bundle;
            import com.google.android.gms.tasks.TaskCompletionSource;
            import com.google.android.play.core.appupdate.internal.zzg;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public abstract class jo3 extends zzg {

                /* JADX INFO: renamed from: a */
                public final C0204c5 f12411a;

                /* JADX INFO: renamed from: b */
                public final TaskCompletionSource f12412b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ wq3 f12413c;

                public jo3(wq3 wq3Var, C0204c5 c0204c5, TaskCompletionSource taskCompletionSource) {
/* 1 */             this.f12413c = wq3Var;
/* 8 */             attachInterface(this, "com.google.android.play.core.appupdate.protocol.IAppUpdateServiceCallback");
/* 11 */            this.f12411a = c0204c5;
/* 13 */            this.f12412b = taskCompletionSource;
                }

                /* JADX INFO: renamed from: K */
                public void mo2443K(Bundle bundle) {
/* 7 */             this.f12413c.f18753a.m10178c(this.f12412b);
/* 17 */            this.f12411a.m1530c("onRequestInfo", new Object[0]);
                }

                public void zzb(Bundle bundle) {
/* 7 */             this.f12413c.f18753a.m10178c(this.f12412b);
/* 17 */            this.f12411a.m1530c("onCompleteUpdate", new Object[0]);
                }
            }
