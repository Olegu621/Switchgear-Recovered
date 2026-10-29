            package p000;

            import androidx.media.MediaBrowserServiceCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class me1 extends le1 implements qe1 {

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ MediaBrowserServiceCompat f13706f;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public me1(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
/* 3 */             super(mediaBrowserServiceCompat);
/* 1 */             this.f13706f = mediaBrowserServiceCompat;
                }

                @Override // p000.le1, p000.je1
                public final void onCreate() {
/* 1 */             int i = re1.f16027a;
/* 7 */             pe1 pe1Var = new pe1(this.f13706f, this);
/* 10 */            this.f12713b = pe1Var;
/* 12 */            pe1Var.onCreate();
                }
            }
