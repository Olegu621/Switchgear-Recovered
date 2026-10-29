            package p000;

            import android.view.View;
            import java.util.ArrayList;
            import java.util.WeakHashMap;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class kn0 implements Runnable {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f12887a;

                /* JADX INFO: renamed from: b */
                public final /* synthetic */ ArrayList f12888b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ ArrayList f12889c;

                /* JADX INFO: renamed from: d */
                public final /* synthetic */ ArrayList f12890d;

                /* JADX INFO: renamed from: e */
                public final /* synthetic */ ArrayList f12891e;

                public kn0(int i, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4) {
/* 4 */             this.f12887a = i;
/* 6 */             this.f12888b = arrayList;
/* 8 */             this.f12889c = arrayList2;
/* 10 */            this.f12890d = arrayList3;
/* 12 */            this.f12891e = arrayList4;
                }

                @Override // java.lang.Runnable
                public final void run() {
/* 4 */             for (int i = 0; i < this.f12887a; i++) {
/* 12 */                View view = (View) this.f12888b.get(i);
/* 20 */                String str = (String) this.f12889c.get(i);
/* 22 */                WeakHashMap weakHashMap = e33.f7494a;
/* 24 */                s23.m8384v(view, str);
/* 43 */                s23.m8384v((View) this.f12890d.get(i), (String) this.f12891e.get(i));
                    }
                }
            }
