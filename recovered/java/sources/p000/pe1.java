            package p000;

            import android.os.Bundle;
            import android.service.media.MediaBrowserService;
            import android.support.v4.media.session.MediaSessionCompat;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class pe1 extends oe1 {
                @Override // android.service.media.MediaBrowserService
                public final void onLoadChildren(String str, MediaBrowserService.Result result, Bundle bundle) {
/* 1 */             MediaSessionCompat.ensureClassLoader(bundle);
/* 8 */             me1 me1Var = (me1) ((qe1) this.f14721a);
/* 10 */            me1Var.getClass();
/* 15 */            me1Var.f13706f.m757b();
                }
            }
