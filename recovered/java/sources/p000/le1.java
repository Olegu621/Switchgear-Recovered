            package p000;

            import androidx.media.MediaBrowserServiceCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public class le1 extends ke1 {

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ MediaBrowserServiceCompat f13206e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public le1(MediaBrowserServiceCompat mediaBrowserServiceCompat) {
/* 3 */             super(mediaBrowserServiceCompat);
/* 1 */             this.f13206e = mediaBrowserServiceCompat;
                }

                @Override // p000.je1
                public void onCreate() {
/* 5 */             oe1 oe1Var = new oe1(this.f13206e, this);
/* 8 */             this.f12713b = oe1Var;
/* 10 */            oe1Var.onCreate();
                }
            }
