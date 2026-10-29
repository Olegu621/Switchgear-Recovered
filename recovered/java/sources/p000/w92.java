            package p000;

            import java.util.ArrayList;
            import java.util.Iterator;
            import java.util.List;
            import kotlin.collections.C1839a;
            import kotlin.sequences.Sequence;
            
            /* JADX INFO: compiled from: r8-map-id-213346ccf8c7f825bb9017059f9f3b3a7bfb73d3355dfb8dfea71096f8f0bf83 */
            /* JADX INFO: loaded from: C:\Users\admin\Documents\Codex\2026-10-26\x20\outputs\switchgear-recovered\bytecode\classes2.dex */
            public class w92 extends v92 {
                /* JADX INFO: renamed from: b */
                public static List m9488b(Sequence sequence) {
/* 1 */             sequence.getClass();
/* 4 */             Iterator it = sequence.iterator();
/* 12 */            if (!it.hasNext()) {
/* 14 */                return nd0.f14189a;
                    }
/* 17 */            Object next = it.next();
/* 25 */            if (!it.hasNext()) {
/* 27 */                return C1839a.m6210b(next);
                    }
/* 34 */            ArrayList arrayList = new ArrayList();
/* 37 */            arrayList.add(next);
/* 44 */            while (it.hasNext()) {
/* 50 */                arrayList.add(it.next());
                    }
/* 54 */            return arrayList;
                }
            }
