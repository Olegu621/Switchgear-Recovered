            package p000;

            import java.util.Iterator;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class ta0 implements Sequence, ua0 {

                /* JADX INFO: renamed from: a */
                public final Sequence f17002a;

                /* JADX INFO: renamed from: b */
                public final int f17003b;

                public ta0(Sequence sequence, int i) {
/* 1 */             sequence.getClass();
/* 7 */             this.f17002a = sequence;
/* 9 */             this.f17003b = i;
/* 11 */            if (i >= 0) {
/* 13 */                return;
                    }
/* 42 */            throw new IllegalArgumentException(("count must be non-negative, but was " + i + '.').toString());
                }

                @Override // p000.ua0
                /* JADX INFO: renamed from: a */
                public final Sequence mo7389a(int i) {
/* 3 */             int i2 = this.f17003b + i;
                    return i2 < 0 ? new ta0(this, i) : new ta0(this.f17002a, i2);
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
/* 3 */             return new sa0(this);
                }
            }
