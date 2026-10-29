            package p000;

            import android.view.ViewGroup;
            import android.view.WindowId;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class u73 {

                /* JADX INFO: renamed from: a */
                public final WindowId f17409a;

                public u73(ViewGroup viewGroup) {
/* 8 */             this.f17409a = viewGroup.getWindowId();
                }

                public final boolean equals(Object obj) {
                    return (obj instanceof u73) && ((u73) obj).f17409a.equals(this.f17409a);
                }

                public final int hashCode() {
/* 3 */             return this.f17409a.hashCode();
                }
            }
