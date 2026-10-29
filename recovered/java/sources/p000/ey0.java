            package p000;

            import android.content.ClipDescription;
            import android.net.Uri;
            import android.view.inputmethod.InputContentInfo;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
/* 10 */    public final class ey0 implements fy0 {

                /* JADX INFO: renamed from: a */
                public final InputContentInfo f7919a;

                public ey0(Uri uri, ClipDescription clipDescription, Uri uri2) {
/* 9 */             this.f7919a = new InputContentInfo(uri, clipDescription, uri2);
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: a */
                public final Uri mo3378a() {
/* 3 */             return this.f7919a.getContentUri();
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: b */
                public final void mo3379b() {
/* 3 */             this.f7919a.requestPermission();
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: c */
                public final Uri mo3380c() {
/* 3 */             return this.f7919a.getLinkUri();
                }

                @Override // p000.fy0
                /* JADX INFO: renamed from: d */
                public final Object mo3381d() {
/* 1 */             return this.f7919a;
                }

                @Override // p000.fy0
                public final ClipDescription getDescription() {
/* 3 */             return this.f7919a.getDescription();
                }

/* 11 */        public ey0(Object obj) {
/* 13 */            this.f7919a = (InputContentInfo) obj;
                }
            }
