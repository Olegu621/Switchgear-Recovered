            package p000;

            import java.util.Iterator;
            import kotlin.jvm.functions.Function1;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
/* 13 */    public final class li0 implements Sequence {

                /* JADX INFO: renamed from: a */
                public final /* synthetic */ int f13297a = 1;

                /* JADX INFO: renamed from: b */
                public final Sequence f13298b;

                /* JADX INFO: renamed from: c */
                public final Function1 f13299c;

                public li0(Sequence sequence, Function1 function1) {
/* 4 */             sequence.getClass();
/* 10 */            this.f13298b = sequence;
/* 12 */            this.f13299c = function1;
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
                    switch (this.f13297a) {
                        case 0:
/* 14 */                    return new ki0(this);
                        default:
/* 8 */                     return new fr2(this);
                    }
                }

/* 14 */        public li0(li0 li0Var, C0197bz c0197bz) {
/* 16 */            this.f13298b = li0Var;
/* 17 */            this.f13299c = c0197bz;
                }
            }
