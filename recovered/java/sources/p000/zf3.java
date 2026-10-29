            package p000;

            import com.google.firebase.analytics.FirebaseAnalytics;
            import java.util.ListIterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class zf3 extends wx2 implements ListIterator {

                /* JADX INFO: renamed from: b */
                public final int f20132b;

                /* JADX INFO: renamed from: c */
                public int f20133c;

                /* JADX INFO: renamed from: d */
                public final bg3 f20134d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public zf3(bg3 bg3Var, int i) {
/* 6 */             super(2);
/* 1 */             int size = bg3Var.size();
/* 9 */             if (i < 0 || i > size) {
/* 26 */                s80.m8425f(hu0.m4323L0(i, size, FirebaseAnalytics.Param.INDEX));
/* 30 */                throw null;
                    }
/* 13 */            this.f20132b = size;
/* 15 */            this.f20133c = i;
/* 17 */            this.f20134d = bg3Var;
                }

                /* JADX INFO: renamed from: a */
                public final Object m10349a(int i) {
/* 3 */             return this.f20134d.get(i);
                }

                @Override // java.util.ListIterator
                public final void add(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final boolean hasNext() {
                    return this.f20133c < this.f20132b;
                }

                @Override // java.util.ListIterator
                public final boolean hasPrevious() {
                    return this.f20133c > 0;
                }

                @Override // java.util.Iterator, java.util.ListIterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 7 */             int i = this.f20133c;
/* 11 */            this.f20133c = i + 1;
/* 13 */            return m10349a(i);
                }

                @Override // java.util.ListIterator
                public final int nextIndex() {
/* 1 */             return this.f20133c;
                }

                @Override // java.util.ListIterator
                public final Object previous() {
/* 5 */             if (!hasPrevious()) {
/* 18 */                C1951n4.m6864o();
/* 21 */                return null;
                    }
/* 9 */             int i = this.f20133c - 1;
/* 11 */            this.f20133c = i;
/* 13 */            return m10349a(i);
                }

                @Override // java.util.ListIterator
                public final int previousIndex() {
/* 3 */             return this.f20133c - 1;
                }

                @Override // java.util.ListIterator
                public final void set(Object obj) {
/* 6 */             throw new UnsupportedOperationException();
                }
            }
