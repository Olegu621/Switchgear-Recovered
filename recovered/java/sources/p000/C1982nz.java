            package p000;

            import java.util.Iterator;
            import java.util.concurrent.atomic.AtomicReference;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: renamed from: nz */
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes.dex */
            public final class C1982nz implements Sequence {

                /* JADX INFO: renamed from: a */
                public final AtomicReference f14573a;

                public C1982nz(Sequence sequence) {
/* 9 */             this.f14573a = new AtomicReference(sequence);
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
/* 8 */             Sequence sequence = (Sequence) this.f14573a.getAndSet(null);
/* 10 */            if (sequence != null) {
/* 12 */                return sequence.iterator();
                    }
/* 19 */            f42.m3656l("This sequence can be consumed only once.");
/* 3 */             return null;
                }
            }
