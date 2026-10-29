            package p000;

            import android.view.View;
            import android.view.ViewGroup;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class n33 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public int f14114a;

                /* JADX INFO: renamed from: b */
                final /* synthetic */ ViewGroup f14115b;

                public n33(ViewGroup viewGroup) {
/* 4 */             this.f14115b = viewGroup;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    return this.f14114a < this.f14115b.getChildCount();
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 1 */             ViewGroup viewGroup = this.f14115b;
/* 3 */             int i = this.f14114a;
/* 7 */             this.f14114a = i + 1;
/* 9 */             View childAt = viewGroup.getChildAt(i);
/* 13 */            if (childAt != null) {
/* 15 */                return childAt;
                    }
/* 21 */            throw new IndexOutOfBoundsException();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 1 */             ViewGroup viewGroup = this.f14115b;
/* 5 */             int i = this.f14114a - 1;
/* 7 */             this.f14114a = i;
/* 9 */             viewGroup.removeViewAt(i);
                }
            }
