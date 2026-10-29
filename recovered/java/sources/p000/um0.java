            package p000;

            import androidx.fragment.app.AbstractC0111w;
            import androidx.fragment.app.Fragment;
            import java.util.ArrayList;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class um0 implements tm0 {

                /* JADX INFO: renamed from: a */
                public final int f17594a;

                /* JADX INFO: renamed from: b */
                public final int f17595b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ AbstractC0111w f17596c;

                public um0(AbstractC0111w abstractC0111w, int i, int i2) {
/* 4 */             this.f17596c = abstractC0111w;
/* 6 */             this.f17594a = i;
/* 8 */             this.f17595b = i2;
                }

                @Override // p000.tm0
                /* JADX INFO: renamed from: a */
                public final boolean mo635a(ArrayList arrayList, ArrayList arrayList2) {
/* 1 */             AbstractC0111w abstractC0111w = this.f17596c;
/* 3 */             Fragment fragment = abstractC0111w.f1515y;
/* 5 */             int i = this.f17594a;
/* 7 */             if (fragment == null || i >= 0 || !fragment.getChildFragmentManager().m690R(-1, 0)) {
/* 26 */                return abstractC0111w.m691S(arrayList, arrayList2, i, this.f17595b);
                    }
/* 16 */            return false;
                }
            }
