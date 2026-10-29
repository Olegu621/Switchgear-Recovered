            package p000;

            import java.util.Iterator;
            import kotlin.jvm.functions.Function2;
            import kotlin.sequences.Sequence;
            import kotlin.text.C1849b;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public final class q70 implements Sequence {

                /* JADX INFO: renamed from: a */
                public final CharSequence f15430a;

                /* JADX INFO: renamed from: b */
                public final int f15431b;

                /* JADX INFO: renamed from: c */
                public final Function2 f15432c;

                public q70(CharSequence charSequence, int i, Function2 function2) {
/* 1 */             charSequence.getClass();
/* 7 */             this.f15430a = charSequence;
/* 9 */             this.f15431b = i;
/* 11 */            this.f15432c = function2;
                }

                @Override // kotlin.sequences.Sequence
                public final Iterator iterator() {
/* 3 */             return new C1849b(this);
                }
            }
