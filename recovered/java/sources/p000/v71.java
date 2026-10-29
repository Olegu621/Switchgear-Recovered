            package p000;

            import java.io.BufferedReader;
            import java.io.IOException;
            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class v71 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public String f17893a;

                /* JADX INFO: renamed from: b */
                public boolean f17894b;

                /* JADX INFO: renamed from: c */
                public final /* synthetic */ C2066pd f17895c;

                public v71(C2066pd c2066pd) {
/* 4 */             this.f17895c = c2066pd;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() throws IOException {
/* 4 */             if (this.f17893a == null && !this.f17894b) {
/* 16 */                String line = ((BufferedReader) this.f17895c.f15070b).readLine();
/* 20 */                this.f17893a = line;
/* 22 */                if (line == null) {
/* 24 */                    this.f17894b = true;
                        }
                    }
                    return this.f17893a != null;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 6 */             if (!hasNext()) {
/* 16 */                C1951n4.m6864o();
/* 5 */                 return null;
                    }
/* 8 */             String str = this.f17893a;
/* 10 */            this.f17893a = null;
/* 12 */            str.getClass();
/* 15 */            return str;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
