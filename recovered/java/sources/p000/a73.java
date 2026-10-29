            package p000;

            import android.net.Uri;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class a73 extends C1823k9 {
                @Override // p000.AbstractC1882l9
                /* JADX INFO: renamed from: b */
                public final boolean mo97b() {
/* 5 */             if (!super.mo97b() || !xe2.m9786x("MULTI_PROCESS")) {
/* 42 */                return false;
                    }
/* 16 */            Uri uri = y63.f19511a;
/* 24 */            if (b73.f2290F.mo97b()) {
/* 32 */                return d73.f7038a.getStatics().isMultiProcessEnabled();
                    }
/* 41 */            throw b73.m1295a();
                }
            }
