            package p000;

            import java.util.Iterator;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class u71 implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public final String f17393a;

                /* JADX INFO: renamed from: b */
                public int f17394b;

                /* JADX INFO: renamed from: c */
                public int f17395c;

                /* JADX INFO: renamed from: d */
                public int f17396d;

                /* JADX INFO: renamed from: e */
                public int f17397e;

                public u71(String str) {
/* 4 */             this.f17393a = str;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
                    int i;
                    int i2;
/* 1 */             int i3 = this.f17394b;
/* 5 */             if (i3 != 0) {
                        return i3 == 1;
                    }
/* 14 */            if (this.f17397e < 0) {
/* 16 */                this.f17394b = 2;
/* 3 */                 return false;
                    }
/* 19 */            String str = this.f17393a;
/* 21 */            int length = str.length();
/* 27 */            int length2 = str.length();
/* 31 */            for (int i4 = this.f17395c; i4 < length2; i4++) {
/* 33 */                char cCharAt = str.charAt(i4);
/* 41 */                if (cCharAt == '\n' || cCharAt == '\r') {
/* 48 */                    i = (cCharAt == '\r' && (i2 = i4 + 1) < str.length() && str.charAt(i2) == '\n') ? 2 : 1;
/* 66 */                    length = i4;
/* 69 */                    this.f17394b = 1;
/* 71 */                    this.f17397e = i;
/* 73 */                    this.f17396d = length;
/* 4 */                     return true;
                        }
                    }
/* 68 */            i = -1;
/* 69 */            this.f17394b = 1;
/* 71 */            this.f17397e = i;
/* 73 */            this.f17396d = length;
/* 4 */             return true;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 5 */             if (!hasNext()) {
/* 30 */                C1951n4.m6864o();
/* 33 */                return null;
                    }
/* 8 */             this.f17394b = 0;
/* 10 */            int i = this.f17396d;
/* 12 */            int i2 = this.f17395c;
/* 17 */            this.f17395c = this.f17397e + i;
/* 25 */            return this.f17393a.subSequence(i2, i).toString();
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
