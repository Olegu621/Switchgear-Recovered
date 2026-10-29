            package kotlin.text;

            import java.util.Iterator;
            import kotlin.Pair;
            import kotlin.ranges.IntRange;
            import p000.AbstractC0886en;
            import p000.C1951n4;
            import p000.q70;
            import p000.r02;
            import p000.r21;
            
            /* JADX INFO: renamed from: kotlin.text.b */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class C1849b implements Iterator, r21 {

                /* JADX INFO: renamed from: a */
                public int f12939a = -1;

                /* JADX INFO: renamed from: b */
                public int f12940b;

                /* JADX INFO: renamed from: c */
                public int f12941c;

                /* JADX INFO: renamed from: d */
                public IntRange f12942d;

                /* JADX INFO: renamed from: e */
                public int f12943e;

                /* JADX INFO: renamed from: f */
                public final /* synthetic */ q70 f12944f;

                public C1849b(q70 q70Var) {
/* 4 */             this.f12944f = q70Var;
/* 11 */            int length = q70Var.f15430a.length();
/* 15 */            if (length < 0) {
/* 34 */                C1951n4.m6859j(AbstractC0886en.m3505i(length, "Cannot coerce value to an empty range: maximum ", " is less than minimum 0."));
/* 38 */                throw null;
                    }
/* 17 */            length = length >= 0 ? 0 : length;
/* 21 */            this.f12940b = length;
/* 23 */            this.f12941c = length;
                }

                /* JADX WARN: Code duplicated, block: B:10:0x001c  */
                /* JADX WARN: Code duplicated, block: B:12:0x0022 A[ADDED_TO_REGION, REMOVE] */
                /* JADX WARN: Code duplicated, block: B:18:0x006f  */
                /* JADX INFO: renamed from: a */
                public final void m6252a() {
                    Pair pair;
/* 1 */             q70 q70Var = this.f12944f;
/* 3 */             CharSequence charSequence = q70Var.f15430a;
/* 5 */             int i = this.f12941c;
/* 8 */             if (i < 0) {
/* 10 */                this.f12939a = 0;
/* 13 */                this.f12942d = null;
/* 15 */                return;
                    }
/* 16 */            int i2 = q70Var.f15431b;
/* 20 */            if (i2 > 0) {
/* 24 */                int i3 = this.f12943e + 1;
/* 25 */                this.f12943e = i3;
/* 27 */                if (i3 >= i2) {
/* 46 */                    this.f12942d = new IntRange(this.f12940b, StringsKt__StringsKt.m6242n(charSequence), 1);
/* 48 */                    this.f12941c = -1;
                        } else if (i > charSequence.length() && (pair = (Pair) q70Var.f15432c.invoke(charSequence, Integer.valueOf(this.f12941c))) != null) {
/* 87 */                    int iIntValue = ((Number) pair.f12908a).intValue();
/* 95 */                    int iIntValue2 = ((Number) pair.f12909b).intValue();
/* 105 */                   this.f12942d = r02.m8048e(this.f12940b, iIntValue);
/* 107 */                   int i4 = iIntValue + iIntValue2;
/* 108 */                   this.f12940b = i4;
/* 114 */                   this.f12941c = i4 + (iIntValue2 == 0 ? 1 : 0);
                        } else {
/* 78 */                    this.f12942d = new IntRange(this.f12940b, StringsKt__StringsKt.m6242n(charSequence), 1);
/* 80 */                    this.f12941c = -1;
                        }
                    } else if (i > charSequence.length()) {
/* 46 */                this.f12942d = new IntRange(this.f12940b, StringsKt__StringsKt.m6242n(charSequence), 1);
/* 48 */                this.f12941c = -1;
                    } else {
/* 87 */                int iIntValue3 = ((Number) pair.f12908a).intValue();
/* 95 */                int iIntValue4 = ((Number) pair.f12909b).intValue();
/* 105 */               this.f12942d = r02.m8048e(this.f12940b, iIntValue3);
/* 107 */               int i5 = iIntValue3 + iIntValue4;
/* 108 */               this.f12940b = i5;
/* 114 */               this.f12941c = i5 + (iIntValue4 == 0 ? 1 : 0);
                    }
/* 116 */           this.f12939a = 1;
                }

                @Override // java.util.Iterator
                public final boolean hasNext() {
/* 4 */             if (this.f12939a == -1) {
/* 6 */                 m6252a();
                    }
                    return this.f12939a == 1;
                }

                @Override // java.util.Iterator
                public final Object next() {
/* 4 */             if (this.f12939a == -1) {
/* 6 */                 m6252a();
                    }
/* 12 */            if (this.f12939a == 0) {
/* 24 */                C1951n4.m6864o();
/* 11 */                return null;
                    }
/* 14 */            IntRange intRange = this.f12942d;
/* 16 */            intRange.getClass();
/* 19 */            this.f12942d = null;
/* 21 */            this.f12939a = -1;
/* 23 */            return intRange;
                }

                @Override // java.util.Iterator
                public final void remove() {
/* 8 */             throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }
            }
